package uk.endclothing.task.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001aT\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0006\u0012\u0004\u0012\u0002H\u00050\t\u001a\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\u0002H\u0002\u00a2\u0006\u0002\u0010\u000b\u001a&\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\b\b\u0000\u0010\u0002*\u00020\r*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000e0\u0004\u001a0\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00120\u0011\u001a\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u0004\u001a,\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\u0004\"\b\b\u0000\u0010\u0002*\u00020\r*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000e0\u0004\u001aP\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\t\u001a\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001aV\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u000e0\u0004\"\b\b\u0000\u0010\u0002*\u00020\r\"\b\b\u0001\u0010\u001a*\u00020\r*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000e0\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u000e0\u00040\u0011\u001a\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001aV\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000428\u0010\u0010\u001a4\u0012\u0015\u0012\u0013\u0018\u0001H\u0002\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00120\t\u001aP\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\t\u00a8\u0006!"}, d2 = {"cached", "Landroidx/lifecycle/MutableLiveData;", "T", "any", "Landroidx/lifecycle/LiveData;", "R", "K", "other", "joinFun", "Lkotlin/Function2;", "asLiveData", "(Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "data", "", "Luk/endclothing/task/core/remote/Result;", "filter", "predicate", "Lkotlin/Function1;", "", "filterNotNull", "first", "", "ignoreError", "join", "once", "switchMapOnSuccess", "Y", "unique", "Lkotlin/ParameterName;", "name", "old", "new", "zip", "core_devDebug"})
public final class LiveDataExtKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> first(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<T>> $this$first) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> filter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$filter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, K extends java.lang.Object, R extends java.lang.Object>androidx.lifecycle.LiveData<R> join(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$join, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<K> other, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super K, ? extends R> joinFun) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, K extends java.lang.Object, R extends java.lang.Object>androidx.lifecycle.LiveData<R> zip(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$zip, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<K> other, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super K, ? extends R> joinFun) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, K extends java.lang.Object, R extends java.lang.Object>androidx.lifecycle.LiveData<R> any(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$any, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<K> other, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super K, ? extends R> joinFun) {
        return null;
    }
    
    /**
     * Will only emit data if [Result] is [Result.Success]
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> data(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<T>> $this$data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<java.lang.Object>> ignoreError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<T>> $this$ignoreError) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> once(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$once) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> filterNotNull(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$filterNotNull) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> unique(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$unique) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> unique(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$unique, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> asLiveData(T $this$asLiveData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.MutableLiveData<T> cached() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, Y extends java.lang.Object>androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<Y>> switchMapOnSuccess(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<T>> $this$switchMapOnSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<Y>>> other) {
        return null;
    }
}