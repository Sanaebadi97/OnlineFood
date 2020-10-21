package com.awizhe.data.repository.dataSource.food

import com.awizhe.data.repository.dataSource.base.BaseDataSourceFactory
import com.awizhe.data.repository.dataSourceImpl.food.FoodOnlineDataSource
import com.awizhe.domain.repository.CacheStrategy
import io.reactivex.Completable
import javax.inject.Inject

class FoodDataSourceFactory @Inject constructor() : BaseDataSourceFactory<FoodDataSource> {

    override fun create(cacheStrategy: CacheStrategy?, vararg params: String?): FoodDataSource {
        return FoodOnlineDataSource()
    }

    override fun deleteCache(): Completable? {
        return null
    }
}