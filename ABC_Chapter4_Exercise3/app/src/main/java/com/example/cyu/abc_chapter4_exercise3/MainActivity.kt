package com.example.cyu.abc_chapter4_exercise3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private var numOfDaysEntered: Double = 0.toDouble()
    private var blah: Double = 0.toDouble()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Action Bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.ic_launcher)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        val days = findViewById<EditText>(R.id.txtNumOfDays)
        val radType1 = findViewById<RadioButton>(R.id.radioButton)
        val radType2 = findViewById<RadioButton>(R.id.radioButton2)
        val calculate = findViewById<TextView>(R.id.txtResult)
        val result = findViewById<Button>(R.id.btnCalculate)

        // Calculate Button Click Listener
        calculate.setOnClickListener {
            numOfDaysEntered = java.lang.Double.parseDouble(days.text.toString())
            val tenth = NumberFormat.getCurrencyInstance()

            // Radio Button 1 Action Listener
            if (radType1.isChecked) {
                blah = numOfDaysEntered * 55.99
                result.text = tenth.format(blah)
            }

            else if (numOfDaysEntered > 7) {
                Toast.makeText(this@MainActivity, "Rental Days Exceeded", Toast.LENGTH_LONG).show()
            }

            // Radio Button 2 Action Listener
            if (radType2.isChecked) {
                if (numOfDaysEntered <= 7) {
                    blah = numOfDaysEntered * 68.99
                    result.text = tenth.format(blah)
                }

                else if (numOfDaysEntered > 7) {
                    Toast.makeText(this@MainActivity, "Rental Days Exceeded", Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}
