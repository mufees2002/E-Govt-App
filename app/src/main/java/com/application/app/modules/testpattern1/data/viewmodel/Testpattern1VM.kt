package com.application.app.modules.testpattern1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.testpattern1.`data`.model.Testpattern1Model
import org.koin.core.KoinComponent

public class Testpattern1VM : ViewModel(), KoinComponent {
  public val testpattern1Model: MutableLiveData<Testpattern1Model> =
      MutableLiveData(Testpattern1Model())

  public var navArguments: Bundle? = null
}
