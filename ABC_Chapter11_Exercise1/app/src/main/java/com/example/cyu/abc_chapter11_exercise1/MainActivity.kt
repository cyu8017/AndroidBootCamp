package com.example.cyu.abc_chapter11_exercise1

import android.content.Intent
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    internal var weight: Int = 0
    internal var height: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtWeight = findViewById<EditText>(R.id.txtWeight)
        val txtHeight = findViewById<EditText>(R.id.txtHeight)
        val sharedPref = PreferenceManager.getDefaultSharedPreferences(this)
        val btnCompute = findViewById<Button>(R.id.btnCompute)

        btnCompute.setOnClickListener {
            weight = Integer.parseInt(txtWeight.text.toString())
            height = Integer.parseInt(txtHeight.text.toString())

            val editor = sharedPref.edit()

            editor.putInt("key1", weight)
            editor.putInt("key2", height)
            editor.apply()

            startActivity(Intent(this@MainActivity, Payment::class.java))
        }

    }
}