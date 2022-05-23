package com.application.app.modules.androidlarge14.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AndroidLarge14Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDETAILS: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
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
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description)
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
  public var txtPreliminaryExa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_preliminary_exa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAPPLY: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)

)
