package com.example.cyu.abc_chapter5_exercise3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnContinue: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnContinue = findViewById(R.id.btnContinue)
        btnContinue.setOnClickListener {
            val i = Intent(applicationContext, RentalCar::class.java)
            startActivity(i)
        }

    }
}
