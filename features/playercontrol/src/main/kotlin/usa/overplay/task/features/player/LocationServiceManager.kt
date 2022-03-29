package usa.overplay.task.features.player

import android.Manifest
import android.content.Context
import android.location.Location
import android.os.Looper
import androidx.fragment.app.Fragment
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.switchMap
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import permissions.dispatcher.ktx.constructPermissionsRequest
import timber.log.Timber
import usa.overplay.task.commons.ui.livedata.SingleLiveData
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class LocationServiceManager @Inject constructor(
    private val lifeCycle: Lifecycle,
    private val fragment: Fragment,
    private val permissionImpl: PermissionImpl
) : DefaultLifecycleObserver {

    // FusedLocationProviderClient - Main class for receiving location updates.
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    private lateinit var locationRequest: LocationRequest

    private lateinit var locationCallback: LocationCallback

    private val _location = SingleLiveData<Location>()
    val locationUpdates: LiveData<Location> = _location // in case want UI to know about location updates


    override fun onDestroy(owner: LifecycleOwner) {
        if (lifeCycle.currentState.isAtLeast(Lifecycle.State.DESTROYED)) {
            try {
                val removeTask = fusedLocationProviderClient.removeLocationUpdates(locationCallback)
                removeTask.addOnCompleteListener { task ->
                }
            } catch (unlikely: SecurityException) {
            }
        }
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        if (lifeCycle.currentState.isAtLeast(Lifecycle.State.CREATED)) {
            startLocation()
        }
    }


    fun startLocation() = fragment.constructPermissionsRequest(
        Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION,
        onShowRationale = permissionImpl::onReadExternalShowRationale,
        onPermissionDenied = permissionImpl::onReadExternalPermissionDenied,
        onNeverAskAgain = permissionImpl::onReadExternalPermissionDenied
    ) {
        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(fragment.requireContext())

        locationRequest = LocationRequest.create().apply {
            // Sets the desired interval for active location updates. This interval is inexact. You
            // may not receive updates at all if no location sources are available, or you may
            // receive them less frequently than requested. You may also receive updates more
            // frequently than requested if other applications are requesting location at a more
            // frequent interval.
            //
            // IMPORTANT NOTE: Apps running on Android 8.0 and higher devices (regardless of
            // targetSdkVersion) may receive updates less frequently than this interval when the app
            // is no longer in the foreground.
            interval = TimeUnit.SECONDS.toMillis(LOCATION_UPDATE_INTERVAL)

            // Sets the fastest rate for active location updates. This interval is exact, and your
            // application will never receive updates more frequently than this value.
            fastestInterval = TimeUnit.SECONDS.toMillis(LOCATION_UPDATE_FAST_INTERVAL)

            // Sets the maximum time when batched location updates are delivered. Updates may be
            // delivered sooner than this interval.
            maxWaitTime = TimeUnit.SECONDS.toMillis(LOCATION_UPDATE_MAX_WAIT)

            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        }

        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                super.onLocationResult(locationResult)
                _location.value = locationResult.lastLocation
            }
        }

        try {
            fusedLocationProviderClient.requestLocationUpdates(
                locationRequest, locationCallback, Looper.getMainLooper()
            )
        } catch (unlikely: SecurityException) {
            Timber.d(unlikely)
        }
    }.launch()


    companion object {
        // this is configurable so we can do it whatever we want to achieve our business , i see this is proper setting
        const val LOCATION_UPDATE_INTERVAL = 4L
        const val LOCATION_UPDATE_FAST_INTERVAL = 3L
        const val LOCATION_UPDATE_MAX_WAIT = 7L
    }

}

