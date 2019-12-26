package com.example.android.android_afriware.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.android.android_afriware.domain.Bookmark

/**
 * Application local database
 * */
@Database(
    entities = [Bookmark::class
    ], version = 1
)
@TypeConverters(Converters::class)
abstract class AppDatabase:RoomDatabase() {
    abstract fun bookmarkDao(): BookmarkDao
}
