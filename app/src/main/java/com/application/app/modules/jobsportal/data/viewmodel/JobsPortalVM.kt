package com.application.app.modules.jobsportal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.jobsportal.`data`.model.JobsPortal1RowModel
import com.application.app.modules.jobsportal.`data`.model.JobsPortalModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class JobsPortalVM : ViewModel(), KoinComponent {
  public val jobsPortalModel: MutableLiveData<JobsPortalModel> = MutableLiveData(JobsPortalModel())

  public var navArguments: Bundle? = null

  public val recyclerJobsPortalList: MutableLiveData<MutableList<JobsPortal1RowModel>> =
      MutableLiveData(mutableListOf())
}
