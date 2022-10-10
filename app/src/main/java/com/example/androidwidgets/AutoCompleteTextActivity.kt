package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.support.v4.app.RemoteActionCompatParcelizer
import android.graphics.Color

class AutoCompleteTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete_text)

        val autotextViews = findViewById<AutoCompleteTextView>(R.id.autoTextView)
        val foodlist = resources.getStringArray(R.array.Department)
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, foodlist
        )
        autotextViews.setAdapter(adapter)

        findViewById<Button>(R.id.btn)?.setOnClickListener(View.OnClickListener {
            val pilfood = "Department are:"+" "+autotextViews.text
            Toast.makeText(this@AutoCompleteTextActivity, pilfood, Toast.LENGTH_SHORT).show()
        })



        }


    }

