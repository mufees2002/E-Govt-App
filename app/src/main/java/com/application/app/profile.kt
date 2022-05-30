package com.application.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class profile : AppCompatActivity(),JobsAdpater.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)
        val r=findViewById<RecyclerView>(R.id.recyclerView)
        r.layoutManager=LinearLayoutManager(this)
        val list=ArrayList<JobsModule>();
        for ( i in 1..5){
            list.add(JobsModule(R.drawable.img_upsc11,"UPSC","DELHI"))

        }
        val adpater=JobsAdpater(list,this)
        r.adapter=adpater

    }

    override fun OnItemClick(position: Int) {
        Toast.makeText(this,"Itemclicked",Toast.LENGTH_SHORT).show()
    }
}