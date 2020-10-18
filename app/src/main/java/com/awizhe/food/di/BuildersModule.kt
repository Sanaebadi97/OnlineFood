package com.awizhe.food.di

import com.awizhe.food.mvvm.feature.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    //TODO:DEFINE FRAGMENTS HERE

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity


}