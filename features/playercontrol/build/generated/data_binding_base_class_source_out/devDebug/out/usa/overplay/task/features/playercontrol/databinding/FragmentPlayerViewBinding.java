// Generated by data binding compiler. Do not edit!
package usa.overplay.task.features.playercontrol.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.exoplayer2.ui.PlayerView;
import java.lang.Deprecated;
import java.lang.Object;
import usa.overplay.task.features.player.PlayerViewModel;
import usa.overplay.task.features.playercontrol.R;

public abstract class FragmentPlayerViewBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView TVCounter;

  @NonNull
  public final PlayerView videoPlayer;

  @Bindable
  protected PlayerViewModel mViewModel;

  @Bindable
  protected Integer mSecondCount;

  protected FragmentPlayerViewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView TVCounter, PlayerView videoPlayer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.TVCounter = TVCounter;
    this.videoPlayer = videoPlayer;
  }

  public abstract void setViewModel(@Nullable PlayerViewModel viewModel);

  @Nullable
  public PlayerViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setSecondCount(@Nullable Integer secondCount);

  @Nullable
  public Integer getSecondCount() {
    return mSecondCount;
  }

  @NonNull
  public static FragmentPlayerViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_player_view, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlayerViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlayerViewBinding>inflateInternal(inflater, R.layout.fragment_player_view, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlayerViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_player_view, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlayerViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlayerViewBinding>inflateInternal(inflater, R.layout.fragment_player_view, null, false, component);
  }

  public static FragmentPlayerViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentPlayerViewBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlayerViewBinding)bind(component, view, R.layout.fragment_player_view);
  }
}
