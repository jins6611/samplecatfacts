package com.app.anim.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final AppModule module;

  private final Provider<Context> applicationContextProvider;

  public AppModule_ProvideRetrofitFactory(AppModule module,
      Provider<Context> applicationContextProvider) {
    this.module = module;
    this.applicationContextProvider = applicationContextProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, applicationContextProvider.get());
  }

  public static AppModule_ProvideRetrofitFactory create(AppModule module,
      Provider<Context> applicationContextProvider) {
    return new AppModule_ProvideRetrofitFactory(module, applicationContextProvider);
  }

  public static Retrofit provideRetrofit(AppModule instance, Context applicationContext) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit(applicationContext));
  }
}
