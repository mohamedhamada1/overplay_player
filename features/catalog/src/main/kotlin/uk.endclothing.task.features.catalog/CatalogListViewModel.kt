package uk.endclothing.task.features.catalog

import uk.endclothing.task.commons.ui.extensions.toSingleMediatorLiveData
import uk.endclothing.task.commons.ui.livedata.SingleLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uk.endclothing.task.core.remote.repo.catalog.CatalogRepo
import uk.endclothing.task.core.remote.ui.Product
import uk.endclothing.task.core.remote.Result

class CatalogListViewModel(
    private val catalogRepo: CatalogRepo
) : ViewModel() {

    private val _data = MutableLiveData<List<Product>>()
    val data: LiveData<List<Product>> = _data
    private val _state = SingleLiveData<CatalogViewState>()
    val state: LiveData<CatalogViewState> = _state

    private val _event = SingleLiveData<CatalogEvent>()
    val event: LiveData<CatalogEvent> = _event.toSingleMediatorLiveData { event, mediatorLiveData ->
        when (event) {
            CatalogEvent.LoadCatalogList -> {
                val request = catalogRepo.getCatalogList()
                mediatorLiveData.addSource(request) { result ->
                    when (result) {
                        is Result.Success -> {
                            _data.value = result.data
                            _state.value = if (result.data.isEmpty()) CatalogViewState.Empty
                            else CatalogViewState.Loaded
                        }
                        is Result.Error -> _state.value = CatalogViewState.LoadingFailure(result)
                        is Result.Loading -> _state.value = CatalogViewState.Loading
                    }
                }
                true
            }

            else -> false
        }
    }


    init {
        _event.value = CatalogEvent.LoadCatalogList
    }


    fun dismissScreen() {
        _event.value = CatalogEvent.Dismiss
    }


}
