package com.example.androidwidgets

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

class WorkingwithButton : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workingwith_button)

        val num1 = findViewById<TextInputEditText>(R.id.input1)
        val num2 = findViewById<TextInputEditText>(R.id.input2)
        val tot = findViewById<TextInputEditText>(R.id.total)

        val add = findViewById<Button>(R.id.addition)


        add.setOnClickListener{

            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val result = val1 + val2
            tot.setText(result.toString())


        }


    }
}