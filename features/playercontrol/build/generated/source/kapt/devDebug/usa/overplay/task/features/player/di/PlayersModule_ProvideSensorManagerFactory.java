// Generated by Dagger (https://dagger.dev).
package usa.overplay.task.features.player.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import usa.overplay.task.features.player.CustomSensorManager;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlayersModule_ProvideSensorManagerFactory implements Factory<CustomSensorManager> {
  private final PlayersModule module;

  public PlayersModule_ProvideSensorManagerFactory(PlayersModule module) {
    this.module = module;
  }

  @Override
  public CustomSensorManager get() {
    return provideSensorManager(module);
  }

  public static PlayersModule_ProvideSensorManagerFactory create(PlayersModule module) {
    return new PlayersModule_ProvideSensorManagerFactory(module);
  }

  public static CustomSensorManager provideSensorManager(PlayersModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSensorManager());
  }
}