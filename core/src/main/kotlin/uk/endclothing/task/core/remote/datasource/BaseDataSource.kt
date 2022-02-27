package uk.endclothing.task.core.remote.datasource

import uk.endclothing.task.core.remote.Result
import com.squareup.moshi.Moshi
import retrofit2.Response
import uk.endclothing.task.core.remote.getResult
abstract class BaseDataSource(private val moshi: Moshi) {

    suspend fun <T: Any> getResult(call: suspend () -> Response<T>): Result<T> = getResult(moshi, call)

}
