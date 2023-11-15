package com.app.anim;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ&\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/app/anim/MainViewModal;", "Landroidx/lifecycle/ViewModel;", "randomFactUseCase", "Lcom/app/anim/domain/usecase/RandomFactUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/app/anim/domain/usecase/RandomFactUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/app/anim/UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchRandomFact", "", "setState", "loading", "", "fact", "", "error", "app_debug"})
public final class MainViewModal extends androidx.lifecycle.ViewModel {
    private final com.app.anim.domain.usecase.RandomFactUseCase randomFactUseCase = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.app.anim.UiState> uiState = null;
    
    @javax.inject.Inject
    public MainViewModal(@org.jetbrains.annotations.NotNull
    com.app.anim.domain.usecase.RandomFactUseCase randomFactUseCase, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.app.anim.UiState> getUiState() {
        return null;
    }
    
    public final void fetchRandomFact() {
    }
    
    private final void setState(boolean loading, java.lang.String fact, java.lang.String error) {
    }
}