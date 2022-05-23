package com.application.app.modules.generaldetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityGeneralDetailsBinding
import com.application.app.modules.generaldetails.`data`.model.GeneralDetails1RowModel
import com.application.app.modules.generaldetails.`data`.viewmodel.GeneralDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class GeneralDetailsActivity :
    BaseActivity<ActivityGeneralDetailsBinding>(R.layout.activity_general_details) {
  private val viewModel: GeneralDetailsVM by viewModels<GeneralDetailsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGeneralDetailsAdapter =
    RecyclerGeneralDetailsAdapter(viewModel.recyclerGeneralDetailsList.value?:mutableListOf())
    binding.recyclerGeneralDetails.adapter = recyclerGeneralDetailsAdapter
    recyclerGeneralDetailsAdapter.setOnItemClickListener(
    object : RecyclerGeneralDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GeneralDetails1RowModel) {
        onClickRecyclerGeneralDetails(view, position, item)
      }
    }
    )
    viewModel.recyclerGeneralDetailsList.observe(this) {
      recyclerGeneralDetailsAdapter.updateData(it)
    }
    binding.generalDetailsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGeneralDetails(
    view: View,
    position: Int,
    item: GeneralDetails1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "GENERAL_DETAILS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GeneralDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
