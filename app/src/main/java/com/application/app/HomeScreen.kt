package com.application.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class HomeScreen : AppCompatActivity(),RecentJobsAdapter.OnItemClickListener,RecommadationAdapter.OnItemClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen2)
      val r=findViewById<RecyclerView>(R.id.recyclerView2);
        r.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        val list=ArrayList<RecommadationModal>();

        for( i in 1..5 ){
            list.add(RecommadationModal(R.drawable.img_upsc11,"APPLY NOW"));

        }
        val adpater=RecommadationAdapter(list,this);
         r.adapter=adpater;

        val r1=findViewById<RecyclerView>(R.id.recyclerView12);
        r1.layoutManager=LinearLayoutManager(this);
        val list1=ArrayList<RecentJobsModel>();
        for(i in 1..5){
            list1.add(RecentJobsModel(R.drawable.img_upsc11,"UPSC"));

        }
        val adpater1=RecentJobsAdapter(list1,this);
        r1.adapter=adpater1
    }

    override fun onItemClicks(position: Int) {
      Toast.makeText(this,"ItemCLicked",Toast.LENGTH_SHORT).show()

    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this,"ItemCLicked",Toast.LENGTH_SHORT).show()

    }


}