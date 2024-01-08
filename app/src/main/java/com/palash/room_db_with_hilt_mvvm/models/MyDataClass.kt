package com.palash.room_db_with_hilt_mvvm.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("emp")
data class MyDataClass(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val phone:Long
    )
