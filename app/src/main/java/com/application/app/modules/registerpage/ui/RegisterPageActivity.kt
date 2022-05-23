package com.application.app.modules.registerpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityRegisterPageBinding
import com.application.app.modules.registerpage.`data`.viewmodel.RegisterPageVM
import kotlin.String
import kotlin.Unit

public class RegisterPageActivity :
    BaseActivity<ActivityRegisterPageBinding>(R.layout.activity_register_page) {
  private val viewModel: RegisterPageVM by viewModels<RegisterPageVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerPageVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "REGISTER_PAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
