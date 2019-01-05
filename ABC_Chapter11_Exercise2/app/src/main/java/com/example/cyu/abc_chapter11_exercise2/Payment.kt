package com.example.cyu.abc_chapter11_exercise2

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

        val interestPaid = findViewById<TextView>(R.id.txtInterestPaid)
        val image = findViewById<ImageView>(R.id.imgMortgage)

        val sharedPref = PreferenceManager.getDefaultSharedPreferences(this)

        val monthlyPayment = sharedPref.getFloat("key1", 0f)
        val numOfYears = sharedPref.getInt("key2", 0)
        val principalAmount = sharedPref.getFloat("key3", 0f)
        val totalInterest: Float

        totalInterest = monthlyPayment * numOfYears - principalAmount

        val currency = DecimalFormat("$###,###.##")
        interestPaid.text = "Your total interest is: " + currency.format(totalInterest.toDouble())

        if (numOfYears == 10) {
            image.setImageResource(R.drawable.ten)
        } else if (numOfYears == 20) {
            image.setImageResource(R.drawable.twenty)
        } else if (numOfYears == 30) {
            image.setImageResource(R.drawable.thirty)
        } else {
            interestPaid.text = "Error"
        }
    }
}
