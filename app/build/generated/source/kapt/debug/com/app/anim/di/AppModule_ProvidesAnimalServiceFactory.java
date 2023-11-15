package com.app.anim.di;

import com.app.anim.data.services.AnimalService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class AppModule_ProvidesAnimalServiceFactory implements Factory<AnimalService> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvidesAnimalServiceFactory(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AnimalService get() {
    return providesAnimalService(module, retrofitProvider.get());
  }

  public static AppModule_ProvidesAnimalServiceFactory create(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvidesAnimalServiceFactory(module, retrofitProvider);
  }

  public static AnimalService providesAnimalService(AppModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesAnimalService(retrofit));
  }
}
