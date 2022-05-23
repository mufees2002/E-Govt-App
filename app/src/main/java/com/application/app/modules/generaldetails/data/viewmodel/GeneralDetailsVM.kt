package com.application.app.modules.generaldetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.generaldetails.`data`.model.GeneralDetails1RowModel
import com.application.app.modules.generaldetails.`data`.model.GeneralDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class GeneralDetailsVM : ViewModel(), KoinComponent {
  public val generalDetailsModel: MutableLiveData<GeneralDetailsModel> =
      MutableLiveData(GeneralDetailsModel())

  public var navArguments: Bundle? = null

  public val recyclerGeneralDetailsList: MutableLiveData<MutableList<GeneralDetails1RowModel>> =
      MutableLiveData(mutableListOf())
}
