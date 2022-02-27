package uk.endclothing.task.features.catalog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogListAdapter;", "Luk/endclothing/task/commons/ui/base/BaseListAdapter;", "Luk/endclothing/task/core/remote/ui/Product;", "onProductClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "viewType", "ProductVH", "catalog_devDebug"})
public final class CatalogListAdapter extends uk.endclothing.task.commons.ui.base.BaseListAdapter<uk.endclothing.task.core.remote.ui.Product> {
    private final kotlin.jvm.functions.Function1<uk.endclothing.task.core.remote.ui.Product, kotlin.Unit> onProductClick = null;
    
    public CatalogListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super uk.endclothing.task.core.remote.ui.Product, kotlin.Unit> onProductClick) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\t\u00a8\u0006\u000e"}, d2 = {"Luk/endclothing/task/features/catalog/CatalogListAdapter$ProductVH;", "Luk/endclothing/task/commons/ui/base/BaseViewHolder;", "Luk/endclothing/task/features/catalog/databinding/RowProductItemBinding;", "parent", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "callback", "Lkotlin/Function1;", "Luk/endclothing/task/core/remote/ui/Product;", "", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "catalog_devDebug"})
    public static final class ProductVH extends uk.endclothing.task.commons.ui.base.BaseViewHolder<uk.endclothing.task.features.catalog.databinding.RowProductItemBinding> {
        
        public ProductVH(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super uk.endclothing.task.core.remote.ui.Product, kotlin.Unit> callback) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        uk.endclothing.task.core.remote.ui.Product item) {
        }
    }
}