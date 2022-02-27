package uk.endclothing.task.features.catalog;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import uk.endclothing.task.features.catalog.databinding.FragmentCatalogListBindingImpl;
import uk.endclothing.task.features.catalog.databinding.RowProductItemBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCATALOGLIST = 1;

  private static final int LAYOUT_ROWPRODUCTITEM = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(uk.endclothing.task.features.catalog.R.layout.fragment_catalog_list, LAYOUT_FRAGMENTCATALOGLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(uk.endclothing.task.features.catalog.R.layout.row_product_item, LAYOUT_ROWPRODUCTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCATALOGLIST: {
          if ("layout/fragment_catalog_list_0".equals(tag)) {
            return new FragmentCatalogListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_catalog_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWPRODUCTITEM: {
          if ("layout/row_product_item_0".equals(tag)) {
            return new RowProductItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_product_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(4);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new uk.endclothing.task.commons.navigation.DataBinderMapperImpl());
    result.add(new uk.endclothing.task.commons.ui.DataBinderMapperImpl());
    result.add(new uk.endclothing.task.core.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "item");
      sKeys.put(2, "showEmpty");
      sKeys.put(3, "showLoading");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(2);

    static {
      sKeys.put("layout/fragment_catalog_list_0", uk.endclothing.task.features.catalog.R.layout.fragment_catalog_list);
      sKeys.put("layout/row_product_item_0", uk.endclothing.task.features.catalog.R.layout.row_product_item);
    }
  }
}
