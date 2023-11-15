package com.app.anim.data.repo

import com.app.anim.data.services.AnimalService
import com.app.anim.domain.model.RandomFact
import com.app.anim.domain.repo.Animal
import com.app.anim.utils.Result
import retrofit2.Response
import java.io.IOException

class AnimalImpl(private val animalService: AnimalService) : Animal {
    override suspend fun getFact(): Result<RandomFact> {
        return safeApiCall {
            animalService.getRandomFact()
        }
    }

    private suspend fun <T : Any> safeApiCall(
        call: suspend () -> Response<T>
    ): Result<T> {
        return safeApiResult(call)
    }

    private suspend fun <T : Any> safeApiResult(
        call: suspend () -> Response<T>
    ): Result<T> {
        return try {
            val response = call.invoke()
            val statusCode = response.code()
            return if (response.isSuccessful) {
                Result.Success(response.body(), statusCode)
            } else {
                Result.Error(IOException("API call failed with status code $statusCode!"))
            }
        } catch (e: Exception) {
            Result.Error(IOException("Something went wrong:$e \n  Please try again!"))
        }
    }
}