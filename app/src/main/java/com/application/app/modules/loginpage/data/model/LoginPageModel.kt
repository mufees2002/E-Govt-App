package com.application.app.modules.loginpage.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginPageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
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
  public var txtForgotYourPas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_your_pas)
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
  public var etEmailValue: String? = null
)
