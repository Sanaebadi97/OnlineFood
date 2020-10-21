package com.awizhe.data.entity.food

import com.awizhe.data.entity.base.BaseEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FoodEntity(

    @Json(name = "fooddiscount")
    val fooddiscount: String? = null,

    @Json(name = "featured")
    val featured: String? = null,

    @Json(name = "foodname")
    val foodname: String? = null,

    @Json(name = "foodimage")
    val foodimage: String? = null,

    @Json(name = "foodenable")
    val foodenable: String? = null,

    @Json(name = "foodprice")
    val foodprice: String? = null,

    @Json(name = "fooddesc")
    val fooddesc: String? = null,

    @Json(name = "id")
    val id: String? = null,

    @Json(name = "category")
    val category: String? = null
) : BaseEntity
