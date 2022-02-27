package uk.endclothing.task.core.remote.repo.catalog

import androidx.lifecycle.LiveData
import uk.endclothing.task.core.remote.ui.Product
import uk.endclothing.task.core.remote.Result

interface CatalogRepo {
    fun getCatalogList(): LiveData<Result<List<Product>>>
}