package com.application.app.modules.testpattern1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTestpattern1Binding
import com.application.app.modules.testpattern1.`data`.viewmodel.Testpattern1VM
import kotlin.String
import kotlin.Unit

public class Testpattern1Activity :
    BaseActivity<ActivityTestpattern1Binding>(R.layout.activity_testpattern1) {
  private val viewModel: Testpattern1VM by viewModels<Testpattern1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.testpattern1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "TESTPATTERN1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Testpattern1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
