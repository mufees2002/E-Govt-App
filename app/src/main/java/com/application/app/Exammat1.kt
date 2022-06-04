package com.application.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Exammat1 : AppCompatActivity(),Examamt1Adapter.OnItemCLickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exammat1)
        val r=findViewById<RecyclerView>(R.id.recyclerView3)
        r.layoutManager=LinearLayoutManager(this);
        val list=ArrayList<Exammat1Module>();
        for (i in 1..5){
            list.add(Exammat1Module(R.drawable.img_upsc11,"UPSC"))

        }

        val adapter=Examamt1Adapter(list,this)

    }

    override fun OnItemClick(position: Int) {
        Toast.makeText(this,"ItemClicked",Toast.LENGTH_SHORT).show()
    }
}