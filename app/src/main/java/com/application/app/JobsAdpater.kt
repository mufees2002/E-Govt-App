package com.application.app

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class JobsAdpater(private val n:List<JobsModule>,private val listener:OnItemClickListener):RecyclerView.Adapter<JobsAdpater.ViewHolder>() {

   inner class ViewHolder(JobsModuleView: View):RecyclerView.ViewHolder(JobsModuleView),
       View.OnClickListener {
     val image:ImageView=JobsModuleView.findViewById(R.id.viewRectangle243);
     val name:TextView=JobsModuleView.findViewById(R.id.txtNAMEOFTHEJOB);
     val location:TextView=JobsModuleView.findViewById(R.id.txtLOCATION);
        init {
           itemView.setOnClickListener(this);
        }

       override fun onClick(p0: View?) {
          val position:Int=adapterPosition;
           listener.OnItemClick(position);
       }
   }
interface  OnItemClickListener{
    fun  OnItemClick(position: Int)
}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
        val view=LayoutInflater.from(parent.context).inflate(R.layout.jobs,parent,false);
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")

        val item=n[position];
        holder.image.setImageResource(item.image);
        holder.name.text=item.name
        holder.location.text=item.location
        holder.image.setOnClickListener {

        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}