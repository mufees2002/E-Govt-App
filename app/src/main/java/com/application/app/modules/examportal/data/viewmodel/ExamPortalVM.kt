package com.application.app.modules.examportal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.examportal.`data`.model.ExamPortalModel
import org.koin.core.KoinComponent

public class ExamPortalVM : ViewModel(), KoinComponent {
  public val examPortalModel: MutableLiveData<ExamPortalModel> = MutableLiveData(ExamPortalModel())

  public var navArguments: Bundle? = null
}
