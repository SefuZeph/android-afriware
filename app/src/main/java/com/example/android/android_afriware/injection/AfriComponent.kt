package com.example.android.android_afriware.injection

import com.example.android.android_afriware.AfriApplication
import com.example.android.android_afriware.database.AppDatabase
import com.example.android.android_afriware.database.AppDatabaseModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AfriApplicationModule::class, AppDatabaseModule::class])
interface AfriComponent : AndroidInjector<AfriApplication> {

    fun appDatabase(): AppDatabase
}