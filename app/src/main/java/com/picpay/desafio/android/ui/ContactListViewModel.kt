package com.picpay.desafio.android.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.picpay.desafio.android.data.database.Entity
import com.picpay.desafio.android.data.database.RoomDataBase
import com.picpay.desafio.android.data.database.UsersRepository
import com.picpay.desafio.android.data.repository.PicPayRepository
import dagger.hilt.android.internal.Contexts.getApplication
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactListViewModel @Inject constructor(
    application: Application,
    private val picPayRepository: PicPayRepository
) : AndroidViewModel(application) {

    private val repository: UsersRepository
    private val readAll: List<Entity>
    private val context = getApplication<Application>().applicationContext


    private val _uiState = MutableLiveData<List<User>>()
    val uiState: LiveData<List<User>> get() = _uiState

    init {
        fetchUsers()
        val noteDB = RoomDataBase.getDatabase(context).userDao()
        repository = UsersRepository(noteDB)
        readAll = repository.getAllUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch(Dispatchers.IO) {
            val newsUsers = picPayRepository.getUsers()
            _uiState.postValue(newsUsers)
        }
    }


}