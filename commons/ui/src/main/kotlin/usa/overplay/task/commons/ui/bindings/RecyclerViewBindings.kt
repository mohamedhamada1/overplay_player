package usa.overplay.task.commons.ui.bindings

import usa.overplay.task.commons.ui.recyclerview.RecyclerViewHorizontalSpaceItemDecoration
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import usa.overplay.task.commons.ui.recyclerview.RecyclerViewSpaceItemDecoration

@BindingAdapter("itemDecorationSpacing")
fun RecyclerView.setItemDecorationSpacing(
    spacingPx: Int,
    // have added this param because in some case i need to have different space hor and ver
    verticalSpace: Int = spacingPx
) {
    addItemDecoration(
        RecyclerViewSpaceItemDecoration(spacingPx, verticalSpace)
    )
}

@BindingAdapter("horizontalSpacePx", "topBottomSpacePx", requireAll = false)
fun RecyclerView.setHorizontalItemDecorationSpacing(
    horizontalSpacePx: Int,
    topBottomSpacePx: Int = 0
) {
    addItemDecoration(
        RecyclerViewHorizontalSpaceItemDecoration(horizontalSpacePx, topBottomSpacePx)
    )
}

@BindingAdapter("dividerDecorator")
fun RecyclerView.addDividerDecorator(@DrawableRes divider: Int) {
    addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL).apply {
        ContextCompat.getDrawable(context, divider)?.let { setDrawable(it) }
    })
}
