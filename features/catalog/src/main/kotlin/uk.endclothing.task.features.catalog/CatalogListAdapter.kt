package uk.endclothing.task.features.catalog

import uk.endclothing.task.commons.ui.base.BaseListAdapter
import uk.endclothing.task.commons.ui.base.BaseViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uk.endclothing.task.core.remote.ui.Product
import uk.endclothing.task.features.catalog.databinding.RowProductItemBinding

class CatalogListAdapter(
    private val onProductClick: ((Product) -> Unit)
) : BaseListAdapter<Product>(
    itemsSame = { old, new -> old.productId == new.productId },
    contentsSame = { old, new -> old == new }
) {

    override fun onCreateViewHolder(parent: ViewGroup, inflater: LayoutInflater, viewType: Int): RecyclerView.ViewHolder =
        ProductVH(parent, inflater, onProductClick)


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ProductVH).bind(getItem(position))
    }


    class ProductVH(
        parent: ViewGroup,
        inflater: LayoutInflater,
        callback: ((Product) -> Unit)
    ) : BaseViewHolder<RowProductItemBinding>(
        RowProductItemBinding.inflate(inflater, parent, false)
    ) {
        init {
            binding.root.setOnClickListener { _ ->
                binding.item?.let { callback(it) }
            }
        }

        fun bind(item: Product) {
            binding.item = item

        }
    }


}
