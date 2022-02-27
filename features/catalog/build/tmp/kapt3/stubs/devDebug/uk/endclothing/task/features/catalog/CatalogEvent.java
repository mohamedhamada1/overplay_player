package uk.endclothing.task.features.catalog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogEvent;", "", "()V", "Dismiss", "LoadCatalogList", "Luk/endclothing/task/features/catalog/CatalogEvent$LoadCatalogList;", "Luk/endclothing/task/features/catalog/CatalogEvent$Dismiss;", "catalog_devDebug"})
public abstract class CatalogEvent {
    
    private CatalogEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogEvent$LoadCatalogList;", "Luk/endclothing/task/features/catalog/CatalogEvent;", "()V", "catalog_devDebug"})
    public static final class LoadCatalogList extends uk.endclothing.task.features.catalog.CatalogEvent {
        @org.jetbrains.annotations.NotNull()
        public static final uk.endclothing.task.features.catalog.CatalogEvent.LoadCatalogList INSTANCE = null;
        
        private LoadCatalogList() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogEvent$Dismiss;", "Luk/endclothing/task/features/catalog/CatalogEvent;", "()V", "catalog_devDebug"})
    public static final class Dismiss extends uk.endclothing.task.features.catalog.CatalogEvent {
        @org.jetbrains.annotations.NotNull()
        public static final uk.endclothing.task.features.catalog.CatalogEvent.Dismiss INSTANCE = null;
        
        private Dismiss() {
            super();
        }
    }
}