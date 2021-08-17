package com.ferum_bot.feature_onboarding

import android.os.Bundle
import com.ferum_bot.core_base.BaseActivity

abstract class OnBoardingActivity: BaseActivity() {

    abstract fun onFinishOnBoardingClicked()

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.DefaultAppTheme)
        super.onCreate(savedInstanceState)

    }


}