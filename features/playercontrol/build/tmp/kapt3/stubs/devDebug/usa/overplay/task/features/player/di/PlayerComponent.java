package usa.overplay.task.features.player.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lusa/overplay/task/features/player/di/PlayerComponent;", "", "inject", "", "fragment", "Lusa/overplay/task/features/player/FragmentPlayer;", "playercontrol_devDebug"})
@dagger.Component(modules = {usa.overplay.task.features.player.di.PlayersModule.class})
@ae.adres.dari.core.di.scopes.FeatureScope()
public abstract interface PlayerComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    usa.overplay.task.features.player.FragmentPlayer fragment);
}