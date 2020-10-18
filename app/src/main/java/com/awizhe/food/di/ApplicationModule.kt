package com.awizhe.food.di

import android.content.Context
import com.awizhe.data.executor.JobExecutor
import com.awizhe.food.executors.UIThread
import com.awizhe.food.global.FoodApplication
import com.awizhe.food.util.AppSchedulerProvider
import com.awizhe.food.util.ConnectionHelper
import com.awizhe.food.util.PreferencesHelper
import com.awizhe.food.util.SchedulerProvider
import dagger.Module
import dagger.Provides
import info.sanaebadi.domain.executor.PostExecutionThread
import info.sanaebadi.domain.executor.ThreadExecutor
import javax.inject.Singleton

@Module
class ApplicationModule {

    //TODO:DEFINE REPOSITORY AND CACHE HERE

    @Provides
    internal fun provideContext(application: FoodApplication): Context {
        return application.applicationContext
    }


    @Provides
    @Singleton
    internal fun providesThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor {
        return jobExecutor
    }

    @Provides
    @Singleton
    internal fun providesPostExecutionThread(uiThread: UIThread): PostExecutionThread {
        return uiThread
    }

//    @Provides
//    @Singleton
//    fun providePlaceRepository(placeDataRepository: PlaceDataRepository): PlaceRepository {
//        return placeDataRepository
//    }


    @Provides
    @Singleton
    fun provideConnectionHelper(context: Context) = ConnectionHelper(context)

    @Provides
    @Singleton
    fun providePreferencesHelper(context: Context) = PreferencesHelper(context)


    @Provides
    @Singleton
    fun provideSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()

}