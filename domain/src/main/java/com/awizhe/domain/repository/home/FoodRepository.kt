package com.awizhe.domain.repository.home

import com.awizhe.domain.model.home.Food
import io.reactivex.Single

interface FoodRepository {
    fun getFood(): Single<List<Food>>
}