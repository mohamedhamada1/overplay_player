package usa.overplay.task.features.player.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lusa/overplay/task/features/player/di/PlayersModule;", "", "fragment", "Lusa/overplay/task/features/player/FragmentPlayer;", "(Lusa/overplay/task/features/player/FragmentPlayer;)V", "provideExoPlayer", "Lusa/overplay/task/features/player/ExoPlayerManager;", "provideLocationService", "Lusa/overplay/task/features/player/LocationServiceManager;", "provideSensorManager", "Lusa/overplay/task/features/player/CustomSensorManager;", "provideViewModel", "Lusa/overplay/task/features/player/PlayerViewModel;", "playercontrol_devDebug"})
@dagger.Module()
public final class PlayersModule {
    private final usa.overplay.task.features.player.FragmentPlayer fragment = null;
    
    public PlayersModule(@org.jetbrains.annotations.NotNull()
    usa.overplay.task.features.player.FragmentPlayer fragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @ae.adres.dari.core.di.scopes.FeatureScope()
    public final usa.overplay.task.features.player.PlayerViewModel provideViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @ae.adres.dari.core.di.scopes.FeatureScope()
    public final usa.overplay.task.features.player.ExoPlayerManager provideExoPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @ae.adres.dari.core.di.scopes.FeatureScope()
    public final usa.overplay.task.features.player.LocationServiceManager provideLocationService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @ae.adres.dari.core.di.scopes.FeatureScope()
    public final usa.overplay.task.features.player.CustomSensorManager provideSensorManager() {
        return null;
    }
}