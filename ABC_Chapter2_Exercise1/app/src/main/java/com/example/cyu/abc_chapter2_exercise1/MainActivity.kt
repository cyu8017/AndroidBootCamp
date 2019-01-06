package com.example.cyu.abc_chapter2_exercise1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnHostelInformation)
        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, Hostel::class.java));
        }
    }
}
