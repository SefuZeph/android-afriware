package com.example.android.android_afriware.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Bookmark(
    @ColumnInfo(name = "internal_id") @PrimaryKey(autoGenerate = true) val internalId: Long = 0
)