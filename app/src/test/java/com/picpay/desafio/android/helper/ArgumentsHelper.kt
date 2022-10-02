package com.picpay.desafio.android.helper

import java.net.HttpURLConnection

object ArgumentsHelper {
    @JvmStatic
    fun provideHttpErrorCodes(): List<Int> {
        return (HttpURLConnection.HTTP_BAD_REQUEST..HttpURLConnection.HTTP_REQ_TOO_LONG).toList()
    }
}