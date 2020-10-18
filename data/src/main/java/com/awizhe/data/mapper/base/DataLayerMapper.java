package com.awizhe.data.mapper.base;


import com.awizhe.data.entity.base.BaseEntity;
import info.sanaebadi.domain.model.base.BaseDomainModel;

public interface DataLayerMapper<E extends BaseEntity, D extends BaseDomainModel> {

    D toDomain(E e);

    E toEntity(D d);

}
