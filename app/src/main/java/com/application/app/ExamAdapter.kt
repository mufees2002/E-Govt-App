package com.application.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExamAdapter(private  val n:List<ExamModule>):RecyclerView.Adapter<ExamAdapter.ViewHolder>(){



    class ViewHolder(ExamModuleView:View):RecyclerView.ViewHolder(ExamModuleView){
        val image:ImageView=ExamModuleView.findViewById(R.id.viewRectangle243);
        val text:TextView=ExamModuleView.findViewById(R.id.txtNAMEOFTHEEXA);

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.exam,parent,false);
        return  ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
        val item=n[position];
        holder.image.setImageResource(item.image)
        holder.text.text=item.name
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}