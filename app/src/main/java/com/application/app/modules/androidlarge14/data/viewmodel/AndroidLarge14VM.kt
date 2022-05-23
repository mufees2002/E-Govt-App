package com.application.app.modules.androidlarge14.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.androidlarge14.`data`.model.AndroidLarge14Model
import org.koin.core.KoinComponent

public class AndroidLarge14VM : ViewModel(), KoinComponent {
  public val androidLarge14Model: MutableLiveData<AndroidLarge14Model> =
      MutableLiveData(AndroidLarge14Model())

  public var navArguments: Bundle? = null
}
