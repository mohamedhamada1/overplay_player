package uk.endclothing.task.features.catalog.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Luk/endclothing/task/features/catalog/di/CatalogListComponent;", "", "inject", "", "fragment", "Luk/endclothing/task/features/catalog/FragmentCatalogList;", "catalog_devDebug"})
@dagger.Component(modules = {uk.endclothing.task.features.catalog.di.CatalogListModule.class}, dependencies = {uk.endclothing.task.core.di.CoreComponent.class})
@uk.endclothing.task.core.di.scopes.FeatureScope()
public abstract interface CatalogListComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    uk.endclothing.task.features.catalog.FragmentCatalogList fragment);
}