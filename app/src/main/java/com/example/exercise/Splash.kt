package com.example.exercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //This is to hide the top bar of the activity screen
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash)

        //Using handler to make the screen temporary
        Handler(Looper.myLooper() !!).postDelayed({
            //Intent to switch to the next page
            startActivity(Intent(this, MainActivity:: class.java))
            finish()

        }, 4000) //Duration of the splash screen (4.0 seconds)
    }
}