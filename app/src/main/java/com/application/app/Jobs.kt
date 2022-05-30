package com.application.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Jobs : AppCompatActivity(),JobsAdpater.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jobs)

        val r=findViewById<RecyclerView>(R.id.recyclerView6);
        r.layoutManager=LinearLayoutManager(this);
        val list=ArrayList<JobsModule>()
        for( i in 1..5){
            list.add(JobsModule(R.drawable.img_upsc11,"UPSC","DELHI"))
        }
        val adapter=JobsAdpater(list,this)
       r.adapter=adapter

    }

    override fun OnItemClick(position: Int) {
        Toast.makeText(this,"ItemCLicked",Toast.LENGTH_SHORT).show()
    }
}