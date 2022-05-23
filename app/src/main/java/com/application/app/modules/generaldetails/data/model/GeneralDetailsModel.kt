package com.application.app.modules.generaldetails.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class GeneralDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGeneralDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_general_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPhoneNumberValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etStateValue: String? = null
)
