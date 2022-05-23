package com.application.app.modules.exammaterial1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.exammaterial1.`data`.model.ExamMaterial1Model
import org.koin.core.KoinComponent

public class ExamMaterial1VM : ViewModel(), KoinComponent {
  public val examMaterial1Model: MutableLiveData<ExamMaterial1Model> =
      MutableLiveData(ExamMaterial1Model())

  public var navArguments: Bundle? = null
}
