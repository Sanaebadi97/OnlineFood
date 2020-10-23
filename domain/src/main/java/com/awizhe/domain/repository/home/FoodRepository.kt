package com.awizhe.domain.repository.home

import com.awizhe.domain.model.home.FoodList
import io.reactivex.Single

interface FoodRepository {
    fun getFood(): Single<FoodList>
}