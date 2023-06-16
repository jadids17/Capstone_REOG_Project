package com.reihan.reogapp.module

import android.content.SharedPreferences
import com.reihan.reogapp.api.ApiService
import com.reihan.reogapp.preferences.ReogPreference
import com.reihan.reogapp.ui.login.LoginRepository
import com.reihan.reogapp.ui.login.LoginViewModel
import com.reihan.reogapp.ui.register.RegisterRepository
import com.reihan.reogapp.ui.register.RegisterViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideRegisterRepository(apiService: ApiService) =
        RegisterRepository(apiService)

    @Provides
    @Singleton
    fun provideLoginRepository(apiService: ApiService) = LoginRepository(apiService)
}

@Module
@InstallIn(SingletonComponent::class)
object ViewModelModule {
    @Provides
    @Singleton
    fun provideRegisterViewModel(registerRepository: RegisterRepository) =
        RegisterViewModel(registerRepository)

    @Provides
    @Singleton
    fun provideLoginViewModel(loginRepository: LoginRepository) = LoginViewModel(loginRepository)

}

@Module
@InstallIn(SingletonComponent::class)
object SharedPreferencesModule {
    @Provides
    @Singleton
    fun provideUserPreferences(sharedPreferences: SharedPreferences) =
        ReogPreference(sharedPreferences)
}