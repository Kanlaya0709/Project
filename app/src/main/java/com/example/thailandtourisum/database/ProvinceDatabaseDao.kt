package com.example.thailandtourisum.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.PrimaryKey
import androidx.room.Query

@Dao
interface ProvinceDatabaseDao {

    @Query("SELECT*FROM province_table ORDER BY name_province")
    fun  getAllProvince(): LiveData<List<Province>>
}