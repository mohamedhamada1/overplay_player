package usa.overplay.task.features.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020,H\u0002R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016\u00a8\u0006/"}, d2 = {"Lusa/overplay/task/features/player/PlayerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "expPlayerManager", "Lusa/overplay/task/features/player/ExoPlayerManager;", "locationServiceManager", "Lusa/overplay/task/features/player/LocationServiceManager;", "sensorManager", "Lusa/overplay/task/features/player/CustomSensorManager;", "(Lusa/overplay/task/features/player/ExoPlayerManager;Lusa/overplay/task/features/player/LocationServiceManager;Lusa/overplay/task/features/player/CustomSensorManager;)V", "_event", "Lusa/overplay/task/commons/ui/livedata/SingleLiveData;", "Lusa/overplay/task/features/player/PlayerViewEvent;", "_startVideoTimerSeconds", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_state", "Lusa/overplay/task/features/player/PlayerViewState;", "event", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "getExpPlayerManager", "()Lusa/overplay/task/features/player/ExoPlayerManager;", "gryScopeChange", "Lusa/overplay/task/features/player/RotationChanges;", "getGryScopeChange", "getLocationServiceManager", "()Lusa/overplay/task/features/player/LocationServiceManager;", "movedMoreThanConstraint", "", "getMovedMoreThanConstraint", "oldLocation", "Landroid/location/Location;", "getSensorManager", "()Lusa/overplay/task/features/player/CustomSensorManager;", "shakeCountListener", "getShakeCountListener", "startVideoTimerSeconds", "getStartVideoTimerSeconds", "state", "getState", "onStartVideo", "", "startTimer", "Companion", "playercontrol_devDebug"})
public final class PlayerViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final usa.overplay.task.features.player.ExoPlayerManager expPlayerManager = null;
    @org.jetbrains.annotations.NotNull()
    private final usa.overplay.task.features.player.LocationServiceManager locationServiceManager = null;
    @org.jetbrains.annotations.NotNull()
    private final usa.overplay.task.features.player.CustomSensorManager sensorManager = null;
    private final usa.overplay.task.commons.ui.livedata.SingleLiveData<usa.overplay.task.features.player.PlayerViewState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<usa.overplay.task.features.player.PlayerViewState> state = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _startVideoTimerSeconds = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> startVideoTimerSeconds = null;
    private final usa.overplay.task.commons.ui.livedata.SingleLiveData<usa.overplay.task.features.player.PlayerViewEvent> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<usa.overplay.task.features.player.PlayerViewEvent> event = null;
    private android.location.Location oldLocation;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> movedMoreThanConstraint = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> shakeCountListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<usa.overplay.task.features.player.RotationChanges> gryScopeChange = null;
    @org.jetbrains.annotations.NotNull()
    public static final usa.overplay.task.features.player.PlayerViewModel.Companion Companion = null;
    public static final int START_VIDEO_AFTER = 4;
    public static final float NOTIFY_LOCATION_UPDATE_IN = 10.0F;
    public static final int SHAKE_COUNT_THRESHOLD = 2;
    
    public PlayerViewModel(@org.jetbrains.annotations.NotNull()
    usa.overplay.task.features.player.ExoPlayerManager expPlayerManager, @org.jetbrains.annotations.NotNull()
    usa.overplay.task.features.player.LocationServiceManager locationServiceManager, @org.jetbrains.annotations.NotNull()
    usa.overplay.task.features.player.CustomSensorManager sensorManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final usa.overplay.task.features.player.ExoPlayerManager getExpPlayerManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final usa.overplay.task.features.player.LocationServiceManager getLocationServiceManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final usa.overplay.task.features.player.CustomSensorManager getSensorManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<usa.overplay.task.features.player.PlayerViewState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getStartVideoTimerSeconds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<usa.overplay.task.features.player.PlayerViewEvent> getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getMovedMoreThanConstraint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getShakeCountListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<usa.overplay.task.features.player.RotationChanges> getGryScopeChange() {
        return null;
    }
    
    private final void startTimer() {
    }
    
    public final void onStartVideo() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lusa/overplay/task/features/player/PlayerViewModel$Companion;", "", "()V", "NOTIFY_LOCATION_UPDATE_IN", "", "SHAKE_COUNT_THRESHOLD", "", "START_VIDEO_AFTER", "playercontrol_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}