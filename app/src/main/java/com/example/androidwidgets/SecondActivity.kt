package com.example.androidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val timePicker = findViewById<Button>(R.id.timepicker)
        timePicker.setOnClickListener{
            val Intent = Intent(this,TimePickerActivity::class.java)
            startActivity(Intent)
        }


        val analoganddigital = findViewById<Button>(R.id.analoganddigital)
        analoganddigital.setOnClickListener{
            val Intent = Intent(this,AnalogAndDigitalActivity::class.java)
            startActivity(Intent)
        }



        val progressBar = findViewById<Button>(R.id.progressbar)
        progressBar.setOnClickListener{
            val Intent = Intent(this,ProgressBarActivity::class.java)
            startActivity(Intent)
        }


        val verticalscrollview = findViewById<Button>(R.id.verticalscrollview)
        verticalscrollview.setOnClickListener{
            val Intent = Intent(this,VerticalScrollViewActivity::class.java)
            startActivity(Intent)
        }


        val horizontalscrollview = findViewById<Button>(R.id.horizontalscrollview)
        horizontalscrollview.setOnClickListener{
            val Intent = Intent(this,HorizontalScrollViewActivity::class.java)
            startActivity(Intent)
        }


        val recyclerview = findViewById<Button>(R.id.recyclerview)
        recyclerview.setOnClickListener{
            val Intent = Intent(this,RecyclerViewActivity::class.java)
            startActivity(Intent)
        }


    }
}