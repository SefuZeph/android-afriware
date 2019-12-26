package com.example.android.android_afriware.database

import androidx.room.TypeConverter
import org.joda.time.Instant
import org.joda.time.LocalDate
import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Custom database fields converters
 */
class Converters {
    @TypeConverter
    fun bigDecimalToString(bigDecimal: BigDecimal?): String? =
        bigDecimal?.setScale(4, RoundingMode.UP)?.toString()

    @TypeConverter
    fun stringToBigDecimal(value: String?): BigDecimal? =
        if (value == null) null else BigDecimal(value)

    @TypeConverter
    fun localDateToString(localDate: LocalDate?): String? = localDate?.toString()

    @TypeConverter
    fun stringToLocaleDate(value: String?): LocalDate? =
        if (value == null) null else LocalDate.parse(value)

    @TypeConverter
    fun instantToString(instant: Instant?): String? = instant?.toString()

    @TypeConverter
    fun stringToInstant(value: String?) = if (value == null) null else Instant.parse(value)

    @TypeConverter
    fun setToString(value: Set<String>?): String? = value?.joinToString(",")

    @TypeConverter
    fun stringToSet(value: String?): Set<String>? = value?.split(',')?.toSet()
}