// Generated by Dagger (https://dagger.dev).
package usa.overplay.task.features.player;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomSensorManager_Factory implements Factory<CustomSensorManager> {
  private final Provider<Lifecycle> lifeCycleProvider;

  private final Provider<Context> contextProvider;

  public CustomSensorManager_Factory(Provider<Lifecycle> lifeCycleProvider,
      Provider<Context> contextProvider) {
    this.lifeCycleProvider = lifeCycleProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public CustomSensorManager get() {
    return newInstance(lifeCycleProvider.get(), contextProvider.get());
  }

  public static CustomSensorManager_Factory create(Provider<Lifecycle> lifeCycleProvider,
      Provider<Context> contextProvider) {
    return new CustomSensorManager_Factory(lifeCycleProvider, contextProvider);
  }

  public static CustomSensorManager newInstance(Lifecycle lifeCycle, Context context) {
    return new CustomSensorManager(lifeCycle, context);
  }
}
