package com.picpay.desafio.android.data.database

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@androidx.room.Entity (tableName = "users_table")
class Entity (
    @PrimaryKey
    val id: String,
    @ColumnInfo (name = "user_name")
    val name: String,
    @ColumnInfo (name = "user_img")
    val img: String,
    @ColumnInfo (name = "user_id")
    val username: String
)