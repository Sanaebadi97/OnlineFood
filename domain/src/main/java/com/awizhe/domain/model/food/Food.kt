package com.awizhe.domain.model.food

import info.sanaebadi.domain.model.base.BaseDomainModel

data class Food(

    val fooddiscount: String? = null,
    val featured: String? = null,
    val foodname: String? = null,
    val foodimage: String? = null,
    val foodenable: String? = null,
    val foodprice: String? = null,
    val fooddesc: String? = null,
    val id: String? = null,
    val category: String? = null
) : BaseDomainModel