package usa.overplay.task.features.player

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import usa.overplay.task.commons.ui.extensions.observe
import android.os.Bundle
import android.provider.Settings
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.exoplayer2.ui.PlayerView
import permissions.dispatcher.PermissionRequest
import usa.overplay.task.commons.ui.base.BaseFragment
import usa.overplay.task.features.player.di.DaggerPlayerComponent
import usa.overplay.task.features.player.di.PlayersModule
import usa.overplay.task.features.player.extensions.showToast
import usa.overplay.task.features.playercontrol.R
import usa.overplay.task.features.playercontrol.databinding.FragmentPlayerViewBinding

/**
 * MVI is depend on UI send and receive   actions(Events) from VM , UI get updates by state and get update by data
 * so I have three important class PlayerViewEvent ,PlayerState to update UI, and last live data to just send data
 * all of this are live data to make sure from live cycle awarance
 */
class FragmentPlayer : BaseFragment<FragmentPlayerViewBinding, PlayerViewModel>(
    layoutId = R.layout.fragment_player_view
), PlayerViewProvider, PermissionImpl {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe(viewModel.state, ::handleViewState)
        observe(viewModel.startVideoTimerSeconds, ::handleTimer)
        observe(viewModel.event, ::handleEvent)
        observe(viewModel.shakeCountListener, ::shakeCount)
        lifecycle.addObserver(viewModel.expPlayerManager)
        lifecycle.addObserver(viewModel.locationServiceManager)
        lifecycle.addObserver(viewModel.sensorManager)
        observe(
            viewModel.movedMoreThanConstraint,
            ::locationChangedMoreThanConstraint
        )
        observe(
            viewModel.gryScopeChange,
            ::handleRotationChange
        )
    }

    override fun onInitDataBinding() {
        viewBinding.viewModel = this.viewModel
    }

    override fun onInitDependencyInjection() {
        DaggerPlayerComponent.builder()
            .playersModule(PlayersModule(this))
            .build().inject(this)
    }


    private fun handleTimer(sec: Int) {
        viewBinding.secondCount = sec
    }
    private fun handleRotationChange(rotationChanges: RotationChanges){

    }

    private fun locationChangedMoreThanConstraint(moreThanConstraint: Boolean) {
        if (moreThanConstraint) {
            viewModel.expPlayerManager.restart()
        }
    }

    private fun handleViewState(state: PlayerViewState) =
        when (state) {
            PlayerViewState.DisableVideoStart -> {
            }
            PlayerViewState.StartVideo -> {
                viewModel.onStartVideo()
            }

        }

    private fun handleEvent(event: PlayerViewEvent) {
        // we will use it to handle events
    }
    private fun shakeCount(count:Int){
        // use it to show shake count
    }

    override fun onDetach() {
        super.onDetach()
        lifecycle.removeObserver(viewModel.expPlayerManager)
        lifecycle.removeObserver(viewModel.locationServiceManager)
        lifecycle.removeObserver(viewModel.sensorManager)
    }


    // TODO update design
    override fun onReadExternalShowRationale(request: PermissionRequest) {
        AlertDialog.Builder(requireContext())
            .setTitle(R.string.rational_title)
            .setMessage(R.string.read_external_rational_desc)
            .setPositiveButton(R.string.allow) { dialog, _ ->
                dialog.dismiss()
                openPermissionSettings()
            }
            .setNegativeButton(R.string.deny) { _, _ -> }
            .setCancelable(false)
            .show()
    }

    override fun onReadExternalPermissionDenied() {
        context?.showToast(R.string.read_external_permission_denied_msg)
    }

    override fun openPermissionSettings() {
        openPermissionSettingsLauncher.launch(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
            data = Uri.fromParts("package", requireContext().packageName, null)
        })
    }

    private val openPermissionSettingsLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        viewModel.locationServiceManager.startLocation()
    }

    override fun providePlayerView(): PlayerView = viewBinding.videoPlayer
}