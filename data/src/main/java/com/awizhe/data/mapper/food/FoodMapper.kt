package com.awizhe.data.mapper.food

import com.awizhe.data.entity.food.FoodEntity
import com.awizhe.data.entity.food.FoodListEntity
import com.awizhe.data.mapper.base.DataLayerMapper
import com.awizhe.domain.model.home.Food
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FoodMapper @Inject constructor() : DataLayerMapper<FoodEntity, Food> {


    fun toDomain(foodListEntity: List<FoodEntity>): List<Food> {
        val mFoodList: MutableList<Food> = ArrayList<Food>()

        for (foodItem in foodListEntity) {
            mFoodList.add(toDomain(foodItem))
        }

        return mFoodList
    }


    override fun toDomain(e: FoodEntity?): Food {
//        return Food(
//            e?.fooddiscount,
//            e?.featured,
//            e?.foodname,
//            e?.foodimage,
//            e?.foodenable,
//            e?.foodprice,
//            e?.fooddesc,
//            e?.id,
//            e?.category
//        )
        return Food(
            "5",
            "JHUJHN",
            "OIJIKUHJIKUH",
            "https://i.stack.imgur.com/fCjAE.jpg?s=32&g=1",
            "KIIJNJHNK",
            "35$",
            "IJIKaduhsufehru",
            "85",
            "kjnjkncs"
        )
    }

    override fun toEntity(d: Food?): FoodEntity? {
        return null
    }
}