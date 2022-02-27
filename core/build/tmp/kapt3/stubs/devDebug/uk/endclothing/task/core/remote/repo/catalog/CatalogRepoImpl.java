package uk.endclothing.task.core.remote.repo.catalog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Luk/endclothing/task/core/remote/repo/catalog/CatalogRepoImpl;", "Luk/endclothing/task/core/remote/repo/catalog/CatalogRepo;", "remote", "Luk/endclothing/task/core/remote/datasource/CatalogDataSource;", "(Luk/endclothing/task/core/remote/datasource/CatalogDataSource;)V", "getRemote", "()Luk/endclothing/task/core/remote/datasource/CatalogDataSource;", "getCatalogList", "Landroidx/lifecycle/LiveData;", "Luk/endclothing/task/core/remote/Result;", "", "Luk/endclothing/task/core/remote/ui/Product;", "core_devDebug"})
public final class CatalogRepoImpl implements uk.endclothing.task.core.remote.repo.catalog.CatalogRepo {
    @org.jetbrains.annotations.NotNull()
    private final uk.endclothing.task.core.remote.datasource.CatalogDataSource remote = null;
    
    @javax.inject.Inject()
    public CatalogRepoImpl(@org.jetbrains.annotations.NotNull()
    uk.endclothing.task.core.remote.datasource.CatalogDataSource remote) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final uk.endclothing.task.core.remote.datasource.CatalogDataSource getRemote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<java.util.List<uk.endclothing.task.core.remote.ui.Product>>> getCatalogList() {
        return null;
    }
}