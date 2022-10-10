package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.DatePickerDialog
import android.support.v4.app.RemoteActionCompatParcelizer
import java.util.*
import android.widget.Toast
import android.view.View
import android.widget.DatePicker
import android.widget.TextView
import com.example.androidwidgets.R.id.datepicker

class DatePickerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

       val picker = findViewById<DatePicker>(R.id.datePicker)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)


        picker.init(year, month, day ){
            view, year, month, day ->
           val month =month +1

            val toast = "you have Selected: $day:$month:$year"
            Toast.makeText(this,toast,Toast.LENGTH_SHORT).show()
        }


    }

}