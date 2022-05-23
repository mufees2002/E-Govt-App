package com.application.app.modules.exammaterial2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityExamMaterial2Binding
import com.application.app.modules.exammaterial2.`data`.viewmodel.ExamMaterial2VM
import kotlin.String
import kotlin.Unit

public class ExamMaterial2Activity :
    BaseActivity<ActivityExamMaterial2Binding>(R.layout.activity_exam_material2) {
  private val viewModel: ExamMaterial2VM by viewModels<ExamMaterial2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.examMaterial2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "EXAM_MATERIAL2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExamMaterial2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
