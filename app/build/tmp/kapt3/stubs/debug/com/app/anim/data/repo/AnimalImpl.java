package com.app.anim.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJE\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0006\"\b\b\u0000\u0010\n*\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010JE\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\u0006\"\b\b\u0000\u0010\n*\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/app/anim/data/repo/AnimalImpl;", "Lcom/app/anim/domain/repo/Animal;", "animalService", "Lcom/app/anim/data/services/AnimalService;", "(Lcom/app/anim/data/services/AnimalService;)V", "getFact", "Lcom/app/anim/utils/Result;", "Lcom/app/anim/domain/model/RandomFact;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeApiCall", "T", "", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeApiResult", "app_debug"})
public final class AnimalImpl implements com.app.anim.domain.repo.Animal {
    private final com.app.anim.data.services.AnimalService animalService = null;
    
    public AnimalImpl(@org.jetbrains.annotations.NotNull
    com.app.anim.data.services.AnimalService animalService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getFact(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.app.anim.utils.Result<com.app.anim.domain.model.RandomFact>> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object safeApiCall(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> call, kotlin.coroutines.Continuation<? super com.app.anim.utils.Result<? extends T>> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object safeApiResult(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> call, kotlin.coroutines.Continuation<? super com.app.anim.utils.Result<? extends T>> continuation) {
        return null;
    }
}