package com.application.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Exammat2 : AppCompatActivity(),Exammat2Adapter.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exammat2)
        val r=findViewById<RecyclerView>(R.id.recyclerView4)



        val list=ArrayList<Exammat1Module>();

        for(i in 1..5){
            list.add(Exammat1Module(R.drawable.img_image5,"VIDEO"))
        }
     val adapter=Exammat2Adapter(list,this)
     r.adapter=adapter

    }

    override fun OnItemCLick(postion: Int) {
        Toast.makeText(this,"ItemCLicked",Toast.LENGTH_SHORT).show()
    }
}