package uk.endclothing.task.core.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataScope
import androidx.lifecycle.liveData
import androidx.lifecycle.map
import kotlinx.coroutines.Dispatchers
import uk.endclothing.task.core.remote.Result

fun <T : Any, A : Any> resultLiveData(
    localCall: () -> LiveData<T>,
    networkCall: suspend () -> Result<A>,
    saveCallResult: suspend (A) -> Unit
): LiveData<Result<T>> =
    liveData(Dispatchers.IO) {
        emit(Result.loading())

        val localSource = localCall().map { Result.success(it) }
        emitSource(localSource)

        when (val networkResult = networkCall()) {
            is Result.Success -> saveCallResult(networkResult.data)
            is Result.Error -> {
                emit(networkResult)
                emitSource(localSource)
            }
        }
    }

fun <T : Any, A : Any> networkOnlyLiveData(
    networkCall: suspend () -> Result<A>,
    mapFun: suspend (A) -> T
): LiveData<Result<T>> =
    liveData(Dispatchers.IO) {
        emit(Result.loading())

        when (val response = networkCall()) {
            is Result.Success -> emit(Result.success(mapFun(response.data)))
            is Result.Error -> emit(response)
        }
    }

fun <T : Any, A : Any> mediatorLivedata(
    localCall: () -> LiveData<T>,
    networkCall: suspend () -> Result<A>,
    callback: suspend (A, LiveDataScope<Result<T>>) -> Unit
): LiveData<Result<T>> =
    liveData(Dispatchers.IO) {
        emit(Result.loading())

        val localSource = localCall().map { Result.success(it) }
        emitSource(localSource)

        when (val networkResponse = networkCall()) {
            is Result.Success -> callback(networkResponse.data, this)
            is Result.Error -> {
                emit(networkResponse)
                emitSource(localSource)
            }
        }
    }
