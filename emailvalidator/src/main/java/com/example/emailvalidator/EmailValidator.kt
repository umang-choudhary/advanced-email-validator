package com.example.emailvalidator

import android.text.TextUtils
import android.util.Patterns


class EmailValidator {

    fun isValidEmail(target: CharSequence?): Boolean {
        return if (target == null || TextUtils.isEmpty(target)) {
            false
        } else {
            Patterns.EMAIL_ADDRESS.matcher(target).matches()
        }
    }
}