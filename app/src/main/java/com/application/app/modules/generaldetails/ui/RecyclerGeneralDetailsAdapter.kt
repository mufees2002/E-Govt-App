package com.application.app.modules.generaldetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGeneralDetails1Binding
import com.application.app.modules.generaldetails.`data`.model.GeneralDetails1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGeneralDetailsAdapter(
  public var list: List<GeneralDetails1RowModel>
) : RecyclerView.Adapter<RecyclerGeneralDetailsAdapter.RowGeneralDetails1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGeneralDetails1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_general_details1,parent,false)
    return RowGeneralDetails1VH(view)
  }

  public override fun onBindViewHolder(holder: RowGeneralDetails1VH, position: Int): Unit {
    val generalDetails1RowModel = GeneralDetails1RowModel()
    // TODO uncomment following line after integration with data source
    // val generalDetails1RowModel = list[position]
    holder.binding.generalDetails1RowModel = generalDetails1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GeneralDetails1RowModel>): Unit {
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
      item: GeneralDetails1RowModel
    ): Unit {
    }
  }

  public inner class RowGeneralDetails1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowGeneralDetails1Binding = RowGeneralDetails1Binding.bind(itemView)
  }
}
