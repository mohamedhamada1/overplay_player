package usa.overplay.task.features.player;

import java.lang.System;

/**
 * MVI is depend on UI send and receive   actions(Events) from VM , UI get updates by state and get update by data
 * so I have three important class PlayerViewEvent ,PlayerState to update UI, and last live data to just send data
 * all of this are live data to make sure from live cycle awarance
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016J\b\u0010\u001e\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0014H\u0002R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lusa/overplay/task/features/player/FragmentPlayer;", "Lusa/overplay/task/commons/ui/base/BaseFragment;", "Lusa/overplay/task/features/playercontrol/databinding/FragmentPlayerViewBinding;", "Lusa/overplay/task/features/player/PlayerViewModel;", "Lusa/overplay/task/features/player/PlayerViewProvider;", "Lusa/overplay/task/features/player/PermissionImpl;", "()V", "openPermissionSettingsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "handleEvent", "", "event", "Lusa/overplay/task/features/player/PlayerViewEvent;", "handleRotationChange", "rotationChanges", "Lusa/overplay/task/features/player/RotationChanges;", "handleTimer", "sec", "", "handleViewState", "state", "Lusa/overplay/task/features/player/PlayerViewState;", "locationChangedMoreThanConstraint", "moreThanConstraint", "", "onDetach", "onInitDataBinding", "onInitDependencyInjection", "onReadExternalPermissionDenied", "onReadExternalShowRationale", "request", "Lpermissions/dispatcher/PermissionRequest;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openPermissionSettings", "providePlayerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "shakeCount", "count", "playercontrol_devDebug"})
public final class FragmentPlayer extends usa.overplay.task.commons.ui.base.BaseFragment<usa.overplay.task.features.playercontrol.databinding.FragmentPlayerViewBinding, usa.overplay.task.features.player.PlayerViewModel> implements usa.overplay.task.features.player.PlayerViewProvider, usa.overplay.task.features.player.PermissionImpl {
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> openPermissionSettingsLauncher = null;
    
    public FragmentPlayer() {
        super(0);
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onInitDataBinding() {
    }
    
    @java.lang.Override()
    public void onInitDependencyInjection() {
    }
    
    private final void handleTimer(int sec) {
    }
    
    private final void handleRotationChange(usa.overplay.task.features.player.RotationChanges rotationChanges) {
    }
    
    private final void locationChangedMoreThanConstraint(boolean moreThanConstraint) {
    }
    
    private final void handleViewState(usa.overplay.task.features.player.PlayerViewState state) {
    }
    
    private final void handleEvent(usa.overplay.task.features.player.PlayerViewEvent event) {
    }
    
    private final void shakeCount(int count) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onReadExternalShowRationale(@org.jetbrains.annotations.NotNull()
    permissions.dispatcher.PermissionRequest request) {
    }
    
    @java.lang.Override()
    public void onReadExternalPermissionDenied() {
    }
    
    @java.lang.Override()
    public void openPermissionSettings() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.android.exoplayer2.ui.PlayerView providePlayerView() {
        return null;
    }
}