package com.reihan.reogapp.ui.login

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.reihan.reogapp.MainActivity
import com.reihan.reogapp.databinding.ActivityLoginBinding
import com.reihan.reogapp.preferences.ReogModel
import com.reihan.reogapp.preferences.ReogPreference
import com.reihan.reogapp.ui.register.RegisterActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val viewModel by viewModels<LoginViewModel>()
    @Inject
    lateinit var reogPreference: ReogPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.hyperlinkRegisterButton.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }

        binding.btnAlternativeGuest.setOnClickListener {
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
            finish()
        }

        binding.etEmailLogin.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (binding.etEmailLogin.error == null) {
                    isEnable()
                }
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        binding.etPasswordLogin.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (binding.etPasswordLogin.error == null) {
                    isEnable()
                }
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        binding.loginButton.setOnClickListener {
            val email = binding.etEmailLogin.text.toString()
            val password = binding.etPasswordLogin.text.toString()
            lifecycleScope.launch {
                when (val result = viewModel.loginUser(email, password)) {
                    is LoginViewModel.ResultLogin.Success -> {
                        val userModel = ReogModel(
                            result.data.loginResult.id,
                            result.data.loginResult.name,
                            result.data.loginResult.token
                        )
                        reogPreference.saveUser(userModel)
                        Toast.makeText(this@LoginActivity, "Welcome ${userModel.name}", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                        finish()
                    }

                    is LoginViewModel.ResultLogin.Error -> {
                        Toast.makeText(this@LoginActivity, result.error, Toast.LENGTH_SHORT).show()
                    }
                }
            }
            viewModel.showLoading.observe(this@LoginActivity) {
                showLoading(it)
            }
        }

        enableButton()
        animateElements()
    }

    private fun enableButton() {
        binding.loginButton.isEnabled = false
    }

    private fun animateElements() {
        binding.ivLauncherReog.alpha = 0f
        binding.tvLauncherTitle.alpha = 0f
        binding.loginAuthenticationLabel.alpha = 0f
        binding.etEmailLogin.alpha = 0f
        binding.etPasswordLogin.alpha = 0f
        binding.loginButton.alpha = 0f
        binding.registerLabel.alpha = 0f
        binding.hyperlinkRegisterButton.alpha = 0f

        val duration = 1000L
        val delay = 2000L

        val animatorSet = AnimatorSet()
        animatorSet.playSequentially(
            ObjectAnimator.ofFloat(binding.ivLauncherReog, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.tvLauncherTitle, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.loginAuthenticationLabel, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.etEmailLogin, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.etPasswordLogin, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.loginButton, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.registerLabel, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(binding.hyperlinkRegisterButton, "alpha", 0f, 1f)
        )
        animatorSet.duration = duration
        lifecycleScope.launch {
            delay(delay)
            animatorSet.start()
        }
    }

    private fun isEnable() {
        val email = binding.etEmailLogin.text
        val password = binding.etPasswordLogin.text

        binding.loginButton.isEnabled = !email.isNullOrEmpty() && !password.isNullOrEmpty()
    }

    private fun showLoading(it: Boolean) {
        binding.progressBar.visibility = if (it) View.VISIBLE else View.GONE
        binding.loginButton.isEnabled = !it
    }
}