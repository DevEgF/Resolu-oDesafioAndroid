package com.picpay.desafio.android.data.repository

import com.picpay.desafio.android.data.datasource.PicPayDataSource
import com.picpay.desafio.android.ui.User
import com.picpay.desafio.android.utils.toUser
import javax.inject.Inject

class PicPayRepositoryImpl @Inject constructor(
    private val dataSource: PicPayDataSource
) : PicPayRepository {

    override suspend fun getUsers(): List<User> {
        return dataSource.getUsers()
            .map { userResponse -> userResponse.toUser() }
    }
}