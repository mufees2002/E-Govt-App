package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.androidlarge14.ui.AndroidLarge14Activity
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.description1.ui.Description1Activity
import com.application.app.modules.description2.ui.Description2Activity
import com.application.app.modules.exammaterial1.ui.ExamMaterial1Activity
import com.application.app.modules.exammaterial2.ui.ExamMaterial2Activity
import com.application.app.modules.examportal.ui.ExamPortalActivity
import com.application.app.modules.generaldetails.ui.GeneralDetailsActivity
import com.application.app.modules.homepage.ui.HomePageActivity
import com.application.app.modules.jobsportal.ui.JobsPortalActivity
import com.application.app.modules.loginpage.ui.LoginPageActivity
import com.application.app.modules.registerpage.ui.RegisterPageActivity
import com.application.app.modules.splashscreen.ui.SplashScreenActivity
import com.application.app.modules.testpattern1.ui.Testpattern1Activity
import com.application.app.modules.uploadpage.ui.UploadPageActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearDescription2.setOnClickListener {
      val destIntent = Description2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAndroidLarge14.setOnClickListener {
      val destIntent = AndroidLarge14Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTestpattern1.setOnClickListener {
      val destIntent = Testpattern1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExamPortal.setOnClickListener {
      val destIntent = ExamPortalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomePage.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExamMaterial2.setOnClickListener {
      val destIntent = ExamMaterial2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGeneralDetails.setOnClickListener {
      val destIntent = GeneralDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExamMaterial1.setOnClickListener {
      val destIntent = ExamMaterial1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginPage.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearUploadPage.setOnClickListener {
      val destIntent = UploadPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRegisterPage.setOnClickListener {
      val destIntent = RegisterPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDescription1.setOnClickListener {
      val destIntent = Description1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearJobsPortal.setOnClickListener {
      val destIntent = JobsPortalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
