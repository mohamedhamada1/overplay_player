package uk.endclothing.task.features.catalog.databinding;
import uk.endclothing.task.features.catalog.R;
import uk.endclothing.task.features.catalog.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowProductItemBindingImpl extends RowProductItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowProductItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RowProductItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.IVImg.setTag(null);
        this.TVName.setTag(null);
        this.TVPrice.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((uk.endclothing.task.core.remote.ui.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable uk.endclothing.task.core.remote.ui.Product Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String itemProductName = null;
        java.lang.String itemProductImg = null;
        uk.endclothing.task.core.remote.ui.Product item = mItem;
        java.lang.String itemProductPrice = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.productName
                    itemProductName = item.getProductName();
                    // read item.productImg
                    itemProductImg = item.getProductImg();
                    // read item.productPrice
                    itemProductPrice = item.getProductPrice();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            uk.endclothing.task.commons.ui.bindings.ImageViewBindingsKt.imageUrl(this.IVImg, itemProductImg, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (boolean)false);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.TVName, itemProductName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.TVPrice, itemProductPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}