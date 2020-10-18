//package info.sanaebadi.data.repository.dataSource.place
//
//import info.sanaebadi.data.repository.dataSource.base.BaseDataSourceFactory
//import info.sanaebadi.data.repository.dataSourceImpl.place.PlaceOnlineDataSource
//import info.sanaebadi.domain.repository.CacheStrategy
//import io.reactivex.Completable
//import javax.inject.Inject
//
//class PlaceDataSourceFactory @Inject constructor() : BaseDataSourceFactory<PlaceDataSource> {
//
//    override fun create(cacheStrategy: CacheStrategy?, vararg params: String?): PlaceDataSource {
//        return PlaceOnlineDataSource()
//    }
//
//    override fun deleteCache(): Completable? {
//        return null
//    }
//}