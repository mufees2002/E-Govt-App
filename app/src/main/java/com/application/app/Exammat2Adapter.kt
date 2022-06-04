package com.application.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Exammat2Adapter(private val n:List<Exammat1Module>,private val listener:OnItemClickListener):RecyclerView.Adapter<Exammat2Adapter.ViewHolder>() {
   inner class ViewHolder (Exammat2view: View):RecyclerView.ViewHolder(Exammat2view),
        View.OnClickListener {
     val image:ImageView=Exammat2view.findViewById(R.id.imageImage5)
     val text:TextView=Exammat2view.findViewById(R.id.txtLESSON1)
      init {
          itemView.setOnClickListener(this)
      }

        override fun onClick(p0: View?) {
            val position=adapterPosition
            listener.OnItemCLick(position)
        }
    }
    interface  OnItemClickListener{
        fun OnItemCLick(postion:Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.materials2,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     val item=n[position]
        holder.image.setImageResource(item.image)
        holder.text.text=item.name
    }

    override fun getItemCount(): Int {
     return n.size
    }


}