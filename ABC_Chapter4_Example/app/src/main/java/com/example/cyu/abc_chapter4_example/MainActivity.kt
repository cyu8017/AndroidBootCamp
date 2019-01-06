package com.example.cyu.abc_chapter4_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private var conversionRate = 2.2
    private var weightEntered: Double = 0.toDouble()
    private var convertedWeight: Double = 0.toDouble()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.ic_launcher)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        val weight = findViewById<EditText>(R.id.txtWeight)
        val lbToKilo = findViewById<RadioButton>(R.id.radLbToKilo)
        val kiloToLb = findViewById<RadioButton>(R.id.radKiloToLb)
        val result = findViewById<TextView>(R.id.txtResult)

        val convert = findViewById<Button>(R.id.btnConvert)
        convert.setOnClickListener {
            weightEntered = java.lang.Double.parseDouble(weight.text.toString())
            val tenth = DecimalFormat("0.##")

            if (lbToKilo.isChecked) {
                if (weightEntered <= 500) {
                    convertedWeight = weightEntered / conversionRate
                    result.text = tenth.format(convertedWeight) + " kilograms"
                } else {
                    Toast.makeText(this@MainActivity,
                            "Pounds must be less than 500",
                            Toast.LENGTH_LONG).show()
                }
            }

            if (kiloToLb.isChecked) {
                if (weightEntered <= 225) {
                    convertedWeight = weightEntered * conversionRate
                    result.text = tenth.format(convertedWeight) + "pounds"
                } else {
                    Toast.makeText(this@MainActivity,
                            "Kilos must be less than 225",
                            Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
