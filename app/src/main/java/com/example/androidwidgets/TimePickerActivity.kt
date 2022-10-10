package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast


class TimePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        timePick()
    }

    fun timePick(){
        val picker = findViewById<TimePicker>(R.id.timePicker)
        val textView = findViewById<TextView>(R.id.textView2)

        picker.setOnTimeChangedListener {
            view, hourOfDay, minute ->
            var hour = hourOfDay
            var am_pm = " "
            when{
                hour == 0->{
                    hour +=12
                    am_pm = "AM"
                }
                else ->
                    am_pm ="AM"

            }
            if(textView != null){
                val hour = if(hour<10)"0"+hour else hour
                val min = if(minute<10)"0"+minute  else minute
                val toast = "Time is: $hour :$min  $am_pm"
                Toast.makeText(this,toast,Toast.LENGTH_SHORT).show()

            }


        }
    }
}