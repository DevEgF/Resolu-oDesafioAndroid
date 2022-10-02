package com.picpay.desafio.android.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UsersDao {
    @Insert
    suspend fun insertUsers(entity: Entity)

    @Update
    suspend fun updateUsers(entity: Entity)

    @Query("Select * from users_table")
    fun getAllUsers(): List<Entity>

    @Delete
    suspend fun deleteUsers(entity: Entity)
}