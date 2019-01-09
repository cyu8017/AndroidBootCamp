package com.example.cyu.abc_chapter4_exercise1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private var value1 = 0.19
    private var value2 = 0.49
    private var value3 = 0.79

    private var weightEntered: Double = 0.toDouble()
    private var convertedWeight: Double = 0.toDouble()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.setDisplayShowCustomEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.ic_launcher)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        val weight = findViewById<EditText>(R.id.txtWeight)
        val radType1 = findViewById<RadioButton>(R.id.radType1)
        val radType2 = findViewById<RadioButton>(R.id.radType2)
        val radType3 = findViewById<RadioButton>(R.id.radType3)
        val result = findViewById<TextView>(R.id.txtResult)

        val convert = findViewById<Button>(R.id.btnORDER)
        convert.setOnClickListener {
            weightEntered = java.lang.Double.parseDouble(weight.text.toString())
            val tenth = DecimalFormat("#.##")

            if (radType1.isChecked) {
                if (weightEntered <= 50) {
                    convertedWeight = weightEntered * value1
                    result.text = "The order cost is " + tenth.format(convertedWeight)
                } else {
                    Toast.makeText(this@MainActivity,
                            "Number of prints must be less than 50",
                            Toast.LENGTH_LONG).show()
                }
            }

            if (radType2.isChecked) {
                if (weightEntered <= 50) {
                    convertedWeight = weightEntered * value2
                    result.text = "The order cost is " + tenth.format(convertedWeight)
                } else {
                    Toast.makeText(this@MainActivity,
                            "Number of prints must be less than 50",
                            Toast.LENGTH_LONG).show()
                }
            }

            if (radType3.isChecked) {
                if (weightEntered <= 50) {
                    convertedWeight = weightEntered * value3
                    result.text = "The order cost is " + tenth.format(convertedWeight)
                } else {
                    Toast.makeText(this@MainActivity,
                            "Number of prints must be less than 50",
                            Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}