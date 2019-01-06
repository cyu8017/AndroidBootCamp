package com.example.cyu.abc_chapter5_example

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.view.View
import android.widget.ListView
import android.net.Uri

class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val attraction = arrayOf("Art Institute of Chicago", "Magnificent Mile", "Willis Tower", "Navy Pier", "Water Tower")

        listAdapter = ArrayAdapter(this,
                R.layout.activity_main, R.id.travel, attraction)
    }

    override fun onListItemClick(i: ListView, v: View, position: Int, id: Long) {

        when (position) {

            0 -> startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://artic.edu")))

            1 -> startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://themagnificentmile.com")))

            2 -> startActivity(Intent(this@MainActivity, Willis::class.java))

            3 -> startActivity(Intent(this@MainActivity, Pier::class.java))

            4 -> startActivity(Intent(this@MainActivity, Water::class.java))
        }

    }

}