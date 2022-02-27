package uk.endclothing.task.features.catalog.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Luk/endclothing/task/features/catalog/di/CatalogListModule;", "", "fragment", "Luk/endclothing/task/features/catalog/FragmentCatalogList;", "(Luk/endclothing/task/features/catalog/FragmentCatalogList;)V", "provideViewModel", "Luk/endclothing/task/features/catalog/CatalogListViewModel;", "catalogRepo", "Luk/endclothing/task/core/remote/repo/catalog/CatalogRepo;", "catalog_devDebug"})
@dagger.Module()
public final class CatalogListModule {
    private final uk.endclothing.task.features.catalog.FragmentCatalogList fragment = null;
    
    public CatalogListModule(@org.jetbrains.annotations.NotNull()
    uk.endclothing.task.features.catalog.FragmentCatalogList fragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uk.endclothing.task.core.di.scopes.FeatureScope()
    public final uk.endclothing.task.features.catalog.CatalogListViewModel provideViewModel(@org.jetbrains.annotations.NotNull()
    uk.endclothing.task.core.remote.repo.catalog.CatalogRepo catalogRepo) {
        return null;
    }
}