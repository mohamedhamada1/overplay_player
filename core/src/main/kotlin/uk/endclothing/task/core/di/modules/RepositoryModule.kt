package uk.endclothing.task.core.di.modules
import uk.endclothing.task.core.di.scopes.AppScope
import dagger.Binds
import dagger.Module
import uk.endclothing.task.core.remote.repo.catalog.CatalogRepo
import uk.endclothing.task.core.remote.repo.catalog.CatalogRepoImpl

@Module
abstract class RepositoryModule {

    @AppScope
    @Binds
    abstract fun bindUserRepo(repo: CatalogRepoImpl): CatalogRepo

}
