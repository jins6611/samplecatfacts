package com.app.anim.domain.repo

import com.app.anim.domain.model.RandomFact
import com.app.anim.utils.Result

interface Animal {
    suspend fun getFact(): Result<RandomFact>
}