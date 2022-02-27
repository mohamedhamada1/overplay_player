package uk.endclothing.task.core.remote;

import java.lang.System;

/**
 * A generic class that holds a value with its loading status.
 *
 * Result is usually created by the Repository classes where they return
 * `LiveData<Result<T>>`.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0004*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n\u00a8\u0006\u000b"}, d2 = {"Luk/endclothing/task/core/remote/Result;", "T", "", "()V", "Companion", "Error", "Loading", "Success", "Luk/endclothing/task/core/remote/Result$Success;", "Luk/endclothing/task/core/remote/Result$Error;", "Luk/endclothing/task/core/remote/Result$Loading;", "core_devDebug"})
public abstract class Result<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    public static final uk.endclothing.task.core.remote.Result.Companion Companion = null;
    private static final int ERROR_CODE_UNKNOWN = -1;
    
    private Result() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Luk/endclothing/task/core/remote/Result$Success;", "T", "", "Luk/endclothing/task/core/remote/Result;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Luk/endclothing/task/core/remote/Result$Success;", "equals", "", "other", "hashCode", "", "toString", "", "core_devDebug"})
    public static final class Success<T extends java.lang.Object> extends uk.endclothing.task.core.remote.Result<T> {
        @org.jetbrains.annotations.NotNull()
        private final T data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final uk.endclothing.task.core.remote.Result.Success<T> copy(@org.jetbrains.annotations.NotNull()
        T data) {
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
        
        public Success(@org.jetbrains.annotations.NotNull()
        T data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Luk/endclothing/task/core/remote/Result$Error;", "Luk/endclothing/task/core/remote/Result;", "", "errorCode", "", "errorCause", "", "errorMessage", "", "(ILjava/lang/Throwable;Ljava/lang/String;)V", "getErrorCause", "()Ljava/lang/Throwable;", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "core_devDebug"})
    public static final class Error extends uk.endclothing.task.core.remote.Result {
        private final int errorCode = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Throwable errorCause = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorMessage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final uk.endclothing.task.core.remote.Result.Error copy(int errorCode, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable errorCause, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage) {
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
        
        public Error() {
            super();
        }
        
        public Error(int errorCode, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable errorCause, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getErrorCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable getErrorCause() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Luk/endclothing/task/core/remote/Result$Loading;", "Luk/endclothing/task/core/remote/Result;", "", "()V", "core_devDebug"})
    public static final class Loading extends uk.endclothing.task.core.remote.Result {
        @org.jetbrains.annotations.NotNull()
        public static final uk.endclothing.task.core.remote.Result.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\r\"\b\b\u0001\u0010\u0010*\u00020\u00012\u0006\u0010\u0011\u001a\u0002H\u0010\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Luk/endclothing/task/core/remote/Result$Companion;", "", "()V", "ERROR_CODE_UNKNOWN", "", "error", "Luk/endclothing/task/core/remote/Result$Error;", "errorCause", "", "errorMessage", "", "errorCode", "loading", "Luk/endclothing/task/core/remote/Result;", "", "success", "T", "data", "(Ljava/lang/Object;)Luk/endclothing/task/core/remote/Result;", "core_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>uk.endclothing.task.core.remote.Result<T> success(@org.jetbrains.annotations.NotNull()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uk.endclothing.task.core.remote.Result.Error error(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable errorCause, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage, int errorCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uk.endclothing.task.core.remote.Result loading() {
            return null;
        }
    }
}