package com.picpay.desafio.android.data.datasource

import com.picpay.desafio.android.data.response.UserResponse
import com.picpay.desafio.android.data.service.PicPayService
import javax.inject.Inject

class PicPayDataSourceImpl @Inject constructor(
    private val picPayService: PicPayService
) : PicPayDataSource {

    override suspend fun getUsers(): List<UserResponse> {
        return picPayService.getUsers()
    }
}