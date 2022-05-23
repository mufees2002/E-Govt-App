package com.application.app.modules.description2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDescription2Binding
import com.application.app.modules.description2.`data`.viewmodel.Description2VM
import kotlin.String
import kotlin.Unit

public class Description2Activity :
    BaseActivity<ActivityDescription2Binding>(R.layout.activity_description2) {
  private val viewModel: Description2VM by viewModels<Description2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.description2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "DESCRIPTION2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Description2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
