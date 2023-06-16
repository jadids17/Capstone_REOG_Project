//package com.reihan.reogapp.ui.setting
//
//import android.content.Context
//import android.os.Bundle
//import android.widget.CompoundButton
//import androidx.appcompat.app.AppCompatActivity
//import androidx.appcompat.app.AppCompatDelegate
//import androidx.datastore.core.DataStore
//import androidx.datastore.preferences.core.Preferences
//import androidx.datastore.preferences.preferencesDataStore
//import androidx.lifecycle.ViewModelProvider
//import com.reihan.reogapp.R
//import com.reihan.reogapp.databinding.ActivitySettingBinding
//import dagger.hilt.android.AndroidEntryPoint
//
//private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")
//
//@AndroidEntryPoint
//class SettingActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivitySettingBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivitySettingBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        val actionBar = supportActionBar
//        actionBar?.title = getString(R.string.display)
//
//        val switchTheme = binding.switchTheme
//
//        val pref = SettingPreferences.getInstance(dataStore)
//        val settingViewModel = ViewModelProvider(
//            this,
//            SettingViewModel.ViewModelFactory(pref)
//        )[SettingViewModel::class.java]
//
//        settingViewModel.getThemeSettings().observe(this) { isDarkModeActive: Boolean ->
//            if (isDarkModeActive) {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//                switchTheme.isChecked = true
//            } else {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//                switchTheme.isChecked = false
//            }
//        }
//
//        switchTheme.setOnCheckedChangeListener { _: CompoundButton?, isChecked: Boolean ->
//            settingViewModel.saveThemeSetting(isChecked)
//        }
//    }
//}