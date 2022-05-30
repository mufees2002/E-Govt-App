package com.application.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Profile3 : AppCompatActivity(),ExamAdapter.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile3)
        val r=findViewById<RecyclerView>(R.id.recyclerViews)
        r.layoutManager=LinearLayoutManager(this)
        val list=ArrayList<ExamModule>();
        for (i in 1..5){
            list.add(ExamModule(R.drawable.img_gate31,"GATE"))
        }
        val adapter=ExamAdapter(list,this);
        r.adapter=adapter

    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this,"OnItemClicked",Toast.LENGTH_SHORT).show()
    }
}