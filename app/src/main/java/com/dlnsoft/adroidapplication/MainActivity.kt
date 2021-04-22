package com.dlnsoft.adroidapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        parks_button.setOnClickListener(){
            Toast.makeText(applicationContext,"Parks",Toast.LENGTH_SHORT).show()
        }

        cities_button.setOnClickListener(){
            Toast.makeText(applicationContext,"Cities",Toast.LENGTH_SHORT).show()
        }

        food_button.setOnClickListener(){
            Toast.makeText(applicationContext,"Food",Toast.LENGTH_SHORT).show()
        }

        movies_button.setOnClickListener(){
            Toast.makeText(applicationContext,"Movies",Toast.LENGTH_SHORT).show()
        }

        traffic_button.setOnClickListener(){
            Toast.makeText(applicationContext,"Traffic",Toast.LENGTH_SHORT).show()
        }

        music_buttons.setOnClickListener(){
            Toast.makeText(applicationContext,"Music",Toast.LENGTH_SHORT).show()
        }


   }
}

