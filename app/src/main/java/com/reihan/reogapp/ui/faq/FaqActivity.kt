package com.reihan.reogapp.ui.faq

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.reihan.reogapp.databinding.ActivityFaqBinding

class FaqActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFaqBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaqBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textQuestion1.setOnClickListener {
            toggleVisibility(binding.textAnswer1)
        }

        binding.textQuestion2.setOnClickListener {
            toggleVisibility(binding.textAnswer2)
        }

        binding.textQuestion3.setOnClickListener {
            toggleVisibility(binding.textAnswer3)
        }

        binding.textQuestion4.setOnClickListener {
            toggleVisibility(binding.textAnswer4)
        }

        binding.textQuestion5.setOnClickListener {
            toggleVisibility(binding.textAnswer5)
        }
    }

    private fun toggleVisibility(textView: View) {
        if (textView.visibility == View.GONE) {
            textView.visibility = View.VISIBLE
        } else {
            textView.visibility = View.GONE
        }
    }
}