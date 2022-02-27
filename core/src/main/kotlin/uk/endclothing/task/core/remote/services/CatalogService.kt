package uk.endclothing.task.core.remote.services


import retrofit2.Response
import retrofit2.http.GET
import uk.endclothing.task.core.remote.response.BaseResponse
import uk.endclothing.task.core.remote.response.ProductResponse

interface CatalogService {
    companion object {
        private const val BASE_URL = "media/catalog/"
    }

    @GET("${BASE_URL}android_test_example.json")
    suspend fun getCatalog(
    ): Response<BaseResponse<List<ProductResponse>>>

}
