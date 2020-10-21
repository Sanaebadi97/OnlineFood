package com.awizhe.domain.repository.food

import com.awizhe.domain.model.food.Food
import io.reactivex.Single

interface FoodRepository {
    fun getFood(): Single<List<Food>>
}