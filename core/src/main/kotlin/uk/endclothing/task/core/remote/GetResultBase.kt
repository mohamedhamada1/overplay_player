package uk.endclothing.task.core.remote
import com.squareup.moshi.Moshi
import retrofit2.HttpException
import retrofit2.Response
import timber.log.Timber
import uk.endclothing.task.core.remote.response.BaseErrorResponse
import uk.endclothing.task.core.remote.response.ErrorResponse

suspend fun <T: Any> getResult(
    moshi: Moshi,
    call: suspend () -> Response<T>
): Result<T> {
    return try {
        val response = call()
        val body = response.body()
        if (body != null) Result.success(body) else HttpException(response).getErrorResult(moshi)
    } catch (t: HttpException) {
        Timber.e(t)
        t.getErrorResult(moshi)
    } catch (t: Throwable) {
        Timber.e(t)
        Result.error(t)
    }
}


private fun HttpException.getErrorResult(moshi: Moshi): Result.Error =
    try {
        this.response()?.errorBody()?.string()?.let {
            moshi.adapter(BaseErrorResponse::class.java).lenient().fromJson(it)?.error
                ?: moshi.adapter(ErrorResponse::class.java).lenient().fromJson(it)
        }?.let {
            Result.error(errorCode = it.code, errorMessage = it.description)
        } ?: Result.error(this)
    } catch (t: Throwable) {
        Result.error(this)
    }
