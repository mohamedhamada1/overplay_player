package usa.overplay.task.features.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\fH\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010(\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006*"}, d2 = {"Lusa/overplay/task/features/player/CustomSensorManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/hardware/SensorEventListener;", "lifeCycle", "Landroidx/lifecycle/Lifecycle;", "context", "Landroid/content/Context;", "(Landroidx/lifecycle/Lifecycle;Landroid/content/Context;)V", "_rotationChange", "Lusa/overplay/task/commons/ui/livedata/SingleLiveData;", "Lusa/overplay/task/features/player/RotationChanges;", "_shakeCount", "", "mShakeCount", "mShakeTimestamp", "", "rotationChange", "Landroidx/lifecycle/LiveData;", "getRotationChange", "()Landroidx/lifecycle/LiveData;", "sensorManager", "Landroid/hardware/SensorManager;", "shakeCount", "getShakeCount", "handleGyroScopeSensor", "", "event", "Landroid/hardware/SensorEvent;", "handleGyroScopeSensorForAngle", "handleShakeSensor", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "p1", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "onPause", "onResume", "onSensorChanged", "Companion", "playercontrol_devDebug"})
public final class CustomSensorManager implements androidx.lifecycle.DefaultLifecycleObserver, android.hardware.SensorEventListener {
    private final androidx.lifecycle.Lifecycle lifeCycle = null;
    private final android.content.Context context = null;
    private android.hardware.SensorManager sensorManager;
    private long mShakeTimestamp = 0L;
    private int mShakeCount = 0;
    private final usa.overplay.task.commons.ui.livedata.SingleLiveData<java.lang.Integer> _shakeCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> shakeCount = null;
    private final usa.overplay.task.commons.ui.livedata.SingleLiveData<usa.overplay.task.features.player.RotationChanges> _rotationChange = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<usa.overplay.task.features.player.RotationChanges> rotationChange = null;
    @org.jetbrains.annotations.NotNull()
    public static final usa.overplay.task.features.player.CustomSensorManager.Companion Companion = null;
    private static final float SHAKE_THRESHOLD_GRAVITY = 2.7F;
    private static final int SHAKE_SLOP_TIME_MS = 500;
    private static final int SHAKE_COUNT_RESET_TIME_MS = 3000;
    private static final float NS2S = 1.0E-9F;
    private static final float[] deltaRotationVector = null;
    private static long timestamp = 0L;
    
    @javax.inject.Inject()
    public CustomSensorManager(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle lifeCycle, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getShakeCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<usa.overplay.task.features.player.RotationChanges> getRotationChange() {
        return null;
    }
    
    @java.lang.Override()
    public void onSensorChanged(@org.jetbrains.annotations.Nullable()
    android.hardware.SensorEvent event) {
    }
    
    @java.lang.Override()
    public void onAccuracyChanged(@org.jetbrains.annotations.Nullable()
    android.hardware.Sensor sensor, int p1) {
    }
    
    private final void handleShakeSensor(android.hardware.SensorEvent event) {
    }
    
    private final void handleGyroScopeSensor(android.hardware.SensorEvent event) {
    }
    
    private final void handleGyroScopeSensorForAngle(android.hardware.SensorEvent event) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override()
    public void onResume(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override()
    public void onPause(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override()
    public void onDestroy(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lusa/overplay/task/features/player/CustomSensorManager$Companion;", "", "()V", "NS2S", "", "SHAKE_COUNT_RESET_TIME_MS", "", "SHAKE_SLOP_TIME_MS", "SHAKE_THRESHOLD_GRAVITY", "deltaRotationVector", "", "timestamp", "", "playercontrol_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}