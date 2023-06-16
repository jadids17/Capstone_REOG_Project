package com.reihan.reogapp.ui.register

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.reihan.reogapp.R
import com.reihan.reogapp.databinding.ActivityRegisterBinding
import com.reihan.reogapp.ui.login.LoginActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private val viewModel by viewModels<RegisterViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.hyperlinkLoginButton.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        }

        binding.registerButton.setOnClickListener {
            val name = binding.etNameRegister.text.toString()
            val email = binding.etEmailRegister.text.toString()
            val password = binding.etPasswordRegister.text.toString()

            lifecycleScope.launch {
                when (val response = viewModel.userRegister(name, email, password)) {
                    is RegisterViewModel.ResultRegister.Success -> {
                        val data = response.data
                        Toast.makeText(this@RegisterActivity, data.message, Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
                        finish()
                    }
                    is RegisterViewModel.ResultRegister.Error -> {
                        val error = response.error
                        Toast.makeText(this@RegisterActivity, error, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

        enableRegisterButton()
        animateElements()
        enableButton()
    }

    private fun enableButton() {
        binding.registerButton.isEnabled = false
    }

    private fun enableRegisterButton() {
        binding.etNameRegister.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (binding.etNameRegister.error == null){
                    isEnable()
                }
            }
            override fun afterTextChanged(p0: Editable?) {}
        })

        binding.etEmailRegister.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (binding.etEmailRegister.error == null){
                    isEnable()
                }
            }
            override fun afterTextChanged(p0: Editable?) {}
        })

        binding.etPasswordRegister.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (binding.etPasswordRegister.error == null){
                    isEnable()
                }
            }
            override fun afterTextChanged(p0: Editable?) {}
        })
    }

    private fun animateElements() {
        binding.ivLauncherReog.alpha = 0f
        binding.tvLauncherTitle.alpha = 0f
        binding.loginAuthenticationLabel.alpha = 0f
        binding.etEmailRegister.alpha = 0f
        binding.etNameRegister.alpha = 0f
        binding.etPasswordRegister.alpha = 0f
        binding.registerButton.alpha = 0f
        binding.registerLabel.alpha = 0f
        binding.hyperlinkLoginButton.alpha = 0f

        val duration = 1000L
        val delay = 2000L

        val animatorSet = AnimatorSet()
        animatorSet.playSequentially(
            ObjectAnimator.ofFloat(binding.ivLauncherReog, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.tvLauncherTitle, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.loginAuthenticationLabel, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.etEmailRegister, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.etNameRegister, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.etPasswordRegister, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.registerButton, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.registerLabel, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.hyperlinkLoginButton, "alpha", 0f, 1f)
        )
        animatorSet.duration = duration

        lifecycleScope.launch {
            delay(delay)
            animatorSet.start()
        }
    }

    fun isEnable() {
        val name = binding.etNameRegister.text
        val email = binding.etEmailRegister.text
        val password = binding.etPasswordRegister.text
        binding.registerButton.isEnabled =
            !name.isNullOrEmpty() && !email.isNullOrEmpty() && !password.isNullOrEmpty()
                    && binding.etNameRegister.error == null && binding.etEmailRegister.error == null
                    && binding.etPasswordRegister.error == null

        if (!binding.registerButton.isEnabled) {
            binding.registerButton.alpha = 0.5f
        }
        else {
            binding.registerButton.alpha = 1f
        }
    }

    private fun isLoading(it: Boolean) {
        binding.progressBar.visibility = if (it) View.VISIBLE else View.GONE
    }
}