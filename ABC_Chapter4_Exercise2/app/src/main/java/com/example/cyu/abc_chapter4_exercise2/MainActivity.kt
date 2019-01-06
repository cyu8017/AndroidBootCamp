package com.example.cyu.abc_chapter4_exercise2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private var weightEntered: Double = 0.toDouble()
    private var convertedWeight: Double = 0.toDouble()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Action Bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.ic_launcher)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        val weight = findViewById<EditText>(R.id.txtWeight)
        val radType1 = findViewById<RadioButton>(R.id.radType1)
        val radType2 = findViewById<RadioButton>(R.id.radType2)
        val result = findViewById<TextView>(R.id.txtResult)

        val convert = findViewById<Button>(R.id.btnORDER)

        // Conversion Button Click Listener
        convert.setOnClickListener {
            weightEntered = java.lang.Double.parseDouble(weight.text.toString())
            val tenth = NumberFormat.getCurrencyInstance()

            // Radio Button 1 Action Listener
            if (radType1.isChecked) {
                convertedWeight = weightEntered * 10.99
                result.text = tenth.format(convertedWeight)
                Toast.makeText(this@MainActivity,
                        "Must purchase 12 washes to obtain a discount.",
                        Toast.LENGTH_LONG).show()
            } else if (weightEntered > 12) {
                convertedWeight = weightEntered * 8.99
                result.text = tenth.format(convertedWeight)
            } // End Radio Button 1 Action Listener

            // Radio Button 2 Action Listener
            if (radType2.isChecked) {

                if (weightEntered < 12) {
                    convertedWeight = weightEntered * 15.99
                    result.text = tenth.format(convertedWeight)
                    Toast.makeText(this@MainActivity,
                            "Must purchase 12 washes to obtain a discount.",
                            Toast.LENGTH_LONG).show()
                } else if (weightEntered >= 12) {
                    convertedWeight = weightEntered * 12.99
                    result.text = tenth.format(convertedWeight)
                }
            } // End Radio Button 2 Action Listener
        } // End Conversion Button CLick Listener
    }
}
