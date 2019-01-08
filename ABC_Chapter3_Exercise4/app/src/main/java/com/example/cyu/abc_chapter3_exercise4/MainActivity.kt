package com.example.cyu.abc_chapter3_exercise4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    internal var totalDistance: Int = 0
    internal var initialFee = 3.00
    internal var mileage = 3.25
    internal var totalCost: Double = 0.toDouble()
    internal lateinit var groupChoice: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var distance = findViewById<EditText>(R.id.txtDistance)
        var group = findViewById<Spinner>(R.id.txtGroup)

        val cost = findViewById<Button>(R.id.btnCompute)
        cost.setOnClickListener(object: View.OnClickListener {
            val result = findViewById<TextView>(R.id.txtResult)

            override fun onClick(view: View) {
                totalDistance = Integer.parseInt(distance.text.toString())
                totalCost = mileage * totalDistance + initialFee

                val currency = DecimalFormat("$###,###.##")
                groupChoice = group.selectedItem.toString()
                result.text = "Cost for " + groupChoice + " is " + currency.format(totalCost)
            }
        })
    }
}
