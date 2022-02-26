package com.example.mylibraries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.emailvalidator.EmailValidator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = "umang.choudhary1410@gmail.com"

        val emailValidator = EmailValidator()
        val result = emailValidator.isValidEmail(email)
    }
}