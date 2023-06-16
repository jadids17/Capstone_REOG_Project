package com.reihan.reogapp.ui.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.reihan.reogapp.api.ApiService
import com.reihan.reogapp.response.Register
import java.lang.Exception
import javax.inject.Inject

class RegisterRepository @Inject constructor(private val apiService: ApiService){
    sealed class ResultRegister<out T: Any> {
        data class Success<out T : Any>(val data: T) : ResultRegister<T>()
        data class Error(val message: String) : ResultRegister<Nothing>()
    }

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading : LiveData<Boolean>
        get() = _isLoading

    suspend fun register(
        name: String,
        email: String,
        password: String
    ): ResultRegister<Register> {
        _isLoading.value = true
        return try {
            val response = apiService.reogRegister(name, email, password)
            _isLoading.value = false
            ResultRegister.Success(response)
        }catch (e: Exception){
            _isLoading.value = false
            ResultRegister.Error(e.toString())
        }
    }
}