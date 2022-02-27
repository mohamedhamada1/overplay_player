package uk.endclothing.task.features.catalog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogListViewModel;", "Landroidx/lifecycle/ViewModel;", "catalogRepo", "Luk/endclothing/task/core/remote/repo/catalog/CatalogRepo;", "(Luk/endclothing/task/core/remote/repo/catalog/CatalogRepo;)V", "_data", "Landroidx/lifecycle/MutableLiveData;", "", "Luk/endclothing/task/core/remote/ui/Product;", "_event", "Luk/endclothing/task/commons/ui/livedata/SingleLiveData;", "Luk/endclothing/task/features/catalog/CatalogEvent;", "_state", "Luk/endclothing/task/features/catalog/CatalogViewState;", "data", "Landroidx/lifecycle/LiveData;", "getData", "()Landroidx/lifecycle/LiveData;", "event", "getEvent", "state", "getState", "dismissScreen", "", "catalog_devDebug"})
public final class CatalogListViewModel extends androidx.lifecycle.ViewModel {
    private final uk.endclothing.task.core.remote.repo.catalog.CatalogRepo catalogRepo = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<uk.endclothing.task.core.remote.ui.Product>> _data = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<uk.endclothing.task.core.remote.ui.Product>> data = null;
    private final uk.endclothing.task.commons.ui.livedata.SingleLiveData<uk.endclothing.task.features.catalog.CatalogViewState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<uk.endclothing.task.features.catalog.CatalogViewState> state = null;
    private final uk.endclothing.task.commons.ui.livedata.SingleLiveData<uk.endclothing.task.features.catalog.CatalogEvent> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<uk.endclothing.task.features.catalog.CatalogEvent> event = null;
    
    public CatalogListViewModel(@org.jetbrains.annotations.NotNull()
    uk.endclothing.task.core.remote.repo.catalog.CatalogRepo catalogRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<uk.endclothing.task.core.remote.ui.Product>> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<uk.endclothing.task.features.catalog.CatalogViewState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<uk.endclothing.task.features.catalog.CatalogEvent> getEvent() {
        return null;
    }
    
    public final void dismissScreen() {
    }
}