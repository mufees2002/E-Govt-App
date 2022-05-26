package com.application.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecommadationAdapter(private val n:List<RecommadationModal>):RecyclerView.Adapter<RecommadationAdapter.ViewHolder>() {

    class ViewHolder(Recommadation: View):RecyclerView.ViewHolder(Recommadation){
        val image:ImageView=Recommadation.findViewById(R.id.imageUpsc11);
        val text:TextView=Recommadation.findViewById(R.id.txtApplyNow);

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recommendations,parent,false);

        return  ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
        val item=n[position];
        holder.image.setImageResource(item.image);
        holder.text.text=item.name
        holder.image.setOnClickListener(View.OnClickListener {



        })

        
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}