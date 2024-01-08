package com.palash.room_db_with_hilt_mvvm.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.palash.room_db_with_hilt_mvvm.models.MyDataClass
import com.palash.room_db_with_hilt_mvvm.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val myRepository: MyRepository) : ViewModel() {

    fun getAllEmpRecord() = myRepository.getAllEntities()

    fun insertNewEmpRecord(myDataClass: MyDataClass) = viewModelScope.launch {
        myRepository.insert(myDataClass)
    }
}