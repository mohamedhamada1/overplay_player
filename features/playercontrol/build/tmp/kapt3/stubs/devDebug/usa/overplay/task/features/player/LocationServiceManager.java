package usa.overplay.task.features.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001b\u001a\u00020\u0017R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lusa/overplay/task/features/player/LocationServiceManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "lifeCycle", "Landroidx/lifecycle/Lifecycle;", "fragment", "Landroidx/fragment/app/Fragment;", "permissionImpl", "Lusa/overplay/task/features/player/PermissionImpl;", "(Landroidx/lifecycle/Lifecycle;Landroidx/fragment/app/Fragment;Lusa/overplay/task/features/player/PermissionImpl;)V", "_location", "Lusa/overplay/task/commons/ui/livedata/SingleLiveData;", "Landroid/location/Location;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "locationUpdates", "Landroidx/lifecycle/LiveData;", "getLocationUpdates", "()Landroidx/lifecycle/LiveData;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "startLocation", "Companion", "playercontrol_devDebug"})
public final class LocationServiceManager implements androidx.lifecycle.DefaultLifecycleObserver {
    private final androidx.lifecycle.Lifecycle lifeCycle = null;
    private final androidx.fragment.app.Fragment fragment = null;
    private final usa.overplay.task.features.player.PermissionImpl permissionImpl = null;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private com.google.android.gms.location.LocationRequest locationRequest;
    private com.google.android.gms.location.LocationCallback locationCallback;
    private final usa.overplay.task.commons.ui.livedata.SingleLiveData<android.location.Location> _location = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.location.Location> locationUpdates = null;
    @org.jetbrains.annotations.NotNull()
    public static final usa.overplay.task.features.player.LocationServiceManager.Companion Companion = null;
    public static final long LOCATION_UPDATE_INTERVAL = 4L;
    public static final long LOCATION_UPDATE_FAST_INTERVAL = 3L;
    public static final long LOCATION_UPDATE_MAX_WAIT = 7L;
    
    @javax.inject.Inject()
    public LocationServiceManager(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle lifeCycle, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    usa.overplay.task.features.player.PermissionImpl permissionImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.location.Location> getLocationUpdates() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    public final void startLocation() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lusa/overplay/task/features/player/LocationServiceManager$Companion;", "", "()V", "LOCATION_UPDATE_FAST_INTERVAL", "", "LOCATION_UPDATE_INTERVAL", "LOCATION_UPDATE_MAX_WAIT", "playercontrol_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}