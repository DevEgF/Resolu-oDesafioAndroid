package com.picpay.desafio.android.data.repository

import com.picpay.desafio.android.data.datasource.PicPayDataSource
import com.picpay.desafio.android.data.response.UserResponse
import com.picpay.desafio.android.ui.User
import com.picpay.desafio.android.utils.toUser
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import javax.inject.Inject

class PicPayRepositoryImpl @Inject constructor(
    private val dataSource: PicPayDataSource
) : PicPayRepository {

    private val latestUsersMutex = Mutex()

    private var latestUsers: List<User> = emptyList()

    suspend fun getLatestNews(refresh: Boolean = false): List<User> {
        if (refresh || latestUsers.isEmpty()) {
            val networkResult = dataSource.getUsers().map { userResponse -> userResponse.toUser()}
            latestUsersMutex.withLock {
                this.latestUsers = networkResult
            }
        }

        return latestUsersMutex.withLock { this.latestUsers }
    }

    override suspend fun getUsers(): List<User> {
        return dataSource.getUsers()
            .map { userResponse -> userResponse.toUser() }
    }
}