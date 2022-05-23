package com.application.app.modules.homepage.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRecommendations: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recommendations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtApplyNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtApplyNow1: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRecentJobsAnd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recent_jobs_and)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUPSCExam: String? = MyApp.getInstance().resources.getString(R.string.lbl_upsc_exam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchJobExaValue: String? = null
)
