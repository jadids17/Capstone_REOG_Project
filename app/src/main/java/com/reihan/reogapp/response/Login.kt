package com.reihan.reogapp.response

import com.google.gson.annotations.SerializedName

data class Login (

    @field:SerializedName("loginResult")
    val loginResult: LoginResult,

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String
)