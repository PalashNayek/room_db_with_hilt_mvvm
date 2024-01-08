package com.palash.room_db_with_hilt_mvvm.di

import android.content.Context
import androidx.room.Room
import com.palash.room_db_with_hilt_mvvm.api_service.MyDao
import com.palash.room_db_with_hilt_mvvm.room_db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): AppDatabase =
        Room.databaseBuilder(appContext, AppDatabase::class.java, "wass")
            .fallbackToDestructiveMigration().build()

    @Provides
    fun provideDao(database: AppDatabase) : MyDao = database.myDao()
}