package uk.endclothing.task.features.catalog.di

import uk.endclothing.task.core.di.scopes.FeatureScope
import dagger.Component
import uk.endclothing.task.core.di.CoreComponent
import uk.endclothing.task.features.catalog.FragmentCatalogList

@FeatureScope
@Component(
    modules = [CatalogListModule::class],
    dependencies = [CoreComponent::class]
)
interface CatalogListComponent {
    fun inject(fragment: FragmentCatalogList)
}
