package com.app.anim.domain.usecase

import com.app.anim.domain.model.RandomFact
import com.app.anim.domain.repo.Animal
import com.app.anim.utils.Result
import javax.inject.Inject

class RandomFactUseCase @Inject constructor(
    private val repo: Animal
) {
    suspend operator fun invoke(): Result<RandomFact> {
        return repo.getFact()
    }
}