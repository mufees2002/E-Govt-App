package com.application.app.modules.uploadpage.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class UploadPageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDOCUMENTUPLOAD: String? =
      MyApp.getInstance().resources.getString(R.string.msg_document_upload)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt10thMarkCerti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_10th_mark_certi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt12thCertificat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_12th_certificat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDiplomaCertifi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_diploma_certifi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt12thMarkCerti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_12th_mark_certi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYes: String? = MyApp.getInstance().resources.getString(R.string.lbl_yes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCompletionOfD: String? =
      MyApp.getInstance().resources.getString(R.string.msg_completion_of_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDegreeCertific: String? =
      MyApp.getInstance().resources.getString(R.string.msg_degree_certific)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAaadharCard: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_aaadhar_card)

)
