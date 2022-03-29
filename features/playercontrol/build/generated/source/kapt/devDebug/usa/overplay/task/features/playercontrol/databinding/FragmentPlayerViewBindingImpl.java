package usa.overplay.task.features.playercontrol.databinding;
import usa.overplay.task.features.playercontrol.R;
import usa.overplay.task.features.playercontrol.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlayerViewBindingImpl extends FragmentPlayerViewBinding  {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlayerViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentPlayerViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (com.google.android.exoplayer2.ui.PlayerView) bindings[1]
            );
        this.TVCounter.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.videoPlayer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((usa.overplay.task.features.player.PlayerViewModel) variable);
        }
        else if (BR.secondCount == variableId) {
            setSecondCount((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable usa.overplay.task.features.player.PlayerViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    public void setSecondCount(@Nullable java.lang.Integer SecondCount) {
        this.mSecondCount = SecondCount;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.secondCount);
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
        boolean secondCountInt0 = false;
        int androidxDatabindingViewDataBindingSafeUnboxSecondCount = 0;
        boolean SecondCountInt01 = false;
        java.lang.Integer secondCount = mSecondCount;
        java.lang.String integerToStringSecondCount = null;

        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(secondCount)
                androidxDatabindingViewDataBindingSafeUnboxSecondCount = androidx.databinding.ViewDataBinding.safeUnbox(secondCount);


                // read androidx.databinding.ViewDataBinding.safeUnbox(secondCount) != 0
                secondCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxSecondCount) != (0);
                // read androidx.databinding.ViewDataBinding.safeUnbox(secondCount) == 0
                SecondCountInt01 = (androidxDatabindingViewDataBindingSafeUnboxSecondCount) == (0);
                // read Integer.toString(androidx.databinding.ViewDataBinding.safeUnbox(secondCount))
                integerToStringSecondCount = java.lang.Integer.toString(androidxDatabindingViewDataBindingSafeUnboxSecondCount);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            usa.overplay.task.commons.ui.bindings.ViewBindingsKt.setVisible(this.TVCounter, secondCountInt0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.TVCounter, integerToStringSecondCount);
            usa.overplay.task.commons.ui.bindings.ViewBindingsKt.setVisible(this.videoPlayer, SecondCountInt01);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): secondCount
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}