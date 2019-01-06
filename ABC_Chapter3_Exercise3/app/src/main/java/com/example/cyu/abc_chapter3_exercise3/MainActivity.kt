package com.example.cyu.abc_chapter3_exercise3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    internal var gallonsPerSqFt = 250.0
    internal var numberOfGallons: Double = 0.toDouble()
    internal var totalCost: Double = 0.toDouble()
    internal lateinit var groupChoice: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gallons = findViewById<EditText>(R.id.txtGallons)
        val group = findViewById<Spinner>(R.id.txtGroup)

        val cost = findViewById<Button>(R.id.btnCost)
        cost.setOnClickListener(object : View.OnClickListener {
            val result = findViewById<TextView>(R.id.txtResult)

            override fun onClick(view: View) {
                numberOfGallons = Integer.parseInt(gallons.text.toString()).toDouble()
                totalCost = gallonsPerSqFt * numberOfGallons
                val currency = NumberFormat.getCurrencyInstance()
                groupChoice = group.selectedItem.toString()
                result.text = "Cost for " + groupChoice + " is " + currency.format(totalCost)
            }
        })
    }
}
