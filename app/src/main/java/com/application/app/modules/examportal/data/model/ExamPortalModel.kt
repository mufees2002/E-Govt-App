package com.application.app.modules.examportal.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ExamPortalModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNEWS: String? = MyApp.getInstance().resources.getString(R.string.lbl_news)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEXAMS: String? = MyApp.getInstance().resources.getString(R.string.lbl_exams)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNAMEOFTHEEXA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_the_exa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNAMEOFTHEEX: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_the_ex)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNAMEOFTHEEXA1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_the_exa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNAMEOFTHEEXA2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_the_exa)

)
