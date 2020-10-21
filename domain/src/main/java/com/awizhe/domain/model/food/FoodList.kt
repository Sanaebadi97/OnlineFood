package com.awizhe.domain.model.food

import info.sanaebadi.domain.model.base.BaseDomainModel

class FoodList(
    val foodList: MutableList<Food>? = null
) : BaseDomainModel