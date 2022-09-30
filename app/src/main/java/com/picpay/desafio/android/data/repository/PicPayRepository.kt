package com.picpay.desafio.android.data.repository

import com.picpay.desafio.android.ui.User

interface PicPayRepository {
    suspend fun getUsers(): List<User>
}