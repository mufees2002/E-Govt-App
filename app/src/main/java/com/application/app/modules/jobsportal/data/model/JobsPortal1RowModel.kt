package com.application.app.modules.jobsportal.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class JobsPortal1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNAMEOFTHEJOB: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_the_job)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLOCATION: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)

)
