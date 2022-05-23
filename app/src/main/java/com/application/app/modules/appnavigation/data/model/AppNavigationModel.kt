package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJobsPortal: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jobs_portal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSplashScreen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_splash_screen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegisterPage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_register_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginPage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_login_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExamPortal: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_exam_portal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGeneralDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_general_details2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUploadPage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upload_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHomePage: String? = MyApp.getInstance().resources.getString(R.string.lbl_home_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExamMaterial1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_exam_material1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExamMaterial2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_exam_material2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTestpattern1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_testpattern1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAndroidLarge14: String? =
      MyApp.getInstance().resources.getString(R.string.msg_android_large)

)
