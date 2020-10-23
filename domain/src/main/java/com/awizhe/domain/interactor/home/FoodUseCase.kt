package com.awizhe.domain.interactor.home

import com.awizhe.domain.model.home.Food
import com.awizhe.domain.repository.home.FoodRepository
import info.sanaebadi.domain.executor.PostExecutionThread
import info.sanaebadi.domain.executor.ThreadExecutor
import info.sanaebadi.domain.interactor.base.SingleUseCase
import io.reactivex.Single
import javax.inject.Inject

class FoodUseCase @Inject constructor(
    private val foodRepository: FoodRepository,
    threadExecutor: ThreadExecutor,
    postExecutionThread: PostExecutionThread,
) : SingleUseCase<List<Food>, String>(threadExecutor, postExecutionThread) {

    override fun buildUseCaseSingle(params: String): Single<List<Food>> {
        return foodRepository.getFood()
    }

}