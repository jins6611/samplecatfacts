package com.app.anim.utils

import java.io.IOException

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T?, val statusCode: Int) : Result<T>()
    data class Error(val exception: Throwable) : Result<Nothing>()

    fun <M : Any> transform(func: (item: T?) -> M?): Result<M> {
        return when (this) {
            is Success -> {
                val data: M? = func.invoke(this.data)
                if (data == null) Error(IOException("Something went wrong")) else Success(
                    data,
                    statusCode
                )
            }

            is Error -> this
        }
    }
}
