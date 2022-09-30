package com.picpay.desafio.android.data.response

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val id: String,
    val name: String,
    val img: String,
    val username: String
)