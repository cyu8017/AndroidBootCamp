package com.example.cyu.abc_chapter2_exercise5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonContactOne = findViewById<Button>(R.id.btnContactOne)
        buttonContactOne.setOnClickListener {
            startActivity(Intent(this@MainActivity, ContactOne::class.java))
        }

        val buttonContactTwo = findViewById<Button>(R.id.btnContactTwo)
        buttonContactTwo.setOnClickListener {
            startActivity(Intent(this@MainActivity, ContactTwo::class.java))
        }
    }
}
