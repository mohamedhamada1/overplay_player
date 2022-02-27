package uk.endclothing.task.features.catalog


import uk.endclothing.task.commons.ui.base.BaseViewState
import uk.endclothing.task.core.remote.Result

sealed class CatalogViewState : BaseViewState {
    object Loaded : CatalogViewState()
    object Loading : CatalogViewState()
    data class LoadingFailure(val error: Result.Error) : CatalogViewState()
    object Empty : CatalogViewState()
}
