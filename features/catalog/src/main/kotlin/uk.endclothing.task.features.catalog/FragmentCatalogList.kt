package uk.endclothing.task.features.catalog


import uk.endclothing.task.commons.navigation.popBackStack
import uk.endclothing.task.commons.ui.extensions.observe
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import uk.endclothing.task.commons.ui.base.BaseFragment
import uk.endclothing.task.commons.ui.extensions.coreComponent
import uk.endclothing.task.core.remote.ui.Product
import uk.endclothing.task.features.catalog.databinding.FragmentCatalogListBinding
import uk.endclothing.task.features.catalog.di.CatalogListModule
import uk.endclothing.task.features.catalog.di.DaggerCatalogListComponent

/**
 * MVI is depend on UI send and receive   actions(Events) from VM , UI get updates by state and get update by data
 * so I have three important class CatalogEvent ,CatalogState to update UI, and last live data to just send data
 * all of this are live data to make sure from live cycle awarance
 */
class FragmentCatalogList : BaseFragment<FragmentCatalogListBinding, CatalogListViewModel>(
    layoutId = R.layout.fragment_catalog_list
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        observe(viewModel.state, ::handleViewState)
        observe(viewModel.data, ::handleData)
        observe(viewModel.event, ::handleEvent)
    }

    override fun onInitDataBinding() {
        viewBinding.viewModel = FragmentCatalogList@this.viewModel
    }

    override fun onInitDependencyInjection() {
        DaggerCatalogListComponent.builder()
            .catalogListModule(CatalogListModule(this))
            .coreComponent(coreComponent)
            .build().inject(this)
    }

    private fun initViews() = viewBinding.let {
       with(it.recylerView) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = CatalogListAdapter{

            }
        }

    }

    private fun handleData(data: List<Product>) = viewBinding.run {
       (recylerView.adapter as CatalogListAdapter).submitList(data)
    }


    private fun handleViewState(state: CatalogViewState) =
        when (state) {
            CatalogViewState.Loading -> {
                viewBinding.showEmpty = false
                viewBinding.showLoading = true
            }
            CatalogViewState.Loaded -> {
                viewBinding.showEmpty = false
                viewBinding.showLoading = false
            }
            is CatalogViewState.LoadingFailure -> {
                Toast.makeText(requireContext(), state.error.errorMessage, Toast.LENGTH_SHORT)
                    .show()// for sure this would be something better like micro interaction.. so If i have more time i would create view module to create all custom views
                viewBinding.showLoading = false
                viewBinding.showEmpty = false
            }
            CatalogViewState.Empty -> {
                viewBinding.showLoading = false
                viewBinding.showEmpty = true
            }
        }

    private fun handleEvent(event: CatalogEvent) {
        when (event) {
            CatalogEvent.Dismiss -> popBackStack()
            else -> Unit
        }
    }
}
