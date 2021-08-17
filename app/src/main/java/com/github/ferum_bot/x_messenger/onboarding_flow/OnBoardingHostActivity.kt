package com.github.ferum_bot.x_messenger.onboarding_flow

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferum_bot.feature_onboarding.OnBoardingActivity
import com.github.ferum_bot.x_messenger.R

class OnBoardingHostActivity : OnBoardingActivity() {

    override fun onFinishOnBoardingClicked() {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}