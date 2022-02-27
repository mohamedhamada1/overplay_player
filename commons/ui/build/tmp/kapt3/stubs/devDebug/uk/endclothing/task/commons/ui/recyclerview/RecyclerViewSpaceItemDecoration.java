package uk.endclothing.task.commons.ui.recyclerview;

import java.lang.System;

/**
 * Simple item decoration to add spaces between [RecyclerView] items. Support the grid and linear layout.
 *
 * @see RecyclerView.ItemDecoration
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J(\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J(\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J(\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u001c"}, d2 = {"Luk/endclothing/task/commons/ui/recyclerview/RecyclerViewSpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacingPx", "", "spacingVertical", "(II)V", "getSpacingPx$ui_devDebug", "()I", "getSpacingVertical$ui_devDebug", "configSpacingForGridLayoutManager", "", "outRect", "Landroid/graphics/Rect;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "position", "itemCount", "configSpacingForLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "configSpacingForStaggeredLayoutManager", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "getItemOffsets", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "ui_devDebug"})
public final class RecyclerViewSpaceItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final int spacingPx = 0;
    private final int spacingVertical = 0;
    
    public RecyclerViewSpaceItemDecoration(@androidx.annotation.VisibleForTesting(otherwise = 2)
    int spacingPx, int spacingVertical) {
        super();
    }
    
    public final int getSpacingPx$ui_devDebug() {
        return 0;
    }
    
    public final int getSpacingVertical$ui_devDebug() {
        return 0;
    }
    
    @java.lang.Override()
    public void getItemOffsets(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    private final void configSpacingForGridLayoutManager(android.graphics.Rect outRect, androidx.recyclerview.widget.GridLayoutManager layoutManager, int position, int itemCount) {
    }
    
    private final void configSpacingForLinearLayoutManager(android.graphics.Rect outRect, androidx.recyclerview.widget.LinearLayoutManager layoutManager, int position, int itemCount) {
    }
    
    private final void configSpacingForStaggeredLayoutManager(android.graphics.Rect outRect, androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager, int position, int itemCount) {
    }
}