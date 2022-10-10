package com.example.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import android.widget.TextView
import com.google.android.material.slider.Slider
import java.lang.Double.max
import java.util.Collections.max

class SeekBarActivity : AppCompatActivity() {

    lateinit var slider : SeekBar
    lateinit var value : TextView
    var startPoint = 0
    var endPoint = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)


            slider = findViewById(R.id.volumeSeekBar) as SeekBar
            value = findViewById(R.id.volume) as TextView

            slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(p0: SeekBar?, progress: Int, fromUser: Boolean) {

                    value.text = progress.toString()

                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {

                    if (seekBar != null) {
                        startPoint = seekBar.progress
                    }
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {

                    if (seekBar != null) {
                        endPoint = seekBar.progress
                    }


                    Toast.makeText(this@SeekBarActivity,"change by%${endPoint - startPoint}",Toast.LENGTH_SHORT).show()

                }

            })

    }
}