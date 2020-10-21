package com.awizhe.data.networking.retrofit

import com.awizhe.data.entity.food.FoodListEntity
import io.reactivex.Single
import retrofit2.http.GET

interface FoodRetrofitService {
    @GET("places")
    fun getFood(): Single<FoodListEntity>

}