package uk.endclothing.task.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009c\u0001\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t24\u0010\u000b\u001a0\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u001av\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00042\"\u0010\b\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u001a\u008a\u0001\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"mediatorLivedata", "Landroidx/lifecycle/LiveData;", "Luk/endclothing/task/core/remote/Result;", "T", "", "A", "localCall", "Lkotlin/Function0;", "networkCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "callback", "Lkotlin/Function3;", "Landroidx/lifecycle/LiveDataScope;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/lifecycle/LiveData;", "networkOnlyLiveData", "mapFun", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "resultLiveData", "saveCallResult", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "core_devDebug"})
public final class SingleSourceOfTruthStrategyKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, A extends java.lang.Object>androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<T>> resultLiveData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends androidx.lifecycle.LiveData<T>> localCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super uk.endclothing.task.core.remote.Result<? extends A>>, ? extends java.lang.Object> networkCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> saveCallResult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, A extends java.lang.Object>androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<T>> networkOnlyLiveData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super uk.endclothing.task.core.remote.Result<? extends A>>, ? extends java.lang.Object> networkCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> mapFun) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, A extends java.lang.Object>androidx.lifecycle.LiveData<uk.endclothing.task.core.remote.Result<T>> mediatorLivedata(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends androidx.lifecycle.LiveData<T>> localCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super uk.endclothing.task.core.remote.Result<? extends A>>, ? extends java.lang.Object> networkCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super A, ? super androidx.lifecycle.LiveDataScope<uk.endclothing.task.core.remote.Result<T>>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> callback) {
        return null;
    }
}