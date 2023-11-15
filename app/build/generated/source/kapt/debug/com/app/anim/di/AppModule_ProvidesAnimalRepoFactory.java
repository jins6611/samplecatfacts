package com.app.anim.di;

import com.app.anim.data.services.AnimalService;
import com.app.anim.domain.repo.Animal;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvidesAnimalRepoFactory implements Factory<Animal> {
  private final AppModule module;

  private final Provider<AnimalService> animalServiceProvider;

  public AppModule_ProvidesAnimalRepoFactory(AppModule module,
      Provider<AnimalService> animalServiceProvider) {
    this.module = module;
    this.animalServiceProvider = animalServiceProvider;
  }

  @Override
  public Animal get() {
    return providesAnimalRepo(module, animalServiceProvider.get());
  }

  public static AppModule_ProvidesAnimalRepoFactory create(AppModule module,
      Provider<AnimalService> animalServiceProvider) {
    return new AppModule_ProvidesAnimalRepoFactory(module, animalServiceProvider);
  }

  public static Animal providesAnimalRepo(AppModule instance, AnimalService animalService) {
    return Preconditions.checkNotNullFromProvides(instance.providesAnimalRepo(animalService));
  }
}
