package usa.overplay.task.commons.ui.bindings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a6\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0007\u00a8\u0006\u0015"}, d2 = {"imageUrl", "", "Landroid/widget/ImageView;", "url", "", "placeholder", "Landroid/graphics/drawable/Drawable;", "fallback", "isCircle", "", "loadImageAsBitmap", "onLoaded", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "onClear", "Lkotlin/Function0;", "loadIntResource", "res", "", "tintColor", "color", "ui_devDebug"})
public final class ImageViewBindingsKt {
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl", "imagePlaceholder", "imageFail", "isCircle"}, requireAll = false)
    public static final void imageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$imageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeholder, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable fallback, boolean isCircle) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadIntResource"})
    public static final void loadIntResource(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadIntResource, @androidx.annotation.DrawableRes()
    int res) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"tintColorResource"})
    public static final void tintColor(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$tintColor, int color) {
    }
    
    public static final void loadImageAsBitmap(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageAsBitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onLoaded, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClear) {
    }
}