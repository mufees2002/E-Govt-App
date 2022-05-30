package com.application.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.koin.core.KoinApplication.Companion.init

class ExamAdapter(private  val n:List<ExamModule>,private val listener:OnItemClickListener):RecyclerView.Adapter<ExamAdapter.ViewHolder>(){



  inner  class ViewHolder(ExamModuleView:View):RecyclerView.ViewHolder(ExamModuleView),
        View.OnClickListener {
        val image:ImageView=ExamModuleView.findViewById(R.id.viewRectangle243);
        val text:TextView=ExamModuleView.findViewById(R.id.txtNAMEOFTHEEXA);
        init {
            itemView.setOnClickListener(this);
        }

        override fun onClick(v: View?) {
            val position:Int=adapterPosition;
            listener.onItemClick(position);
        }

    }
interface  OnItemClickListener{
    fun onItemClick(position:Int);
}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.exam,parent,false);
        return  ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=n[position];
        holder.image.setImageResource(item.image)
        holder.text.text=item.name


    }

    override fun getItemCount(): Int {
  return  n.size
    }


}