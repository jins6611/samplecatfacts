package com.app.anim.data.services

import com.app.anim.domain.model.RandomFact
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET


interface AnimalService {
    @GET("/")
    suspend fun getRandomFact(): Response<RandomFact>
}