package com.awizhe.food.model.home

import com.awizhe.food.model.base.PresentationModel

data class FoodPresentation(

    val fooddiscount: String? = null,
    val featured: String? = null,
    val foodname: String? = null,
    val foodimage: String? = null,
    val foodenable: String? = null,
    val foodprice: String? = null,
    val fooddesc: String? = null,
    val id: String? = null,
    val category: String? = null
) : PresentationModel