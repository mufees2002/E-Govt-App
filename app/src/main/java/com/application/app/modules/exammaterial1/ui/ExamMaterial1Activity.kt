package com.application.app.modules.exammaterial1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityExamMaterial1Binding
import com.application.app.modules.exammaterial1.`data`.viewmodel.ExamMaterial1VM
import kotlin.String
import kotlin.Unit

public class ExamMaterial1Activity :
    BaseActivity<ActivityExamMaterial1Binding>(R.layout.activity_exam_material1) {
  private val viewModel: ExamMaterial1VM by viewModels<ExamMaterial1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.examMaterial1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "EXAM_MATERIAL1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExamMaterial1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
