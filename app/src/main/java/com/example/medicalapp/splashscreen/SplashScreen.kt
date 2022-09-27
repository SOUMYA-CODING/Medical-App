package com.example.medicalapp.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.medicalapp.R
import com.example.medicalapp.onboardingscreen.OnboardingScreen

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Splash Screen
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnboardingScreen::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }
}