// Generated by Dagger (https://dagger.dev).
package uk.endclothing.task.core.di.modules;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideMoshiFactory implements Factory<Moshi> {
  private final NetworkModule module;

  public NetworkModule_ProvideMoshiFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Moshi get() {
    return provideMoshi(module);
  }

  public static NetworkModule_ProvideMoshiFactory create(NetworkModule module) {
    return new NetworkModule_ProvideMoshiFactory(module);
  }

  public static Moshi provideMoshi(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMoshi());
  }
}
