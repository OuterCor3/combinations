package com.example.prac

import androidx.lifecycle.LiveData

class CredRepository(private val wordDao: WordDao) {
    suspend fun addUser(credentials:Credentials){
        wordDao.updateCredentials(credentials)
    }
    suspend fun getAllUsers(): LiveData<List<Credentials>>  {
        return wordDao.getCredentials()
    }
}