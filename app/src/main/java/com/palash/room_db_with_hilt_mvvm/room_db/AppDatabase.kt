package com.palash.room_db_with_hilt_mvvm.room_db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.palash.room_db_with_hilt_mvvm.api_service.MyDao
import com.palash.room_db_with_hilt_mvvm.models.MyDataClass

@Database(entities = [MyDataClass::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun myDao() : MyDao
}