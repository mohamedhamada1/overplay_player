package uk.endclothing.task.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Luk/endclothing/task/core/di/CoreComponent;", "", "application", "Landroid/app/Application;", "catalogRepo", "Luk/endclothing/task/core/remote/repo/catalog/CatalogRepo;", "context", "Landroid/content/Context;", "core_devDebug"})
@dagger.Component(modules = {uk.endclothing.task.core.di.modules.ContextModule.class, uk.endclothing.task.core.di.modules.NetworkModule.class, uk.endclothing.task.core.di.modules.RepositoryModule.class})
@uk.endclothing.task.core.di.scopes.AppScope()
public abstract interface CoreComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Application application();
    
    @org.jetbrains.annotations.NotNull()
    public abstract uk.endclothing.task.core.remote.repo.catalog.CatalogRepo catalogRepo();
}