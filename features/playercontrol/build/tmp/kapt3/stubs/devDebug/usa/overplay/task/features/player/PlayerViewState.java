package usa.overplay.task.features.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lusa/overplay/task/features/player/PlayerViewState;", "Lusa/overplay/task/commons/ui/base/BaseViewState;", "()V", "DisableVideoStart", "StartVideo", "Lusa/overplay/task/features/player/PlayerViewState$DisableVideoStart;", "Lusa/overplay/task/features/player/PlayerViewState$StartVideo;", "playercontrol_devDebug"})
public abstract class PlayerViewState implements usa.overplay.task.commons.ui.base.BaseViewState {
    
    private PlayerViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lusa/overplay/task/features/player/PlayerViewState$DisableVideoStart;", "Lusa/overplay/task/features/player/PlayerViewState;", "()V", "playercontrol_devDebug"})
    public static final class DisableVideoStart extends usa.overplay.task.features.player.PlayerViewState {
        @org.jetbrains.annotations.NotNull()
        public static final usa.overplay.task.features.player.PlayerViewState.DisableVideoStart INSTANCE = null;
        
        private DisableVideoStart() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lusa/overplay/task/features/player/PlayerViewState$StartVideo;", "Lusa/overplay/task/features/player/PlayerViewState;", "()V", "playercontrol_devDebug"})
    public static final class StartVideo extends usa.overplay.task.features.player.PlayerViewState {
        @org.jetbrains.annotations.NotNull()
        public static final usa.overplay.task.features.player.PlayerViewState.StartVideo INSTANCE = null;
        
        private StartVideo() {
            super();
        }
    }
}