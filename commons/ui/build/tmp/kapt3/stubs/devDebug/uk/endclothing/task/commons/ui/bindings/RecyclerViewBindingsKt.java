package uk.endclothing.task.commons.ui.bindings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"addDividerDecorator", "", "Landroidx/recyclerview/widget/RecyclerView;", "divider", "", "setHorizontalItemDecorationSpacing", "horizontalSpacePx", "topBottomSpacePx", "setItemDecorationSpacing", "spacingPx", "verticalSpace", "ui_devDebug"})
public final class RecyclerViewBindingsKt {
    
    @androidx.databinding.BindingAdapter(value = {"itemDecorationSpacing"})
    public static final void setItemDecorationSpacing(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$setItemDecorationSpacing, int spacingPx, int verticalSpace) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"horizontalSpacePx", "topBottomSpacePx"}, requireAll = false)
    public static final void setHorizontalItemDecorationSpacing(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$setHorizontalItemDecorationSpacing, int horizontalSpacePx, int topBottomSpacePx) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"dividerDecorator"})
    public static final void addDividerDecorator(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$addDividerDecorator, @androidx.annotation.DrawableRes()
    int divider) {
    }
}