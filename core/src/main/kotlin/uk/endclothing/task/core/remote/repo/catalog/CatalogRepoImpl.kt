package uk.endclothing.task.core.remote.repo.catalog

import androidx.lifecycle.LiveData
import timber.log.Timber
import uk.endclothing.task.core.remote.datasource.CatalogDataSource
import uk.endclothing.task.core.remote.ui.Product
import uk.endclothing.task.core.remote.ui.mapper.toUI
import uk.endclothing.task.core.utils.networkOnlyLiveData
import uk.endclothing.task.core.remote.Result
import javax.inject.Inject

class CatalogRepoImpl @Inject constructor(val remote: CatalogDataSource) : CatalogRepo {

    override fun getCatalogList(): LiveData<Result<List<Product>>> = networkOnlyLiveData(
        networkCall = {
            remote.getCatalog()
        },
        mapFun = {
            Timber.d(it.toString())
            it.result?.map { it.toUI() } ?: emptyList() }
    )
}