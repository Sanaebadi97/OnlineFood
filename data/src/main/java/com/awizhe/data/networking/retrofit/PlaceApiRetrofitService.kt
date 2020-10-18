//package info.sanaebadi.data.networking.retrofit
//
//import info.sanaebadi.data.entity.place.favorite.FavoriteEntity
//import info.sanaebadi.data.entity.place.places.PlaceListEntity
//import info.sanaebadi.data.entity.place.promoted.PromotedListEntity
//import io.reactivex.Single
//import retrofit2.http.GET
//
//interface PlaceApiRetrofitService {
//    @GET("places")
//    fun getPlaces(): Single<PlaceListEntity>
//
//    @GET("promoted")
//    fun getPromotedPlaces(): Single<PromotedListEntity>
//
//    @GET("favorites")
//    fun getFavorites(): Single<FavoriteEntity>
//}