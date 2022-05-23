package com.application.app.modules.description1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Description1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDETAILS: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTestPattern: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_test_pattern)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPatternForThe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pattern_for_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAptitudeTechn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_aptitude_techn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAPPLY: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)

)
