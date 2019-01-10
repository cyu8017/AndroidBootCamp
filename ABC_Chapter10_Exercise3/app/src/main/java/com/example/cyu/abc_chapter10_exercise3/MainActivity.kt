package com.example.cyu.abc_chapter10_exercise3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgFrame = findViewById<ImageView>(R.id.imgPhone)
        val btnStartAnimation = findViewById<Button>(R.id.btnStart)


    }
}
