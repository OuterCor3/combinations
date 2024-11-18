package com.example.prac

import androidx.room.Database
import androidx.room.RoomDatabase
import android.content.Context
import androidx.room.Room


@Database(entities = [Credentials::class], version = 1, exportSchema = false)
abstract class WordRoomDatabases :  RoomDatabase(){
    abstract fun wordDao(): WordDao

    companion object{

        @Volatile
        private var INSTANCE : WordRoomDatabases? = null

        fun getDatabase(context: Context): WordRoomDatabases {
            return INSTANCE?:  synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WordRoomDatabases:: class.java,
                    "cred_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }

}