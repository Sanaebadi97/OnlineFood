package com.awizhe.food.mvvm.viewModel.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.awizhe.domain.interactor.home.FoodUseCase
import com.awizhe.domain.model.home.FoodList
import com.awizhe.food.mapper.home.FoodMapperPresentation
import com.awizhe.food.model.home.FoodListPresentation
import com.awizhe.food.mvvm.viewModel.base.MutableViewModel
import info.sanaebadi.domain.interactor.base.BaseSingleObserver
import javax.inject.Inject

class FoodViewModel @Inject constructor(
    private val userCase: FoodUseCase,
    private val mapper: FoodMapperPresentation
) : ViewModel() {

    var foodList = MutableLiveData<MutableViewModel<FoodListPresentation>>()

    fun getUserList() {
        val value = MutableViewModel<FoodListPresentation>()
        value.setLoading(true)
        foodList.postValue(value)

        userCase.execute(object : BaseSingleObserver<FoodList>() {
            override fun onSuccess(t: FoodList) {
                super.onSuccess(t)
                value.setLoading(false)
                value.setThrowable(null)
                value.setData(mapper.toPresentation(t))
                foodList.postValue(value)

            }

            override fun onError(e: Throwable) {
                super.onError(e)
                value.setLoading(false)
                value.setThrowable(e)
                value.setData(null)
                foodList.postValue(value)

            }

        }, "")
    }
}