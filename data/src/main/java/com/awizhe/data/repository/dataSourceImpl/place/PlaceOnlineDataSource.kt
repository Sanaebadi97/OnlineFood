//package info.sanaebadi.data.repository.dataSourceImpl.place
//
//import info.sanaebadi.data.entity.place.favorite.FavoriteEntity
//import info.sanaebadi.data.entity.place.places.PlaceListEntity
//import info.sanaebadi.data.entity.place.promoted.PromotedListEntity
//import info.sanaebadi.data.networking.base.AbstractService
//import info.sanaebadi.data.networking.retrofit.PlaceApiRetrofitService
//import info.sanaebadi.data.repository.dataSource.place.PlaceDataSource
//import io.reactivex.Single
//
//class PlaceOnlineDataSource :
//    AbstractService<PlaceApiRetrofitService>(PlaceApiRetrofitService::class.java), PlaceDataSource {
//
//    override fun getPromoted(): Single<PromotedListEntity> {
//        return service.getPromotedPlaces()
//    }
//
//    override fun getFavorites(): Single<FavoriteEntity> {
//        return service.getFavorites()
//    }
//
//    override fun getPlaces(): Single<PlaceListEntity> {
//        return service.getPlaces()
//    }
//
//
//}