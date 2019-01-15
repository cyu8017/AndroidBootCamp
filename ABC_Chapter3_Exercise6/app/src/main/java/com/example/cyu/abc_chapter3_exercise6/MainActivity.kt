package com.example.cyu.abc_chapter3_exercise6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    internal var quarter = 0.25
    internal var dime = 0.10
    internal var nickel = 0.05
    internal var penny = 0.01

    internal var sumQuarters = 0
    internal var sumDimes = 0
    internal var sumNickels = 0
    internal var sumPennies = 0

    internal var total: Double = 0.toDouble()
    internal lateinit var groupChoice: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val totalQuarters = findViewById<EditText>(R.id.txtQuarters)
        val totalDimes = findViewById<EditText>(R.id.txtDimes)
        val totalNickels = findViewById<EditText>(R.id.txtNickels)
        val totalPennies = findViewById<EditText>(R.id.txtPennies)
        val group = findViewById<Spinner>(R.id.txtGroup)

        val calculate = findViewById<Button>(R.id.btnCalculate)
        calculate.setOnClickListener(object: View.OnClickListener {
            val result = findViewById<TextView>(R.id.txtResult)

            override fun onClick(view: View) {
                sumQuarters = Integer.parseInt(totalQuarters.text.toString())
                sumDimes = Integer.parseInt(totalDimes.text.toString())
                sumNickels = Integer.parseInt(totalNickels.text.toString())
                sumPennies = Integer.parseInt(totalPennies.text.toString())

                total = sumQuarters * quarter + sumDimes * dime + sumNickels * nickel + sumPennies * penny

                val currency = DecimalFormat("$###,###.##")
                groupChoice = group.selectedItem.toString()
                //result.text = "Total Amount " + groupChoice + currency.format(total)
                result.text = String.format(getString(R.string.totalAmount)) + currency.format(total)
            }
        })
    }
}
