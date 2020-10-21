package com.awizhe.domain.interactor.food

import com.awizhe.domain.model.food.FoodList
import com.awizhe.domain.repository.food.FoodRepository
import info.sanaebadi.domain.executor.PostExecutionThread
import info.sanaebadi.domain.executor.ThreadExecutor
import info.sanaebadi.domain.interactor.base.SingleUseCase
import io.reactivex.Single
import javax.inject.Inject

class FoodUseCase @Inject constructor(
    private val foodRepository: FoodRepository,
    threadExecutor: ThreadExecutor,
    postExecutionThread: PostExecutionThread,
) : SingleUseCase<FoodList, String>(threadExecutor, postExecutionThread) {

    override fun buildUseCaseSingle(params: String): Single<FoodList> {
        return foodRepository.getFood()
    }

}