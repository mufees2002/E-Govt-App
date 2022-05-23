package com.application.app.modules.description2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.description2.`data`.model.Description2Model
import org.koin.core.KoinComponent

public class Description2VM : ViewModel(), KoinComponent {
  public val description2Model: MutableLiveData<Description2Model> =
      MutableLiveData(Description2Model())

  public var navArguments: Bundle? = null
}
