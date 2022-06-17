package com.example.testapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testapp.remote.ApiConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){
    private var _todo = MutableLiveData<TodosResponse>()
    val todo get() = _todo

    fun getAll() {
        CoroutineScope(Dispatchers.IO).launch {
            ApiConfig.getApiService().getTodos().let {
                _todo.postValue(it.body())
            }
        }
    }
}