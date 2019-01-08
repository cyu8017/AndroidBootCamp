package com.example.cyu.abc_chapter3_exercise5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    internal var numberOfFriends: Int = 0
    internal var tipPercent = 0.18
    internal var totalBillAmount = 0
    internal var total: Double = 0.toDouble()
    internal lateinit var groupChoice: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val totalBill = findViewById<EditText>(R.id.txtAmount)
        val numOfPeople = findViewById<EditText>(R.id.numOfPeople)
        val group = findViewById<Spinner>(R.id.txtGroup)

        val calculate = findViewById<Button>(R.id.btnCalculate)
        calculate.setOnClickListener(object: View.OnClickListener {
            val result = findViewById<TextView>(R.id.txtResult)

            override fun onClick(view: View) {
                totalBillAmount = Integer.parseInt(totalBill.text.toString())
                numberOfFriends = Integer.parseInt(numOfPeople.text.toString())
                total = tipPercent * totalBillAmount / numberOfFriends

                val currency = DecimalFormat("$###,###.##")

                groupChoice = group.selectedItem.toString()
                result.text = "Tip amount is " + currency.format(total)
            }
        })
    }
}
