package com.example.cyu.abc_chapter11_exercise2

import android.content.Intent
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var monthlyPayment: Float = 0.toFloat()
    private var numOfYears: Int = 0
    private var principalAmount: Float = 0.toFloat()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtMonthlyPayment = findViewById<EditText>(R.id.txtMonthlyPayment)
        val txtNumOfYears = findViewById<EditText>(R.id.txtNumOfYears)
        val txtPrincipalAmount = findViewById<EditText>(R.id.txtPrincipalAmount)
        val sharedPref = PreferenceManager.getDefaultSharedPreferences(this)
        val btnCompute = findViewById<Button>(R.id.btnCompute)

        btnCompute.setOnClickListener {
            monthlyPayment = java.lang.Float.parseFloat(txtMonthlyPayment.text.toString())
            numOfYears = Integer.parseInt(txtNumOfYears.text.toString())
            principalAmount = java.lang.Float.parseFloat(txtPrincipalAmount.text.toString())

            val editor = sharedPref.edit()
            editor.putFloat("key1", monthlyPayment)
            editor.putInt("key2", numOfYears)
            editor.putFloat("key3", principalAmount)
            editor.apply()

            startActivity(Intent(this@MainActivity, Payment::class.java))
        }
    }
}
