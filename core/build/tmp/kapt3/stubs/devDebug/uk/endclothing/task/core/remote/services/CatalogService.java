package uk.endclothing.task.core.remote.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Luk/endclothing/task/core/remote/services/CatalogService;", "", "getCatalog", "Lretrofit2/Response;", "Luk/endclothing/task/core/remote/response/BaseResponse;", "", "Luk/endclothing/task/core/remote/response/ProductResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "core_devDebug"})
public abstract interface CatalogService {
    @org.jetbrains.annotations.NotNull()
    public static final uk.endclothing.task.core.remote.services.CatalogService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "media/catalog/android_test_example.json")
    public abstract java.lang.Object getCatalog(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<uk.endclothing.task.core.remote.response.BaseResponse<java.util.List<uk.endclothing.task.core.remote.response.ProductResponse>>>> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Luk/endclothing/task/core/remote/services/CatalogService$Companion;", "", "()V", "BASE_URL", "", "core_devDebug"})
    public static final class Companion {
        private static final java.lang.String BASE_URL = "media/catalog/";
        
        private Companion() {
            super();
        }
    }
}