package usa.overplay.task.features.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lusa/overplay/task/features/player/PlayerViewEvent;", "", "()V", "StartPlayVideo", "Lusa/overplay/task/features/player/PlayerViewEvent$StartPlayVideo;", "playercontrol_devDebug"})
public abstract class PlayerViewEvent {
    
    private PlayerViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lusa/overplay/task/features/player/PlayerViewEvent$StartPlayVideo;", "Lusa/overplay/task/features/player/PlayerViewEvent;", "()V", "playercontrol_devDebug"})
    public static final class StartPlayVideo extends usa.overplay.task.features.player.PlayerViewEvent {
        @org.jetbrains.annotations.NotNull()
        public static final usa.overplay.task.features.player.PlayerViewEvent.StartPlayVideo INSTANCE = null;
        
        private StartPlayVideo() {
            super();
        }
    }
}