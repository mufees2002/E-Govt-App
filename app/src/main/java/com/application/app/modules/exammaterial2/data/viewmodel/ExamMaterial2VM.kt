package com.application.app.modules.exammaterial2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.exammaterial2.`data`.model.ExamMaterial2Model
import org.koin.core.KoinComponent

public class ExamMaterial2VM : ViewModel(), KoinComponent {
  public val examMaterial2Model: MutableLiveData<ExamMaterial2Model> =
      MutableLiveData(ExamMaterial2Model())

  public var navArguments: Bundle? = null
}
