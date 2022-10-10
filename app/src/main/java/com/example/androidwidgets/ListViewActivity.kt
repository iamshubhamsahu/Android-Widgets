package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var listView: ListView
    var list: ArrayList<String> = ArrayList()

    lateinit var arrayAdapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


        title = "Kotlin"
        listView = findViewById(R.id.listView)
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.btnAdd)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,list)

        button.setOnClickListener{
            list.add(editText.text.toString())
            editText.setText("")
            arrayAdapter.notifyDataSetChanged()
            listView.adapter = arrayAdapter
        }
    }
}