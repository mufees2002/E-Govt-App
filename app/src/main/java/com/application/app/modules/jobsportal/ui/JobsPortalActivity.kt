package com.application.app.modules.jobsportal.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityJobsPortalBinding
import com.application.app.modules.jobsportal.`data`.model.JobsPortal1RowModel
import com.application.app.modules.jobsportal.`data`.viewmodel.JobsPortalVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class JobsPortalActivity :
    BaseActivity<ActivityJobsPortalBinding>(R.layout.activity_jobs_portal) {
  private val viewModel: JobsPortalVM by viewModels<JobsPortalVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerJobsPortalAdapter =
    RecyclerJobsPortalAdapter(viewModel.recyclerJobsPortalList.value?:mutableListOf())
    binding.recyclerJobsPortal.adapter = recyclerJobsPortalAdapter
    recyclerJobsPortalAdapter.setOnItemClickListener(
    object : RecyclerJobsPortalAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : JobsPortal1RowModel) {
        onClickRecyclerJobsPortal(view, position, item)
      }
    }
    )
    viewModel.recyclerJobsPortalList.observe(this) {
      recyclerJobsPortalAdapter.updateData(it)
    }
    binding.jobsPortalVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerJobsPortal(
    view: View,
    position: Int,
    item: JobsPortal1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "JOBS_PORTAL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, JobsPortalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
