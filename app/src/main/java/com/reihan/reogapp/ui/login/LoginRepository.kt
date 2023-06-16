package com.reihan.reogapp.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.reihan.reogapp.api.ApiService
import com.reihan.reogapp.response.Login
import java.lang.Exception
import javax.inject.Inject

class LoginRepository @Inject constructor(private val apiService: ApiService) {
    sealed class ResultLogin<out T: Any>{
        data class Success<out T:Any >(val data : T ) : ResultLogin<T>()
        data class Error(val message : String ): ResultLogin<Nothing>()
    }
    private val _showLoading = MutableLiveData<Boolean>()
    val showLoading : LiveData<Boolean>
        get() = _showLoading

    suspend fun login(email: String,password: String ) : ResultLogin<Login>{
        _showLoading.value = true
        return try{
            val response = apiService.reogLogin(email, password)
            _showLoading.value = false
            ResultLogin.Success(response)
        }catch (e: Exception){
            _showLoading.value = false
            ResultLogin.Error("message :${e.message}")
        }
    }
}