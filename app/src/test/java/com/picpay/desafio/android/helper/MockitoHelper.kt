package com.picpay.desafio.android.helper

import okhttp3.ResponseBody
import org.mockito.Mockito
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object MockitoHelper {

    fun <T> anyObject(): T {
        Mockito.any<T>()
        return uninitialized()
    }

    @Suppress("UNCHECKED_CAST")
    fun <T> uninitialized(): T = null as T

    inline fun <reified T : Any> mockGenericClass() = Mockito.mock(T::class.java)

    inline fun <reified T> validateOnResponseSuccessful(
        call: Call<T>, response: Response<T>,
        executeCode: () -> Unit
    ) {
        val response = Mockito.mock(T::class.java)
        Mockito.doAnswer {
            val argument: Callback<T> = it.getArgument(0)
            argument.onResponse(call, Response.success(response))
        }.`when`(call).enqueue(anyObject())

        executeCode()

        Mockito.verify(response)
    }

    fun <T, U> validateOnResponseErrorCode(
        code: Int, expectedError: U,
        call: Call<T>, response: Response<T>, responseError: Response<T>? = null,
        executeCode: () -> Unit
    ) {
        Mockito.doAnswer {
            val argument: Callback<T> = it.getArgument(0)
            argument.onResponse(
                call,
                responseError ?: Response.error(code, Mockito.mock(ResponseBody::class.java))
            )
        }.`when`(call).enqueue(anyObject())

        executeCode()

        Mockito.verify(response)
    }

}