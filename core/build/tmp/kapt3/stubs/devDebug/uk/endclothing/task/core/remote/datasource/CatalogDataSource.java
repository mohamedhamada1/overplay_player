package uk.endclothing.task.core.remote.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Luk/endclothing/task/core/remote/datasource/CatalogDataSource;", "Luk/endclothing/task/core/remote/datasource/BaseDataSource;", "apiService", "Luk/endclothing/task/core/remote/services/CatalogService;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Luk/endclothing/task/core/remote/services/CatalogService;Lcom/squareup/moshi/Moshi;)V", "getCatalog", "Luk/endclothing/task/core/remote/Result;", "Luk/endclothing/task/core/remote/response/BaseResponse;", "", "Luk/endclothing/task/core/remote/response/ProductResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_devDebug"})
public final class CatalogDataSource extends uk.endclothing.task.core.remote.datasource.BaseDataSource {
    private final uk.endclothing.task.core.remote.services.CatalogService apiService = null;
    
    public CatalogDataSource(@org.jetbrains.annotations.NotNull()
    uk.endclothing.task.core.remote.services.CatalogService apiService, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCatalog(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super uk.endclothing.task.core.remote.Result<uk.endclothing.task.core.remote.response.BaseResponse<java.util.List<uk.endclothing.task.core.remote.response.ProductResponse>>>> continuation) {
        return null;
    }
}