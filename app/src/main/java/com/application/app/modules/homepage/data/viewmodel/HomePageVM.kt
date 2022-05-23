package com.application.app.modules.homepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.homepage.`data`.model.HomePageModel
import org.koin.core.KoinComponent

public class HomePageVM : ViewModel(), KoinComponent {
  public val homePageModel: MutableLiveData<HomePageModel> = MutableLiveData(HomePageModel())

  public var navArguments: Bundle? = null
}
