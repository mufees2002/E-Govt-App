package com.application.app.modules.description2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Description2Model(
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
  public var txtAboutTheExam: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_about_the_exam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUnionPublicSe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_union_public_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAPPLY: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)

)
