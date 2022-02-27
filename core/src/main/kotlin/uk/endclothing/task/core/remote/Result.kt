package uk.endclothing.task.core.remote

/**
 * A generic class that holds a value with its loading status.
 *
 * Result is usually created by the Repository classes where they return
 * `LiveData<Result<T>>`.
 */

sealed class Result<out T : Any> {

    data class Success<out T : Any>(val data: T) : Result<T>()

    data class Error(
        val errorCode: Int = -1,
        val errorCause: Throwable? = null,
        val errorMessage: String? = null
    ) : Result<Nothing>()

    object Loading : Result<Nothing>()

    companion object {
        private const val ERROR_CODE_UNKNOWN = -1

        fun <T : Any> success(data: T): Result<T> = Success(data)

        fun error(
            errorCause: Throwable? = null,
            errorMessage: String? = null,
            errorCode: Int = ERROR_CODE_UNKNOWN
        ): Error = Error(errorCode, errorCause, errorMessage)

        fun loading(): Result<Nothing> = Loading
    }
}

infix fun Result<Any>.and(other: Result<Any>): Result<Pair<Any, Any>> =
    when {
        this is Result.Error || other is Result.Error -> (this as? Result.Error) ?: (other as? Result.Error) ?: Result.error()
        this is Result.Loading || other is Result.Loading -> Result.loading()
        else -> Result.success((this as Result.Success).data to (other as Result.Success).data)
    }

