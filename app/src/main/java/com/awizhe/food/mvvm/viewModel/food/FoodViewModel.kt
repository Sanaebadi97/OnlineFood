package com.awizhe.food.mvvm.viewModel.food

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.awizhe.domain.interactor.food.FoodUseCase
import com.awizhe.food.mapper.food.FoodMapperPresentation
import javax.inject.Inject

class FoodViewModel @Inject constructor(
    private val foodUseCase: FoodUseCase,
    private val mapper: FoodMapperPresentation
) : ViewModel()

var foodList = MutableLiveData<MutableViewModel<UserListModelPresentation>>()