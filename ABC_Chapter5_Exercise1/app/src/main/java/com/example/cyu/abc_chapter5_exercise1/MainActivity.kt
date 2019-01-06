package com.example.cyu.abc_chapter5_exercise1

import android.os.Bundle
import android.app.ListActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.view.View
import android.content.Intent
import android.net.Uri

class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val attraction = arrayOf("Beach Bike Rentals", "Mountain Bike Rentals", "Bike Rental Website")
        listAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, attraction)
    }

    override fun onListItemClick(i: ListView, v: View, position: Int, id: Long) {

        when (position) {

            0 -> startActivity(Intent(this@MainActivity, Beach::class.java))

            1 -> startActivity(Intent(this@MainActivity, Mountain::class.java))

            2 -> startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.campusbikeshop.com")))
        }
    }
}