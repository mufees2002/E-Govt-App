package com.application.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecentJobsAdapter(private val n:List<RecentJobsModel>,private  val listener:OnItemClickListener):RecyclerView.Adapter<RecentJobsAdapter.ViewHolder>() {


    inner class ViewHolder(RecentJobs: View):RecyclerView.ViewHolder(RecentJobs), View.OnClickListener {
        val image:ImageView=RecentJobs.findViewById(R.id.imageUpsc12);
        val name:TextView=RecentJobs.findViewById(R.id.txtUPSCExam)
        init{
            itemView.setOnClickListener(this);
        }

        override fun onClick(v: View) {
            val position:Int=adapterPosition
            listener.onItemClick(position)
        }
    }
    interface  OnItemClickListener{
        fun onItemClick(position:Int);
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val  v=LayoutInflater.from(parent.context).inflate(R.layout.recentjobs,parent,false);
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item=n[position];
        holder.image.setImageResource(item.image);
        holder.name.text=item.name
    }

    override fun getItemCount(): Int {
    return n.size
    return n.size
    }
}