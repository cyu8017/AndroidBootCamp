package com.example.cyu.abc_chapter2_example

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnViewRecipe)
        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, Recipe::class.java))
        }
    }
}
