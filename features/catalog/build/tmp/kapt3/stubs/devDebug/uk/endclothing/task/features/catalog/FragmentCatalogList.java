package uk.endclothing.task.features.catalog;

import java.lang.System;

/**
 * MVI is depend on UI send and receive   actions(Events) from VM , UI get updates by state and get update by data
 * so I have three important class CatalogEvent ,CatalogState to update UI, and last live data to just send data
 * all of this are live data to make sure from live cycle awarance
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016\u00a8\u0006\u0018"}, d2 = {"Luk/endclothing/task/features/catalog/FragmentCatalogList;", "Luk/endclothing/task/commons/ui/base/BaseFragment;", "Luk/endclothing/task/features/catalog/databinding/FragmentCatalogListBinding;", "Luk/endclothing/task/features/catalog/CatalogListViewModel;", "()V", "handleData", "", "data", "", "Luk/endclothing/task/core/remote/ui/Product;", "handleEvent", "event", "Luk/endclothing/task/features/catalog/CatalogEvent;", "handleViewState", "state", "Luk/endclothing/task/features/catalog/CatalogViewState;", "initViews", "onInitDataBinding", "onInitDependencyInjection", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "catalog_devDebug"})
public final class FragmentCatalogList extends uk.endclothing.task.commons.ui.base.BaseFragment<uk.endclothing.task.features.catalog.databinding.FragmentCatalogListBinding, uk.endclothing.task.features.catalog.CatalogListViewModel> {
    
    public FragmentCatalogList() {
        super(0);
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onInitDataBinding() {
    }
    
    @java.lang.Override()
    public void onInitDependencyInjection() {
    }
    
    private final void initViews() {
    }
    
    private final void handleData(java.util.List<uk.endclothing.task.core.remote.ui.Product> data) {
    }
    
    private final void handleViewState(uk.endclothing.task.features.catalog.CatalogViewState state) {
    }
    
    private final void handleEvent(uk.endclothing.task.features.catalog.CatalogEvent event) {
    }
}