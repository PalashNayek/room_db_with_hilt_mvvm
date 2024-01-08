package com.palash.room_db_with_hilt_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.palash.room_db_with_hilt_mvvm.databinding.ActivityMainBinding
import com.palash.room_db_with_hilt_mvvm.models.MyDataClass
import com.palash.room_db_with_hilt_mvvm.view_model.MyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var mainViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel = ViewModelProvider(this)[MyViewModel::class.java]

        mainViewModel.insertNewEmpRecord(MyDataClass(0, "Palash Nayek", 1234567890))

        mainViewModel.getAllEmpRecord().observe(this, Observer {
            Log.d("MyData - ","$it")
        })
       // mainViewModel.getAllEmpRecord().
        binding.btnLogcat.setOnClickListener {

        }

    }
}