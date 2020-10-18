package com.awizhe.data.entity.base


abstract class ListBaseEntity<T : BaseEntity> : BaseEntity {

    open var list: List<T> = emptyList()
}