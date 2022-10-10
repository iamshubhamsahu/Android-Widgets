package com.example.androidwidgets

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextpage = findViewById<Button>(R.id.nextpage)
        nextpage.setOnClickListener{
            val Intent = Intent(this, SecondActivity::class.java)
            startActivity(Intent)
        }

        val workingwithButton = findViewById<Button>(R.id.workingwithbutton)
        workingwithButton.setOnClickListener{
            val Intent = Intent(this,WorkingwithButton::class.java)
            startActivity(Intent)
        }
        val toast = findViewById<Button>(R.id.toast)
        toast.setOnClickListener{
            val Intent = Intent(this,Toast::class.java)
            startActivity(Intent)
        }

        val toggle = findViewById<Button>(R.id.togglebutton)
        toggle.setOnClickListener{
            val Intent = Intent(this,ToggleButton::class.java)
            startActivity(Intent)
        }

        val checkBox = findViewById<Button>(R.id.checkbox)
        checkBox.setOnClickListener{
            val Intent = Intent(this,CheckBox::class.java)
            startActivity(Intent)
        }

        val radioButton = findViewById<Button>(R.id.radiobutton)
        radioButton.setOnClickListener{
            val Intent = Intent(this,RadioButton::class.java)
            startActivity(Intent)
        }

        val alertdialog = findViewById<Button>(R.id.alertdialog)
        alertdialog.setOnClickListener{
            val Intent = Intent(this,AlertDialogActivity::class.java)
            startActivity(Intent)
        }

        val spinner = findViewById<Button>(R.id.spinner1)
        spinner.setOnClickListener{
            val Intent = Intent(this,SpinnerActivity::class.java)
            startActivity(Intent)
        }
        val autoComplete = findViewById<Button>(R.id.autocompletetextview)
        autoComplete.setOnClickListener{
            val Intent = Intent(this,AutoCompleteTextActivity::class.java)
            startActivity(Intent)
        }

        val listView = findViewById<Button>(R.id.listview)
        listView.setOnClickListener{
            val Intent = Intent(this,ListViewActivity::class.java)
            startActivity(Intent)
        }


        val ratingBar = findViewById<Button>(R.id.rantingbar)
        ratingBar.setOnClickListener{
            val Intent = Intent(this,RatingBarActivity::class.java)
            startActivity(Intent)
        }

        val webView = findViewById<Button>(R.id.webview)
        webView.setOnClickListener{
            val Intent = Intent(this,WebViewActivity::class.java)
            startActivity(Intent)
        }

        val seekBar = findViewById<Button>(R.id.seekbar)
        seekBar.setOnClickListener{
            val Intent = Intent(this,SeekBarActivity::class.java)
            startActivity(Intent)
        }

        val datePicker = findViewById<Button>(R.id.datepicker)
        datePicker.setOnClickListener{
            val Intent = Intent(this,DatePickerActivity::class.java)
            startActivity(Intent)
        }



    }
}