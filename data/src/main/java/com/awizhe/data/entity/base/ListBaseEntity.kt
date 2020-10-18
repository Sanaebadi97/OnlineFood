package info.sanaebadi.data.entity.base


abstract class ListBaseEntity<T : BaseEntity> : BaseEntity {

    open var list: List<T> = emptyList()
}