package com.github.ferum_bot.x_messenger

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeBottomNavigationBarColor()
    }

    private fun changeBottomNavigationBarColor() {
        window.navigationBarColor = Color.BLACK
    }
}