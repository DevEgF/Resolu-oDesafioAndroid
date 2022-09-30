package com.picpay.desafio.android.data.datasource

import com.picpay.desafio.android.data.response.UserResponse

interface PicPayDataSource {
    suspend fun getUsers(): List<UserResponse>
}