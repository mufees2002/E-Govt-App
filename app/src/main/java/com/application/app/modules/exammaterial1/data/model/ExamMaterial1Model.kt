package com.application.app.modules.exammaterial1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ExamMaterial1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtExamMaterialV: String? =
      MyApp.getInstance().resources.getString(R.string.msg_exam_material_v)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUPSC: String? = MyApp.getInstance().resources.getString(R.string.lbl_upsc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGATE: String? = MyApp.getInstance().resources.getString(R.string.lbl_gate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMATERIALS: String? = MyApp.getInstance().resources.getString(R.string.lbl_materials)

)
