package usa.overplay.task.features.player

import android.content.Context
import android.content.Context.SENSOR_SERVICE
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.util.Half.EPSILON
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import usa.overplay.task.commons.ui.livedata.SingleLiveData
import javax.inject.Inject
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt


class CustomSensorManager @Inject constructor(
    private val lifeCycle: Lifecycle,
    private val context: Context
) :
    DefaultLifecycleObserver, SensorEventListener {

    private var sensorManager: SensorManager? = null
    private var mShakeTimestamp: Long = 0
    private var mShakeCount: Int = 0


    private val _shakeCount = SingleLiveData<Int>()
    val shakeCount: LiveData<Int> = _shakeCount // in case want UI to know about location updates

    private val _rotationChange = SingleLiveData<RotationChanges>()
    val rotationChange: LiveData<RotationChanges> = _rotationChange // in case want UI to know about location updates


    override fun onSensorChanged(event: SensorEvent?) {
        event?.let {
            handleShakeSensor(it)
            handleGyroScopeSensor(it)
            //handleGyroScopeSensorForAngle(it)
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, p1: Int) {

    }

    private fun handleShakeSensor(event: SensorEvent) {
        if (event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
            val x = event.values[0]
            val y = event.values[1]
            val z = event.values[2]

            val gX = x / SensorManager.GRAVITY_EARTH
            val gY = y / SensorManager.GRAVITY_EARTH
            val gZ = z / SensorManager.GRAVITY_EARTH

            // gForce will be close to 1 when there is no movement.
            val gForce = Math.sqrt((gX * gX + gY * gY + gZ * gZ).toDouble()).toFloat()

            if (gForce > SHAKE_THRESHOLD_GRAVITY) {
                val now = System.currentTimeMillis()
                // ignore shake events too close to each other (500ms)
                if (mShakeTimestamp + SHAKE_SLOP_TIME_MS > now) {
                    return
                }

                // reset the shake count after 3 seconds of no shakes
                if (mShakeTimestamp + SHAKE_COUNT_RESET_TIME_MS < now) {
                    mShakeCount = 0
                }

                mShakeTimestamp = now
                mShakeCount++
                _shakeCount.value = mShakeCount
            }
        }
    }

// i just kept it simple for now i have to get angle from that values
    private fun handleGyroScopeSensor(event: SensorEvent) {
        if (event.sensor.type == Sensor.TYPE_GYROSCOPE){
            _rotationChange.value = RotationChanges(event.values[0],event.values[1],event.values[2])
        }

    }
    // TODO should get angle by this way but i didn't find any clear documentation
    // i belive i have to read more in that area related to gryscope sensor
    private fun handleGyroScopeSensorForAngle(event: SensorEvent) {
        // This timestep's delta rotation to be multiplied by the current rotation
        // after computing it from the gyro sample data.
        if (event.sensor.type == Sensor.TYPE_GYROSCOPE) {
            if (timestamp != 0L) {
                val dT = (event.timestamp - timestamp) * NS2S
                // Axis of the rotation sample, not normalized yet.
                var axisX: Float = event.values[0]
                var axisY: Float = event.values[1]
                var axisZ: Float = event.values[2]

                // Calculate the angular speed of the sample
                val omegaMagnitude: Float = sqrt(axisX * axisX + axisY * axisY + axisZ * axisZ)

                // Normalize the rotation vector if it's big enough to get the axis
                // (that is, EPSILON should represent your maximum allowable margin of error)
                if (omegaMagnitude > EPSILON) {
                    axisX /= omegaMagnitude
                    axisY /= omegaMagnitude
                    axisZ /= omegaMagnitude
                }

                // Integrate around this axis with the angular speed by the timestep
                // in order to get a delta rotation from this sample over the timestep
                // We will convert this axis-angle representation of the delta rotation
                // into a quaternion before turning it into the rotation matrix.
                val thetaOverTwo: Float = omegaMagnitude * dT / 2.0f
                val sinThetaOverTwo: Float = sin(thetaOverTwo)
                val cosThetaOverTwo: Float = cos(thetaOverTwo)
                deltaRotationVector[0] = sinThetaOverTwo * axisX
                deltaRotationVector[1] = sinThetaOverTwo * axisY
                deltaRotationVector[2] = sinThetaOverTwo * axisZ
                deltaRotationVector[3] = cosThetaOverTwo

                val deltaRotationMatrix = FloatArray(9) { 0f }
                SensorManager.getRotationMatrixFromVector(deltaRotationMatrix, deltaRotationVector)


                val product = FloatArray(10)
                for (i in deltaRotationMatrix.indices) {
                    for (element in deltaRotationVector) {
                        product[i] = deltaRotationMatrix[i] * element
                    }
                }

                // User code should concatenate the delta rotation we computed with the current rotation
                // in order to get the updated rotation.
                // rotationCurrent = rotationCurrent * deltaRotationMatrix;
                // TODO should handle this, as documentation this should give me correct angle, but this doen't happen

            }
            timestamp = event.timestamp

        }
    }


    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        if (lifeCycle.currentState.isAtLeast(Lifecycle.State.CREATED))
            sensorManager = context.getSystemService(SENSOR_SERVICE) as SensorManager?
    }


    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        if (lifeCycle.currentState.isAtLeast(Lifecycle.State.CREATED)) {
            sensorManager?.registerListener(
                this, sensorManager!!.getDefaultSensor(
                    Sensor.TYPE_ACCELEROMETER
                ), SensorManager.SENSOR_DELAY_NORMAL
            )
            sensorManager?.registerListener(
                this, sensorManager!!.getDefaultSensor(
                    Sensor.TYPE_GYROSCOPE
                ), SensorManager.SENSOR_DELAY_NORMAL
            )
        }
    }


    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        if (lifeCycle.currentState.isAtLeast(Lifecycle.State.RESUMED))
            sensorManager!!.unregisterListener(this)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        sensorManager = null
    }

    companion object {
        // for TYPE_ACCELEROMETER
        private const val SHAKE_THRESHOLD_GRAVITY = 2.7f
        private const val SHAKE_SLOP_TIME_MS = 500
        private const val SHAKE_COUNT_RESET_TIME_MS = 3000

        private val NS2S = 1.0f / 1000000000.0f
        private val deltaRotationVector = FloatArray(4) { 0f }
        private var timestamp = 0L


    }

}
data class RotationChanges(val x:Float,val y:Float,val z:Float)
