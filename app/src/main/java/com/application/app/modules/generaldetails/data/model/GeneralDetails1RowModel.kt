package com.application.app.modules.generaldetails.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class GeneralDetails1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = null
)
