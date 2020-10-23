package com.awizhe.food.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.awizhe.food.mvvm.feature.base.ViewModelFactory
import com.awizhe.food.mvvm.viewModel.home.FoodViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class ViewModelModule {

    @Binds
    @Singleton
    abstract fun bindViewModelFactory(factory: ViewModelFactory?): ViewModelProvider.Factory?


    @Binds
    @IntoMap
    @ViewModelKey(FoodViewModel::class)
    abstract fun provideUserViewModel(viewModel: FoodViewModel?): ViewModel?
}