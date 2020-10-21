package com.awizhe.data.repository.dataSource.food

import com.awizhe.data.entity.food.FoodListEntity
import io.reactivex.Single

interface FoodDataSource {
    fun getFood(): Single<FoodListEntity>
}