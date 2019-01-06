package com.example.cyu.abc_chapter5_exercise2

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

        val attraction = arrayOf("Chocolate Mousse", "Chocolate Cake", "Chocolate Macaron", "Chocolate Cafe Website")

        listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, attraction)
    }

    override fun onListItemClick(i: ListView, v: View, position: Int, id: Long) {

        when (position) {

            0 -> startActivity(Intent(this@MainActivity, Mousse::class.java))

            1 -> startActivity(Intent(this@MainActivity, Cake::class.java))

            2 -> startActivity(Intent(this@MainActivity, Macaron::class.java))
        }
    }
}
