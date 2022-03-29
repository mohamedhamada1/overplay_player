package usa.overplay.task.features.player


import usa.overplay.task.commons.ui.base.BaseViewState

sealed class PlayerViewState : BaseViewState {
    object DisableVideoStart : PlayerViewState()
    object StartVideo : PlayerViewState()
}
