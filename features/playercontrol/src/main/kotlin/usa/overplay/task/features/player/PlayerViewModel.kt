package usa.overplay.task.features.player

import android.location.Location
import androidx.lifecycle.DefaultLifecycleObserver
import usa.overplay.task.commons.ui.extensions.toSingleMediatorLiveData
import usa.overplay.task.commons.ui.livedata.SingleLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import usa.overplay.task.features.player.extensions.countDownSeconds

import kotlinx.coroutines.flow.collect

class PlayerViewModel(
    val expPlayerManager: ExoPlayerManager,
    val locationServiceManager: LocationServiceManager,
    val sensorManager: CustomSensorManager
) : ViewModel(), DefaultLifecycleObserver {

    private val _state = SingleLiveData<PlayerViewState>()
    val state: LiveData<PlayerViewState> = _state

    private val _startVideoTimerSeconds = MutableLiveData(0)
    val startVideoTimerSeconds: LiveData<Int> = _startVideoTimerSeconds

    private val _event = SingleLiveData<PlayerViewEvent>()
    val event: LiveData<PlayerViewEvent> =
        _event.toSingleMediatorLiveData { event, mediatorLiveData ->
            when (event) {
                PlayerViewEvent.StartPlayVideo -> {
                    startTimer()
                    true
                }

                else -> false
            }
        }

    private var oldLocation: Location? = null

    val movedMoreThanConstraint: LiveData<Boolean> = locationServiceManager.locationUpdates
        .switchMap { newLocation ->
            if (oldLocation == null)
                oldLocation = newLocation
            oldLocation?.distanceTo(newLocation)?.takeIf { it > NOTIFY_LOCATION_UPDATE_IN }?.let {
                oldLocation = newLocation
                MutableLiveData(true)
            } ?: MutableLiveData(false)

        }

    val shakeCountListener: LiveData<Int> = sensorManager.shakeCount.map { shakeCount ->
        if (shakeCount > SHAKE_COUNT_THRESHOLD) {
            expPlayerManager.pause()
        }
        shakeCount
    }


    val gryScopeChange: LiveData<RotationChanges> =
        sensorManager.rotationChange.map { rotationChange ->
            if (rotationChange.z > 0.5f) {
                expPlayerManager.seekForward()
            } else if (rotationChange.z < -0.5f) {
                expPlayerManager.seekBackward()
            }

            if (rotationChange.x > 0.5f) {
                expPlayerManager.volumeUp()
            }
            if (rotationChange.x > -0.5f) {
                expPlayerManager.volumeDown()
            }
            rotationChange
        }

    init {
        _event.value = PlayerViewEvent.StartPlayVideo
    }

    private fun startTimer() {
        _startVideoTimerSeconds.postValue(START_VIDEO_AFTER)
        viewModelScope.launch(Dispatchers.Default) {
            START_VIDEO_AFTER.countDownSeconds()
                .onStart { _state.postValue(PlayerViewState.DisableVideoStart) }
                .onCompletion {
                    _state.postValue(PlayerViewState.StartVideo)
                    expPlayerManager.isPlayWhenReady = true
                }
                .collect {
                    _startVideoTimerSeconds.postValue(it)
                }
        }
    }


    fun onStartVideo() {
        expPlayerManager.restart()
    }


    companion object {
        const val START_VIDEO_AFTER = 4

        //notifyLocationUpdateIn
        const val NOTIFY_LOCATION_UPDATE_IN = 10f

        const val SHAKE_COUNT_THRESHOLD = 2
    }


}
