package com.application.app.modules.registerpage.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class RegisterPageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtShow: String? = MyApp.getInstance().resources.getString(R.string.lbl_show)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp1: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCONTINUEWITHH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_continue_with_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etConfirmPassworValue: String? = null
)
