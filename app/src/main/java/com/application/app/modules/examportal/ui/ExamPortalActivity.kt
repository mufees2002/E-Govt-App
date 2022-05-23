package com.application.app.modules.examportal.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityExamPortalBinding
import com.application.app.modules.examportal.`data`.viewmodel.ExamPortalVM
import kotlin.String
import kotlin.Unit

public class ExamPortalActivity :
    BaseActivity<ActivityExamPortalBinding>(R.layout.activity_exam_portal) {
  private val viewModel: ExamPortalVM by viewModels<ExamPortalVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.examPortalVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "EXAM_PORTAL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExamPortalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
