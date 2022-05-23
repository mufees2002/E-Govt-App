package com.application.app.modules.jobsportal.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowJobsPortal1Binding
import com.application.app.modules.jobsportal.`data`.model.JobsPortal1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerJobsPortalAdapter(
  public var list: List<JobsPortal1RowModel>
) : RecyclerView.Adapter<RecyclerJobsPortalAdapter.RowJobsPortal1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowJobsPortal1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_jobs_portal1,parent,false)
    return RowJobsPortal1VH(view)
  }

  public override fun onBindViewHolder(holder: RowJobsPortal1VH, position: Int): Unit {
    val jobsPortal1RowModel = JobsPortal1RowModel()
    // TODO uncomment following line after integration with data source
    // val jobsPortal1RowModel = list[position]
    holder.binding.jobsPortal1RowModel = jobsPortal1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<JobsPortal1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: JobsPortal1RowModel
    ): Unit {
    }
  }

  public inner class RowJobsPortal1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowJobsPortal1Binding = RowJobsPortal1Binding.bind(itemView)
  }
}
