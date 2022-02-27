package uk.endclothing.task.core.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0010H\u0007\u00a8\u0006\u0017"}, d2 = {"Luk/endclothing/task/core/di/modules/NetworkModule;", "", "()V", "provideCatalogDatasource", "Luk/endclothing/task/core/remote/datasource/CatalogDataSource;", "service", "Luk/endclothing/task/core/remote/services/CatalogService;", "moshi", "Lcom/squareup/moshi/Moshi;", "provideCatalogService", "retrofit", "Lretrofit2/Retrofit;", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideMoshi", "provideMoshiConverterFactory", "Lretrofit2/Converter$Factory;", "provideOKHttpClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "provideRetrofit", "client", "factory", "core_devDebug"})
@dagger.Module()
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uk.endclothing.task.core.di.scopes.AppScope()
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uk.endclothing.task.core.di.scopes.AppScope()
    public final okhttp3.OkHttpClient provideOKHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uk.endclothing.task.core.di.scopes.AppScope()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uk.endclothing.task.core.di.scopes.AppScope()
    public final retrofit2.Converter.Factory provideMoshiConverterFactory(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uk.endclothing.task.core.di.scopes.AppScope()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter.Factory factory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uk.endclothing.task.core.di.scopes.AppScope()
    public final uk.endclothing.task.core.remote.services.CatalogService provideCatalogService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @uk.endclothing.task.core.di.scopes.AppScope()
    public final uk.endclothing.task.core.remote.datasource.CatalogDataSource provideCatalogDatasource(@org.jetbrains.annotations.NotNull()
    uk.endclothing.task.core.remote.services.CatalogService service, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
}