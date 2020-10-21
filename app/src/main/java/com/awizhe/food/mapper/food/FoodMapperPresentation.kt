package com.awizhe.food.mapper.food

import com.awizhe.domain.model.food.Food
import com.awizhe.domain.model.food.FoodList
import com.awizhe.food.mapper.base.PresentationLayerMapper
import com.awizhe.food.model.food.FoodListPresentation
import com.awizhe.food.model.food.FoodPresentation
import javax.inject.Inject

class FoodMapperPresentation @Inject constructor() :
    PresentationLayerMapper<FoodPresentation, Food> {

    override fun toDomain(p: FoodPresentation): Food? {
        return null
    }

    override fun toPresentation(d: Food): FoodPresentation {
        return FoodPresentation(
            d.fooddiscount,
            d.featured,
            d.foodname,
            d.foodimage,
            d.foodenable,
            d.foodprice,
            d.fooddesc,
            d.id,
            d.category
        )
    }

    fun toPresentation(mFoodList: FoodList): FoodListPresentation {
        val itemPresentationList: MutableList<FoodPresentation> = ArrayList<FoodPresentation>()

        for (food: Food in mFoodList.foodList!!) {
            itemPresentationList.add(toPresentation(food))
        }

        return FoodListPresentation(itemPresentationList)
    }



}