package com.application.app.modules.description1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDescription1Binding
import com.application.app.modules.description1.`data`.viewmodel.Description1VM
import kotlin.String
import kotlin.Unit

public class Description1Activity :
    BaseActivity<ActivityDescription1Binding>(R.layout.activity_description1) {
  private val viewModel: Description1VM by viewModels<Description1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.description1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "DESCRIPTION1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Description1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
