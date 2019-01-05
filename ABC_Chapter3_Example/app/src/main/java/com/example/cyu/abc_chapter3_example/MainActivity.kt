package com.example.cyu.abc_chapter3_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    internal var numberOfTickets: Int = 0
    internal var costPerTicket = 79.99
    internal var totalCost: Double = 0.toDouble()
    internal lateinit var groupChoice: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tickets = findViewById<EditText>(R.id.txtTickets)
        val group = findViewById<Spinner>(R.id.txtGroup)

        val cost = findViewById<Button>(R.id.btnCost)
        cost.setOnClickListener(object : View.OnClickListener {
            val result = findViewById<TextView>(R.id.txtResult)

            override fun onClick(view: View) {
                numberOfTickets = Integer.parseInt(tickets.text.toString())
                totalCost = costPerTicket * numberOfTickets

                val currency = DecimalFormat("$###,###.##")

                groupChoice = group.selectedItem.toString()
                result.text = "Cost for " + groupChoice + " is " + currency.format(totalCost)
            }
        })
    }
}
