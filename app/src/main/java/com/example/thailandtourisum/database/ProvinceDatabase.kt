package com.example.thailandtourisum.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Province::class],version = 1,exportSchema = false)
abstract class ProvinceDatabase: RoomDatabase(){
    abstract val provinceDatabaseDao: ProvinceDatabaseDao

    companion object{
        @Volatile
        private var INSTANCE : ProvinceDatabase? = null
        fun getInstance( context: Context): ProvinceDatabase{
            synchronized(this){
                var instance = INSTANCE
                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ProvinceDatabase::class.java,
                        "Province_database"
                    )
                    .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}