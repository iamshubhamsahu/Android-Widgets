package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.DialogInterface
import android.support.v4.app.RemoteActionCompatParcelizer
import android.app.AlertDialog
import android.widget.Toast
import java.util.stream.DoubleStream.Builder
import java.util.stream.DoubleStream.builder
import java.util.stream.IntStream.builder
import androidx.appcompat.app.AlertDialog as AlertDialog1

class AlertDialogActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

    button = findViewById(R.id.button2)

        button.setOnClickListener {
            val builder = AlertDialog1.Builder(this)
            builder.setTitle("Alert Dialog Box")
            builder.setMessage("This Alert Dialog is Tempour")


        }

    }
}

