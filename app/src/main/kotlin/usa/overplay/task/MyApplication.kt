package uk.overplay.task

import android.app.Application
import timber.log.Timber
import uk.overplay.task.core.di.CoreComponent
import uk.overplay.task.core.di.DaggerCoreComponent
import uk.overplay.task.core.di.modules.ContextModule
import uk.overplay.task.core.utils.CoreComponentProvider

class MyApplication : Application(), CoreComponentProvider {

    private lateinit var coreComponent: CoreComponent

    override fun provideCoreComponent(): CoreComponent = coreComponent


    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        coreComponent = initCoreDependencyInjection()

    }

    private fun initCoreDependencyInjection(): CoreComponent {
        return DaggerCoreComponent.builder()
            .contextModule(ContextModule(this))
            .build()
    }


}
