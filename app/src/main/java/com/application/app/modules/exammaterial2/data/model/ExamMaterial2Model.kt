package com.application.app.modules.exammaterial2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ExamMaterial2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLESSON1: String? = MyApp.getInstance().resources.getString(R.string.lbl_lesson_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLESSON2: String? = MyApp.getInstance().resources.getString(R.string.lbl_lesson_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLESSON3: String? = MyApp.getInstance().resources.getString(R.string.lbl_lesson_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMATERIALS: String? = MyApp.getInstance().resources.getString(R.string.lbl_materials)

)
