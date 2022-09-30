package com.picpay.desafio.android.utils

import com.picpay.desafio.android.data.response.UserResponse
import com.picpay.desafio.android.ui.User

fun UserResponse.toUser() = User(
    id = id,
    name = name,
    img = img,
    username = username
)
