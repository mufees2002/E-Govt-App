package com.application.app.modules.androidlarge14.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAndroidLarge14Binding
import com.application.app.modules.androidlarge14.`data`.viewmodel.AndroidLarge14VM
import kotlin.String
import kotlin.Unit

public class AndroidLarge14Activity :
    BaseActivity<ActivityAndroidLarge14Binding>(R.layout.activity_android_large_14) {
  private val viewModel: AndroidLarge14VM by viewModels<AndroidLarge14VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLarge14VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ANDROID_LARGE14ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLarge14Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
