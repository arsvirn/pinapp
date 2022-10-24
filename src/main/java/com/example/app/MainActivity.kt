package com.example.app

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPin1.setOnClickListener {
            ivImage.setImageResource(R.drawable.pin1)
        btnPin2.setOnClickListener {
            ivImage.setImageResource(R.drawable.pin2)
        }
        }
    }
}