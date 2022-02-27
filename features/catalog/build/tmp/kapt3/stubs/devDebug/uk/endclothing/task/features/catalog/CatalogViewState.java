package uk.endclothing.task.features.catalog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogViewState;", "Luk/endclothing/task/commons/ui/base/BaseViewState;", "()V", "Empty", "Loaded", "Loading", "LoadingFailure", "Luk/endclothing/task/features/catalog/CatalogViewState$Loaded;", "Luk/endclothing/task/features/catalog/CatalogViewState$Loading;", "Luk/endclothing/task/features/catalog/CatalogViewState$LoadingFailure;", "Luk/endclothing/task/features/catalog/CatalogViewState$Empty;", "catalog_devDebug"})
public abstract class CatalogViewState implements uk.endclothing.task.commons.ui.base.BaseViewState {
    
    private CatalogViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogViewState$Loaded;", "Luk/endclothing/task/features/catalog/CatalogViewState;", "()V", "catalog_devDebug"})
    public static final class Loaded extends uk.endclothing.task.features.catalog.CatalogViewState {
        @org.jetbrains.annotations.NotNull()
        public static final uk.endclothing.task.features.catalog.CatalogViewState.Loaded INSTANCE = null;
        
        private Loaded() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogViewState$Loading;", "Luk/endclothing/task/features/catalog/CatalogViewState;", "()V", "catalog_devDebug"})
    public static final class Loading extends uk.endclothing.task.features.catalog.CatalogViewState {
        @org.jetbrains.annotations.NotNull()
        public static final uk.endclothing.task.features.catalog.CatalogViewState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogViewState$LoadingFailure;", "Luk/endclothing/task/features/catalog/CatalogViewState;", "error", "Luk/endclothing/task/core/remote/Result$Error;", "(Luk/endclothing/task/core/remote/Result$Error;)V", "getError", "()Luk/endclothing/task/core/remote/Result$Error;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "catalog_devDebug"})
    public static final class LoadingFailure extends uk.endclothing.task.features.catalog.CatalogViewState {
        @org.jetbrains.annotations.NotNull()
        private final uk.endclothing.task.core.remote.Result.Error error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final uk.endclothing.task.features.catalog.CatalogViewState.LoadingFailure copy(@org.jetbrains.annotations.NotNull()
        uk.endclothing.task.core.remote.Result.Error error) {
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
        
        public LoadingFailure(@org.jetbrains.annotations.NotNull()
        uk.endclothing.task.core.remote.Result.Error error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uk.endclothing.task.core.remote.Result.Error component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final uk.endclothing.task.core.remote.Result.Error getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogViewState$Empty;", "Luk/endclothing/task/features/catalog/CatalogViewState;", "()V", "catalog_devDebug"})
    public static final class Empty extends uk.endclothing.task.features.catalog.CatalogViewState {
        @org.jetbrains.annotations.NotNull()
        public static final uk.endclothing.task.features.catalog.CatalogViewState.Empty INSTANCE = null;
        
        private Empty() {
            super();
        }
    }
}