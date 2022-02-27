package uk.endclothing.task.core.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aM\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"getResult", "Luk/endclothing/task/core/remote/Result;", "T", "", "moshi", "Lcom/squareup/moshi/Moshi;", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lcom/squareup/moshi/Moshi;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getErrorResult", "Luk/endclothing/task/core/remote/Result$Error;", "Lretrofit2/HttpException;", "core_devDebug"})
public final class GetResultBaseKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object getResult(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> call, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super uk.endclothing.task.core.remote.Result<? extends T>> continuation) {
        return null;
    }
    
    private static final uk.endclothing.task.core.remote.Result.Error getErrorResult(retrofit2.HttpException $this$getErrorResult, com.squareup.moshi.Moshi moshi) {
        return null;
    }
}