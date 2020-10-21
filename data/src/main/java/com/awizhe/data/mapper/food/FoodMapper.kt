package com.awizhe.data.mapper.food

import com.awizhe.data.entity.food.FoodEntity
import com.awizhe.data.mapper.base.DataLayerMapper
import com.awizhe.domain.model.food.Food
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FoodMapper @Inject constructor() : DataLayerMapper<FoodEntity, Food> {


    override fun toDomain(e: FoodEntity?): Food {
        return Food(
            e?.fooddiscount,
            e?.featured,
            e?.foodname,
            e?.foodimage,
            e?.foodenable,
            e?.foodprice,
            e?.fooddesc,
            e?.id,
            e?.category
        )
    }

    override fun toEntity(d: Food?): FoodEntity? {
        return null
    }
}