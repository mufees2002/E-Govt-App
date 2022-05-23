package com.application.app.modules.jobsportal.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class JobsPortalModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNEWS: String? = MyApp.getInstance().resources.getString(R.string.lbl_news)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJOBS: String? = MyApp.getInstance().resources.getString(R.string.lbl_jobs)

)
