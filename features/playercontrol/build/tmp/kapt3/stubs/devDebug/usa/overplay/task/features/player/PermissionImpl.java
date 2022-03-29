package usa.overplay.task.features.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lusa/overplay/task/features/player/PermissionImpl;", "", "onReadExternalPermissionDenied", "", "onReadExternalShowRationale", "request", "Lpermissions/dispatcher/PermissionRequest;", "openPermissionSettings", "playercontrol_devDebug"})
public abstract interface PermissionImpl {
    
    public abstract void onReadExternalShowRationale(@org.jetbrains.annotations.NotNull()
    permissions.dispatcher.PermissionRequest request);
    
    public abstract void onReadExternalPermissionDenied();
    
    public abstract void openPermissionSettings();
}