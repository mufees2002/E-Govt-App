package com.application.app.modules.registerpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.registerpage.`data`.model.RegisterPageModel
import org.koin.core.KoinComponent

public class RegisterPageVM : ViewModel(), KoinComponent {
  public val registerPageModel: MutableLiveData<RegisterPageModel> =
      MutableLiveData(RegisterPageModel())

  public var navArguments: Bundle? = null
}
