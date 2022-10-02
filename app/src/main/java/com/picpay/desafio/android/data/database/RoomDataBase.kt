package com.picpay.desafio.android.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Entity::class], version = 1)
abstract class RoomDataBase: RoomDatabase() {

    abstract fun usersDao(): UsersDao

    companion object{
        @Volatile
        private var INSTACE: RoomDatabase? = null

        fun getDatabase(context: Context): RoomDatabase{
            val tempInstance = INSTACE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instace = Room.databaseBuilder(
                    context.applicationContext,
                    RoomDataBase::class.java,
                    "room_database"
                ).build()
                INSTACE = instace
                return instace
            }
        }
    }
}