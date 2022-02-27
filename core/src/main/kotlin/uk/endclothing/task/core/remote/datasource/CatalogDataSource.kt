package uk.endclothing.task.core.remote.datasource
import com.squareup.moshi.Moshi
import uk.endclothing.task.core.remote.services.CatalogService

class CatalogDataSource(
    private val apiService: CatalogService,
    moshi: Moshi
) : BaseDataSource(moshi) {

    suspend fun getCatalog() = getResult {
        apiService.getCatalog()
    }
}
