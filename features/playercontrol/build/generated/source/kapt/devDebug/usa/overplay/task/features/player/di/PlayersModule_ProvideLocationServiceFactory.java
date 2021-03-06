// Generated by Dagger (https://dagger.dev).
package usa.overplay.task.features.player.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import usa.overplay.task.features.player.LocationServiceManager;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlayersModule_ProvideLocationServiceFactory implements Factory<LocationServiceManager> {
  private final PlayersModule module;

  public PlayersModule_ProvideLocationServiceFactory(PlayersModule module) {
    this.module = module;
  }

  @Override
  public LocationServiceManager get() {
    return provideLocationService(module);
  }

  public static PlayersModule_ProvideLocationServiceFactory create(PlayersModule module) {
    return new PlayersModule_ProvideLocationServiceFactory(module);
  }

  public static LocationServiceManager provideLocationService(PlayersModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideLocationService());
  }
}
