package com.application.app.modules.loginpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.loginpage.`data`.model.LoginPageModel
import org.koin.core.KoinComponent

public class LoginPageVM : ViewModel(), KoinComponent {
  public val loginPageModel: MutableLiveData<LoginPageModel> = MutableLiveData(LoginPageModel())

  public var navArguments: Bundle? = null
}
