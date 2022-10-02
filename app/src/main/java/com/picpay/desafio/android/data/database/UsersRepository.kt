package com.picpay.desafio.android.data.database

class UsersRepository(private val usersDao: UsersDao) {

    suspend fun insertUsers(entity: Entity) = usersDao.insertUsers(entity)

    suspend fun updateUsers(entity: Entity) = usersDao.updateUsers(entity)

    suspend fun deleteUsers(entity: Entity) = usersDao.deleteUsers(entity)

    fun getAllUsers(): List<Entity> = usersDao.getAllUsers()

}