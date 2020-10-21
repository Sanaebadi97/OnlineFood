package com.awizhe.domain.repository.food

import com.awizhe.domain.model.food.FoodList
import io.reactivex.Single

interface FoodRepository {
    fun getFood(): Single<FoodList>
}