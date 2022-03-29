// Generated by Dagger (https://dagger.dev).
package usa.overplay.task.features.player.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import usa.overplay.task.features.player.PlayerViewModel;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlayersModule_ProvideViewModelFactory implements Factory<PlayerViewModel> {
  private final PlayersModule module;

  public PlayersModule_ProvideViewModelFactory(PlayersModule module) {
    this.module = module;
  }

  @Override
  public PlayerViewModel get() {
    return provideViewModel(module);
  }

  public static PlayersModule_ProvideViewModelFactory create(PlayersModule module) {
    return new PlayersModule_ProvideViewModelFactory(module);
  }

  public static PlayerViewModel provideViewModel(PlayersModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideViewModel());
  }
}