package com.app.anim.domain.usecase;

import com.app.anim.domain.repo.Animal;
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
public final class RandomFactUseCase_Factory implements Factory<RandomFactUseCase> {
  private final Provider<Animal> repoProvider;

  public RandomFactUseCase_Factory(Provider<Animal> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public RandomFactUseCase get() {
    return newInstance(repoProvider.get());
  }

  public static RandomFactUseCase_Factory create(Provider<Animal> repoProvider) {
    return new RandomFactUseCase_Factory(repoProvider);
  }

  public static RandomFactUseCase newInstance(Animal repo) {
    return new RandomFactUseCase(repo);
  }
}
