package com.awizhe.food.mapper.base

import com.awizhe.food.model.base.PresentationModel
import info.sanaebadi.domain.model.base.BaseDomainModel


interface PresentationLayerMapper<P : PresentationModel, D : BaseDomainModel> {
    fun toDomain(p: P): D?

    fun toPresentation(d: D): P?
}