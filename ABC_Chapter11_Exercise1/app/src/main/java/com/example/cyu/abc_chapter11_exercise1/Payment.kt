package com.example.cyu.abc_chapter11_exercise1

import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

import java.text.DecimalFormat

class Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val txtBmiResult = findViewById<TextView>(R.id.txtBmiResult)
        findViewById<ImageView>(R.id.imgBMI2)

        val sharedPref = PreferenceManager.getDefaultSharedPreferences(this)

        val weight = sharedPref.getInt("key1", 0)
        val height = sharedPref.getInt("key2", 0)
        val bmi: Float

        bmi = (weight * 703 / height xor 2).toFloat()
        val currency = DecimalFormat("###,###.##")
        txtBmiResult.text = String.format("Your BMI is " + currency.format(bmi.toDouble()))

    }
}
