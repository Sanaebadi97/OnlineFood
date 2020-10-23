package com.awizhe.food.mapper.home

import com.awizhe.domain.model.home.Food
import com.awizhe.domain.model.home.FoodList
import com.awizhe.food.mapper.base.PresentationLayerMapper
import com.awizhe.food.model.home.FoodListPresentation
import com.awizhe.food.model.home.FoodPresentation
import javax.inject.Inject

class FoodMapperPresentation @Inject constructor() :
    PresentationLayerMapper<FoodPresentation, Food> {

    override fun toDomain(p: FoodPresentation): Food? {
        return null
    }

    override fun toPresentation(d: Food): FoodPresentation {
//        return FoodPresentation(
//            d.fooddiscount,
//            d.featured,
//            d.foodname,
//            d.foodimage,
//            d.foodenable,
//            d.foodprice,
//            d.fooddesc,
//            d.id,
//            d.category
//        )

        return FoodPresentation(
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

    fun toPresentation(mFoodList: List<Food>): FoodListPresentation {
        val itemPresentationList: MutableList<FoodPresentation> = ArrayList<FoodPresentation>()

        for (food: Food in mFoodList) {
            itemPresentationList.add(toPresentation(food))
        }

        return FoodListPresentation(itemPresentationList)
    }



}