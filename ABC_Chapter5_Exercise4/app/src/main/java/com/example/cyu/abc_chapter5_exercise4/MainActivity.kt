package com.example.cyu.abc_chapter5_exercise4

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coffeeAttraction = arrayOf("Dunkin Donuts", "Mad City", "Riverside Coffee", "Starbucks")
        listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, coffeeAttraction)
    }

    override fun onListItemClick(i: ListView, v: View, position: Int, id: Long) {
        when (position) {
            0 -> startActivity(Intent(this@MainActivity, DunkinDonuts::class.java))
            1 -> startActivity(Intent(this@MainActivity, MadCity::class.java))
            2 -> startActivity(Intent(this@MainActivity, RiversideCoffee::class.java))
            3 -> startActivity(Intent(this@MainActivity, Starbucks::class.java))
        }
    }
}
