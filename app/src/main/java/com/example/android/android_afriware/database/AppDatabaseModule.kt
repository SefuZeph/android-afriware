package com.example.android.android_afriware.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppDatabaseModule constructor(context: Context,test:Boolean=false) {

    private val appDatabase: AppDatabase = if (test) {
        Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java)
            .allowMainThreadQueries()
            .build()
    } else {
        Room.databaseBuilder(context, AppDatabase::class.java, "Afri")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun providesAppDatabase() = appDatabase
}