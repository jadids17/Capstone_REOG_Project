package com.reihan.reogapp.customui

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.text.Editable
import android.text.TextWatcher
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import com.reihan.reogapp.R

class CustomPassword : AppCompatEditText {
    private lateinit var showPasswordButtonImage: Drawable
    private lateinit var hidePasswordButtonImage: Drawable
    private var isPasswordVisible = false

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        hint = context.getString(R.string.UI_hint_password)
        textAlignment = TEXT_ALIGNMENT_VIEW_START
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun init() {
        showPasswordButtonImage = ContextCompat.getDrawable(context, R.drawable.ic_show_password)!!
        hidePasswordButtonImage = ContextCompat.getDrawable(context, R.drawable.ic_hide_password)!!
        setOnTouchListener { _, event ->
            val isButtonClicked = event.x >= (width - paddingEnd - hidePasswordButtonImage.intrinsicWidth)
            if (isButtonClicked) {
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        togglePasswordVisibility()
                        return@setOnTouchListener true
                    }
                    MotionEvent.ACTION_UP -> {
                        togglePasswordVisibility()
                        return@setOnTouchListener true
                    }
                }
            }
            return@setOnTouchListener false
        }

        addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable) {
                validateInput(s)
            }
        })
    }

    private fun togglePasswordVisibility() {
        isPasswordVisible = !isPasswordVisible
        transformationMethod = if (isPasswordVisible) null else PasswordTransformationMethod.getInstance()
        val buttonImage = if (isPasswordVisible) hidePasswordButtonImage else showPasswordButtonImage
        setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, buttonImage, null)
    }

    private fun validateInput(input: CharSequence?) {
        error = when {
            input.isNullOrEmpty() -> context.getString(R.string.UI_warning_empty_password)
            input.length < 8 -> context.getString(R.string.UI_warning_invalid_password)
            else -> null
        }
    }
}
