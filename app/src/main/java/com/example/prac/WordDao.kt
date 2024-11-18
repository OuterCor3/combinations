package com.example.prac

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface WordDao{
    @Query("SELECT * FROM credentials ORDER BY id ASC")
    fun getCredentials(): LiveData<List<Credentials>>


    @Update
    suspend fun updateCredentials(credential: Credentials)


}