package uk.endclothing.task.core.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Luk/endclothing/task/core/remote/response/BaseResponse;", "T", "", "result", "(Ljava/lang/Object;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Luk/endclothing/task/core/remote/response/BaseResponse;", "equals", "", "other", "hashCode", "", "toString", "", "core_devDebug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class BaseResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "products")
    private final T result = null;
    
    @org.jetbrains.annotations.NotNull()
    public final uk.endclothing.task.core.remote.response.BaseResponse<T> copy(@org.jetbrains.annotations.Nullable()
    T result) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BaseResponse(@org.jetbrains.annotations.Nullable()
    T result) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getResult() {
        return null;
    }
}