package com.picpay.desafio.android.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_entity")
class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: String,
    @ColumnInfo
    val name: String,
    @ColumnInfo
    val img: String,
    @ColumnInfo
    val username: String
    )