package com.example.cyu.abc_chapter2_exercise6

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnColdPlay = findViewById<Button>(R.id.btnColdPlay)
        btnColdPlay.setOnClickListener {
            startActivity(Intent(this@MainActivity, FirstSong::class.java))
        }

        val btnColdPlay2 = findViewById<Button>(R.id.btnColdPlay2)
        btnColdPlay2.setOnClickListener {
            startActivity(Intent(this@MainActivity, SecondSong::class.java))
        }
    }
}
