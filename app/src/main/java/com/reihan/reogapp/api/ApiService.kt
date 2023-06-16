package com.reihan.reogapp.api

import com.reihan.reogapp.response.Login
import com.reihan.reogapp.response.Register
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
    @POST("signup")
    suspend fun reogRegister(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): Register

    @FormUrlEncoded
    @POST("signin")
    suspend fun reogLogin(
        @Field("email") email: String,
        @Field("password") password: String
    ): Login
}