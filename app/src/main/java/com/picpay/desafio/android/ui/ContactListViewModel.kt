package com.picpay.desafio.android.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.picpay.desafio.android.data.repository.PicPayRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactListViewModel @Inject constructor(
    private val picPayRepository: PicPayRepository
) : ViewModel() {

    private val _uiState = MutableLiveData<List<User>>()
    val uiState: LiveData<List<User>> get() = _uiState

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch(Dispatchers.IO) {
            val newsUsers = picPayRepository.getUsers()
            _uiState.postValue(newsUsers)
        }
    }
}