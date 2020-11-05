package com.awizhe.food.di

import com.awizhe.food.mvvm.feature.view.MainActivity
import com.awizhe.food.mvvm.feature.view.fragment.navigation.*
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    //TODO:DEFINE FRAGMENTS HERE

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity


    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindHomeFragment(): HomeFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindBookmarkFragment(): BookmarkFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindCardFragment(): CardFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindProfileFragment(): ProfileFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindMessageFragment(): MessageFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindSubmitTicketFragment(): SubmitTicketFragment
}