package com.awizhe.data.repository.dataSourceImpl.food

import com.awizhe.data.entity.food.FoodEntity
import com.awizhe.data.networking.base.AbstractService
import com.awizhe.data.networking.retrofit.FoodRetrofitService
import com.awizhe.data.repository.dataSource.food.FoodDataSource
import io.reactivex.Single

class FoodOnlineDataSource : AbstractService<FoodRetrofitService>(FoodRetrofitService::class.java),
    FoodDataSource {

    override fun getFood(): Single<List<FoodEntity>> {
        return service.getFood()
    }

}