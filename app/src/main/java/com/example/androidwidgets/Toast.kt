package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class Toast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        val message = findViewById<TextInputEditText>(R.id.textInputEditText)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val Message : String
            Message = ""+message.text+""
            val toast1 = Toast.makeText(applicationContext,Message,Toast.LENGTH_LONG)
            toast1.setGravity(Gravity.CENTER,0,0)
            toast1.show()

        }


    }
}