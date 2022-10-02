package com.picpay.desafio.android

import com.picpay.desafio.android.extension.InstantTaskExecutorExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


@ExtendWith(InstantTaskExecutorExtension::class)
class ExampleServiceTest {
//
//    private val picpayService = Mockito.mock(PicPayService::class.java, Mockito.RETURNS_DEEP_STUBS)
//    private val viewModel = ContactListViewModel(picpayService)
//    private val contactListObserver = Mockito.mock(Observer::class.java) as Observer<Resource<List<UserResponse>>>


    //    @OptIn(DelicateCoroutinesApi::class)
//    private val mainThreadSurrogate = newSingleThreadContext("UI thread")
//
//    @BeforeEach
//    fun setup() {
//        Dispatchers.setMain(mainThreadSurrogate)
//        viewModel.adverseEvent.observeForever(contactListObserver)
//        mockkStatic(Log::class)
//        every { Log.e(any(), any()) } returns 0
//    }
//
//    @AfterEach
//    fun tearDown() {
//        Dispatchers.resetMain() // reset the main dispatcher to the original Main dispatcher
//        mainThreadSurrogate.close()
//    }
//
//    @Test
//    fun `Given a valid list When getUsers Then result success response`() {
//        //Given
//       val id : String,
//       val name : String,
//       val img: String,
//       val username: String
//       val response = Response.success(listOf(UserResponse()))
//       val call =
//            Mockito.mock(Call::class.java) as Call<List<UserResponse>>
//
//        Mockito.doAnswer {
//            val callback = it.arguments[0] as Callback<List<UserResponse>>
//            callback.onResponse(call, response)
//            null
//        }.`when`(call).enqueue(Mockito.any())
//
//        Mockito.`when`(
//            picPayService.getUsers(
//                val id : String,
//                val name : String,
//                val img: String,
//                val username: String
//        )).thenReturn(call)
//
//        //When
//        viewModel.getUsers()
//
//        //Then
//        Mockito.verify(contactListObserver).onChanged(Resource.loading(null))
//        Mockito.verify(contactListObserver)
//            .onChanged(Resource.success(listOf(UserResponse())))
//    }
//

}