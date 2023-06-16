package com.reihan.reogapp.ui.bansos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reihan.reogapp.R
import com.reihan.reogapp.databinding.ActivityBansosBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BansosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBansosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBansosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}