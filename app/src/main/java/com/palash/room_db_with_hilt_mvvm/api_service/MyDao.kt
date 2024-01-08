package com.palash.room_db_with_hilt_mvvm.api_service

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.palash.room_db_with_hilt_mvvm.models.MyDataClass

@Dao
interface MyDao {

    @Insert
    suspend fun insert(myDataClass: MyDataClass)

    @Query("SELECT * FROM emp")
    fun getAllList() : LiveData<List<MyDataClass>>
}