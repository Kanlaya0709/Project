package com.example.thailandtourisum.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "province_table")
data class Province (
    @PrimaryKey
    var provinceId: Int = 0,
    @ColumnInfo(name="name_province")
    var nameProvince: String ,
    @ColumnInfo(name="zone_province")
    var zoneProvince: String

)