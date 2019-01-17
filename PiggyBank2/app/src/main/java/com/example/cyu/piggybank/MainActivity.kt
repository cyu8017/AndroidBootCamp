package com.example.cyu.piggybank

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    // Define values for all coins.
    internal var quarter = 0.25
    internal var dime = 0.10
    internal var nickel = 0.05
    internal var penny = 0.01

    internal var sumOfQuarters = 0
    internal var sumOfDimes = 0
    internal var sumOfNickels = 0
    internal var sumOfPennies = 0

    internal var total: Double = 0.toDouble()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Define EditText Variables
        val totalQuarters = findViewById<EditText>(R.id.txtQuarters)
        val totalDimes = findViewById<EditText>(R.id.txtDimes)
        val totalNickels = findViewById<EditText>(R.id.txtNickels)
        val totalPennies = findViewById<EditText>(R.id.txtPennies)
        val calculateSavings = findViewById<Button>(R.id.btnCalculateSavings)
        val newCalculation = findViewById<Button>(R.id.btnNewCalculation)

        // Button Calculate Savings
        calculateSavings.setOnClickListener(object: View.OnClickListener {
            val result = findViewById<TextView>(R.id.txtResult)

            // Override button click to listen for following values.
            override fun onClick(view: View) {
                // Obtaining values from each text field and converting the values to String.
                sumOfQuarters = Integer.parseInt(totalQuarters.text.toString())
                sumOfDimes = Integer.parseInt(totalDimes.text.toString())
                sumOfNickels = Integer.parseInt(totalNickels.text.toString())
                sumOfPennies = Integer.parseInt(totalPennies.text.toString())

                // Formula for calculating the total number of coins.
                total = sumOfQuarters * quarter + sumOfDimes * dime + sumOfNickels * nickel + sumOfPennies * penny

                // Display calculation output using a decimal format.
                val currency = DecimalFormat("$###,###.###")
                //result.text =  "You have saved " + currency.format(total) + "."
                result.text = String.format(getString(R.string.txtResult) + " " + currency.format(total) + ".")
            }
        }) // End Button Calculate Savings

        // Button New Calculation
        newCalculation.setOnClickListener {
            // Clear EditText Fields
            totalQuarters.setText("")
            totalDimes.setText("")
            totalNickels.setText("")
            totalPennies.setText("")
        } // End Button New Calculation
    }
}
