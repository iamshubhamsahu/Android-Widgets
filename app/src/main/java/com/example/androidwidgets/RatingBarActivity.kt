package com.example.androidwidgets

import android.media.Rating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast



class RatingBarActivity : AppCompatActivity() {

    lateinit var ratingbar: RatingBar
    lateinit var showRating: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)

        ratingbar = findViewById(R.id.ratingBar)as RatingBar
        showRating = findViewById(R.id.btnShowRating)as Button
        showRating.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "Your Rating : "+ratingbar.rating,Toast.LENGTH_SHORT).show()

        })

    }
}