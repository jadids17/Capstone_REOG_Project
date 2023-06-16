package com.reihan.reogapp.response

import com.google.gson.annotations.SerializedName

data class LoginResult(

    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("token")
    val token: String
)
