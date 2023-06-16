package com.reihan.reogapp.ui.launcher

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Intent
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import com.reihan.reogapp.databinding.ActivityLauncherBinding
import com.reihan.reogapp.ui.login.LoginActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LauncherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLauncherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLauncherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        buttonLauncherListener()
        animateElements()
    }

    private fun buttonLauncherListener() {
        binding.btnLauncher.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun animateElements() {
        val imageObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(
            binding.ivLauncherReog,
            PropertyValuesHolder.ofFloat("scaleX", 0.5f, 1f),
            PropertyValuesHolder.ofFloat("scaleY", 0.5f, 1f),
            PropertyValuesHolder.ofFloat("alpha", 0f, 1f),
            PropertyValuesHolder.ofFloat("translationY", 0f, -30f, 30f, -30f, 0f)
        ).apply {
            duration = 2000
            interpolator = AccelerateDecelerateInterpolator()
        }

        val text1ObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(
            binding.tvLauncherTitle,
            PropertyValuesHolder.ofFloat("alpha", 0f, 1f),
            PropertyValuesHolder.ofFloat("translationY", 100f, 0f)
        ).apply {
            startDelay = 300
            duration = 500
            interpolator = AccelerateDecelerateInterpolator()
        }

        val text2ObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(
            binding.tvTitleLauncher,
            PropertyValuesHolder.ofFloat("alpha", 0f, 1f),
            PropertyValuesHolder.ofFloat("translationY", 100f, 0f)
        ).apply {
            startDelay = 700
            duration = 500
            interpolator = AccelerateDecelerateInterpolator()
        }

        val buttonObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(
            binding.btnLauncher,
            PropertyValuesHolder.ofFloat("alpha", 0f, 1f),
            PropertyValuesHolder.ofFloat("translationY", 100f, 0f)
        ).apply {
            startDelay = 1100
            duration = 500
            interpolator = AccelerateDecelerateInterpolator()
        }

        binding.apply {
            tvLauncherTitle.alpha = 0f
            tvTitleLauncher.alpha = 0f
            btnLauncher.alpha = 0f
        }

        AnimatorSet().apply {
            play(imageObjectAnimator).before(text1ObjectAnimator)
            play(text1ObjectAnimator).before(text2ObjectAnimator)
            play(text2ObjectAnimator).before(buttonObjectAnimator)
            start()
        }
    }

}