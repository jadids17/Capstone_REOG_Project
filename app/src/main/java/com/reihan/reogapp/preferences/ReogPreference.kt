package com.reihan.reogapp.preferences

import android.content.SharedPreferences
import androidx.core.content.edit

class ReogPreference(private val sharedPreferences: SharedPreferences) {

    fun saveUser(reogModel: ReogModel) {
        sharedPreferences.edit {
            putString(USER_ID, reogModel.id)
            putString(USER_NAME, reogModel.name)
            putString(USER_TOKEN, reogModel.token)
        }
    }

    fun getUser(): ReogModel? {
        val userId = sharedPreferences.getString(USER_ID, null)
        val name = sharedPreferences.getString(USER_NAME, null)
        val token = sharedPreferences.getString(USER_TOKEN, null)
        return if (userId != null && name != null && token != null) {
            ReogModel(userId, name, token)

        } else {
            null
        }
    }

    fun clearUser() {
        sharedPreferences.edit {
            this.clear()
        }
    }

    companion object {
        const val USER_ID = "user_id"
        const val USER_NAME = "user_name"
        const val USER_TOKEN = "user token"
    }
}