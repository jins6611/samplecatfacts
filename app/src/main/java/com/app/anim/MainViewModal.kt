package com.app.anim

import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.anim.domain.usecase.RandomFactUseCase
import com.app.anim.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.parcelize.Parcelize
import javax.inject.Inject

@HiltViewModel
class MainViewModal @Inject constructor(
    private val randomFactUseCase: RandomFactUseCase,
    private val savedStateHandle: SavedStateHandle,

    ) : ViewModel() {
    init {
        fetchRandomFact()
    }

    val uiState: StateFlow<UiState> = savedStateHandle.getStateFlow("fact", UiState(loading = true))

    fun fetchRandomFact() {
        viewModelScope.launch {
            setState(loading = true)
            when (val response = randomFactUseCase()) {
                is Result.Success -> {
                    val fact =
                        if (response.data?.data?.isNotEmpty() == true) response.data.data[0] else ""
                    setState(
                        loading = false,
                        fact = fact,
                        error = if (fact.isBlank()) "No fact available!" else ""
                    )
                }

                is Result.Error -> {
                    setState(
                        loading = false,
                        fact = "",
                        error = response.exception.message
                            ?: "Something went wrong! Please try again"
                    )
                }
            }
        }
    }

    private fun setState(loading: Boolean = true, fact: String = "", error: String = "") {
        savedStateHandle["fact"] = UiState(loading = loading, fact = fact, error = error)
    }
}

@Parcelize
data class UiState(val loading: Boolean = true, val fact: String = "", val error: String = "") :
    Parcelable