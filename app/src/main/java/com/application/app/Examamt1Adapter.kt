package com.application.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Examamt1Adapter(private  val n:List<Exammat1Module>,private val listener:OnItemCLickListener):RecyclerView.Adapter<Examamt1Adapter.ViewHolder>() {

  inner  class ViewHolder(ExammatView: View):RecyclerView.ViewHolder(ExammatView), View.OnClickListener {
        val image:ImageView=ExammatView.findViewById(R.id.imageUpsc12)
        val text:TextView=ExammatView.findViewById(R.id.txtUPSC)
        init{
            itemView.setOnClickListener(this);
        }

        override fun onClick(p0: View?) {
            val position=adapterPosition
            listener.OnItemClick(position)
        }
    }

    interface OnItemCLickListener{
        fun OnItemClick(position: Int)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.material,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val item=n[position]
      holder.image.setImageResource(item.image)
        holder.text.text=item.name
    }

    override fun getItemCount(): Int {
    return  n.size
    }
}