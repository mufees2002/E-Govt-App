package com.application.app.modules.testpattern1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Testpattern1Model(
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
  public var txtAboutTheExam: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_about_the_exam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGATEGraduate: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gate_graduate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAPPLY: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)

)
