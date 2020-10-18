package com.awizhe.food.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import com.awizhe.food.global.FoodApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ApplicationModule::class, BuildersModule::class, ViewModelModule::class])

interface ApplicationComponent : AndroidInjector<FoodApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: FoodApplication): Builder

        fun build(): ApplicationComponent
    }
}