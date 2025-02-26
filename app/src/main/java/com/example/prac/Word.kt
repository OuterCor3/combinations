package com.example.prac

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "credentials")
class Credentials(
    @PrimaryKey (autoGenerate = true)val id: Int = 0,
    @ColumnInfo(name ="username") val username: String = "",
    @ColumnInfo(name ="password") val password: String,
)


