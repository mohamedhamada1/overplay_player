package uk.endclothing.task.features.catalog.di


import uk.endclothing.task.core.di.scopes.FeatureScope
import dagger.Module
import dagger.Provides
import uk.endclothing.task.commons.ui.extensions.viewModel
import uk.endclothing.task.core.remote.repo.catalog.CatalogRepo
import uk.endclothing.task.features.catalog.CatalogListViewModel
import uk.endclothing.task.features.catalog.FragmentCatalogList

@Module
class CatalogListModule(private val fragment: FragmentCatalogList) {
    @FeatureScope
    @Provides
    fun provideViewModel(catalogRepo: CatalogRepo) = fragment.viewModel {
        CatalogListViewModel(
            catalogRepo
        )
    }
}
