package uk.endclothing.task.core.di


import uk.endclothing.task.core.di.scopes.AppScope

import android.app.Application
import android.content.Context
import dagger.Component
import uk.endclothing.task.core.di.modules.ContextModule
import uk.endclothing.task.core.di.modules.NetworkModule
import uk.endclothing.task.core.di.modules.RepositoryModule
import uk.endclothing.task.core.remote.repo.catalog.CatalogRepo

@AppScope
@Component(
    modules = [
        ContextModule::class,
        NetworkModule::class,
        RepositoryModule::class
    ]
)
interface CoreComponent {

    fun context(): Context

    fun application(): Application
    fun catalogRepo(): CatalogRepo

}
