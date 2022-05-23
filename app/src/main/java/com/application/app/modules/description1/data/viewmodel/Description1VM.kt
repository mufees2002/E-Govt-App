package com.application.app.modules.description1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.description1.`data`.model.Description1Model
import org.koin.core.KoinComponent

public class Description1VM : ViewModel(), KoinComponent {
  public val description1Model: MutableLiveData<Description1Model> =
      MutableLiveData(Description1Model())

  public var navArguments: Bundle? = null
}
