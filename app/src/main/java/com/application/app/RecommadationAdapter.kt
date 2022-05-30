package com.application.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecommadationAdapter(private val n:List<RecommadationModal>,private val listener:OnItemClickListener ):RecyclerView.Adapter<RecommadationAdapter.ViewHolder>() {

   inner class ViewHolder(Recommadation: View):RecyclerView.ViewHolder(Recommadation),
        View.OnClickListener {
        val image:ImageView=Recommadation.findViewById(R.id.imageUpsc11);
        val text:TextView=Recommadation.findViewById(R.id.txtApplyNow);
      init {
          itemView.setOnClickListener(this);
      }

        override fun onClick(v: View?) {
            val position=adapterPosition
            listener.onItemClicks(position)
        }
    }
    interface  OnItemClickListener{
        fun onItemClicks(position:Int);
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recommendations,parent,false);

        return  ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=n[position];
        holder.image.setImageResource(item.image);
        holder.text.text=item.name

        
    }

    override fun getItemCount(): Int {
        return n.size;
    }
}