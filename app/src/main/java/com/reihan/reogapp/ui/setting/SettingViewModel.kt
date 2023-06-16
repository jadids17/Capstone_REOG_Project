//package com.reihan.reogapp.ui.setting
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import androidx.lifecycle.asLiveData
//import androidx.lifecycle.viewModelScope
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//@HiltViewModel
//class SettingViewModel @Inject constructor(private val pref: SettingPreferences) : ViewModel() {
//    fun getThemeSettings(): LiveData<Boolean> {
//        return pref.getThemeSetting().asLiveData()
//    }
//
//    fun saveThemeSetting(isDarkModeActive: Boolean) {
//        viewModelScope.launch {
//            pref.saveThemeSetting(isDarkModeActive)
//        }
//    }
//
//    class ViewModelFactory(private val pref: SettingPreferences) :
//        ViewModelProvider.NewInstanceFactory() {
//
//        @Suppress("UNCHECKED_CAST")
//        override fun <T : ViewModel> create(modelClass: Class<T>): T {
//            if (modelClass.isAssignableFrom(SettingViewModel::class.java)) {
//                return SettingViewModel(pref) as T
//            }
//            throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
//        }
//    }
//}