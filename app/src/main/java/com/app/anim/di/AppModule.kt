package com.app.anim.di

import android.content.Context
import com.app.anim.data.repo.AnimalImpl
import com.app.anim.data.services.AnimalService
import com.app.anim.domain.repo.Animal
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Singleton
    @Provides
    fun provideRetrofit(@ApplicationContext applicationContext: Context): Retrofit {
        return Retrofit.Builder().baseUrl("https://meowfacts.herokuapp.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesAnimalRepo(
        animalService: AnimalService
    ): Animal {
        return AnimalImpl(
            animalService = animalService
        )
    }

    @Singleton
    @Provides
    fun providesAnimalService(retrofit: Retrofit): AnimalService {
        return retrofit.create(AnimalService::class.java)
    }
}