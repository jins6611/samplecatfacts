package com.app.anim;

import androidx.lifecycle.SavedStateHandle;
import com.app.anim.domain.usecase.RandomFactUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MainViewModal_Factory implements Factory<MainViewModal> {
  private final Provider<RandomFactUseCase> randomFactUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public MainViewModal_Factory(Provider<RandomFactUseCase> randomFactUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.randomFactUseCaseProvider = randomFactUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public MainViewModal get() {
    return newInstance(randomFactUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static MainViewModal_Factory create(Provider<RandomFactUseCase> randomFactUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new MainViewModal_Factory(randomFactUseCaseProvider, savedStateHandleProvider);
  }

  public static MainViewModal newInstance(RandomFactUseCase randomFactUseCase,
      SavedStateHandle savedStateHandle) {
    return new MainViewModal(randomFactUseCase, savedStateHandle);
  }
}
