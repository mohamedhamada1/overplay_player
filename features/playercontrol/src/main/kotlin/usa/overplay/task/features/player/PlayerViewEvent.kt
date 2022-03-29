package usa.overplay.task.features.player

// this is class to manage actions between fragment and controller
sealed class PlayerViewEvent{
    object StartPlayVideo:PlayerViewEvent()
}