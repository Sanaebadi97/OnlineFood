package com.awizhe.data.repository.dataSource.food

import com.awizhe.data.mapper.food.FoodMapper
import com.awizhe.domain.model.home.FoodList
import com.awizhe.domain.repository.CacheStrategy
import com.awizhe.domain.repository.home.FoodRepository
import io.reactivex.Single
import javax.inject.Inject

class FoodDataRepository @Inject constructor(
    private val foodDataSourceFactory: FoodDataSourceFactory,
    private val foodMapper: FoodMapper
) : FoodRepository {

    override fun getFood(): Single<FoodList> {
        return foodDataSourceFactory.create(CacheStrategy.ONLINE_FIRST).getFood().map { data ->
            foodMapper.toDomain(data)
        }
    }


}