//package info.sanaebadi.data.repository.dataSource.place
//
//import info.sanaebadi.data.mapper.place.favorite.FavoriteDataMapper
//import info.sanaebadi.data.mapper.place.places.PlaceDataMapper
//import info.sanaebadi.data.mapper.place.places.PromotedMapper
//import info.sanaebadi.domain.model.place.favorite.FavoriteListItem
//import info.sanaebadi.domain.model.place.places.PlaceListModel
//import info.sanaebadi.domain.model.place.promoted.PromotedListModel
//import info.sanaebadi.domain.repository.CacheStrategy
//import info.sanaebadi.domain.repository.place.places.PlaceRepository
//import io.reactivex.Single
//import javax.inject.Inject
//
//class PlaceDataRepository @Inject constructor(
//    private val placeDataSourceFactory: PlaceDataSourceFactory,
//    private val promotedMapper: PromotedMapper,
//    private val placeDataMapper: PlaceDataMapper,
//    private val favoriteDataMapper: FavoriteDataMapper
//) : PlaceRepository {
//
//    override fun getPlaces(): Single<PlaceListModel> {
//        return placeDataSourceFactory.create(CacheStrategy.ONLINE_FIRST).getPlaces().map { data ->
//            placeDataMapper.toDomain(data)
//
//        }
//    }
//
//    override fun getPromoted(): Single<PromotedListModel> {
//        return placeDataSourceFactory.create(CacheStrategy.ONLINE_FIRST).getPromoted().map { data ->
//            promotedMapper.toDomain(data)
//        }
//    }
//
//    override fun getFavorites(): Single<FavoriteListItem> {
//        return placeDataSourceFactory.create(CacheStrategy.ONLINE_FIRST).getFavorites()
//            .map { data ->
//                favoriteDataMapper.toDomain(data)
//            }
//    }
//
//}
