package com.palash.room_db_with_hilt_mvvm.repository

import com.palash.room_db_with_hilt_mvvm.api_service.MyDao
import com.palash.room_db_with_hilt_mvvm.models.MyDataClass
import javax.inject.Inject

class MyRepository @Inject constructor(private val myDao: MyDao) {

    fun getAllEntities() = myDao.getAllList()

    suspend fun insert(myDataClass: MyDataClass) {
        myDao.insert(myDataClass)
    }
}