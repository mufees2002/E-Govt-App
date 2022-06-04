package com.application.app

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class General_details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_details2)


     val cal=Calendar.getInstance()
     val year=cal.get(Calendar.YEAR)
     val month=cal.get(Calendar.MONTH)
     val date=cal.get(Calendar.DAY_OF_MONTH)
     val image:ImageView=findViewById(R.id.imageView14)
     val text1:TextView=findViewById(R.id.etEmail6)
     image.setOnClickListener {
         val dpd=DatePickerDialog(this,DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
             text1.text=i3.toString()+"/"+i2+"/"+i
         },year,month,date)
       dpd.show()
     }


    }

}