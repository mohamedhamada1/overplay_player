package uk.endclothing.task.core.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luk/endclothing/task/core/remote/response/BaseErrorResponse;", "", "error", "Luk/endclothing/task/core/remote/response/ErrorResponse;", "(Luk/endclothing/task/core/remote/response/ErrorResponse;)V", "getError", "()Luk/endclothing/task/core/remote/response/ErrorResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_devDebug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class BaseErrorResponse {
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "result")
    private final uk.endclothing.task.core.remote.response.ErrorResponse error = null;
    
    @org.jetbrains.annotations.NotNull()
    public final uk.endclothing.task.core.remote.response.BaseErrorResponse copy(@org.jetbrains.annotations.Nullable()
    uk.endclothing.task.core.remote.response.ErrorResponse error) {
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
    
    public BaseErrorResponse(@org.jetbrains.annotations.Nullable()
    uk.endclothing.task.core.remote.response.ErrorResponse error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final uk.endclothing.task.core.remote.response.ErrorResponse component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final uk.endclothing.task.core.remote.response.ErrorResponse getError() {
        return null;
    }
}