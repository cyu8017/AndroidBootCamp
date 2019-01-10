package com.example.cyu.abc_chapter4_exercise4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    //private var tile1:

    private var lengthEntered: Double = 0.toDouble()
    private var widthEntered: Double = 0.toDouble()
    private var areaOfRoom: Double = 0.toDouble()
    private var tile1: Int = 12
    private var tile2: Int = 18

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.ic_launcher)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        val length = findViewById<EditText>(R.id.txtLength)
        val width = findViewById<EditText>(R.id.txtWidth)
        val radType1 = findViewById<RadioButton>(R.id.radType1)
        val radType2 = findViewById<RadioButton>(R.id.radType2)
        val calculate = findViewById<Button>(R.id.btnCalculate)
        val result = findViewById<TextView>(R.id.txtResult)

        calculate.setOnClickListener {
            lengthEntered = java.lang.Double.parseDouble(length.toString())
            widthEntered = java.lang.Double.parseDouble(width.toString())
            val tenth = DecimalFormat("0.##")

            if (radType1.isChecked) {
                areaOfRoom = lengthEntered * widthEntered * tile1
                result.text = tenth.format(areaOfRoom) + "Square Feet"
            }

            if (radType2.isChecked) {
                areaOfRoom = lengthEntered * widthEntered * tile2
                result.text = tenth.format(areaOfRoom) + "Square Feet"
            }
        }
    }
}
