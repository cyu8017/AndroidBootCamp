package com.example.cyu.abc_chapter5_exercise3

import android.app.ListActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class RentalCar : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rentalCompany = arrayOf("Dollar Rent A Car", "Enterprise Rent A Car", "National Car Rental", "Avis Car Rental", "Hertz", "Alamo Rent A Car")

        listAdapter = ArrayAdapter(this,
                R.layout.activity_rental_car, R.id.rentalCar, rentalCompany)

    }

    override fun onListItemClick(i: ListView, v: View, position: Int, id: Long) {
        when (position) {
            0 -> startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.dollar.com/Reservations/TimePlace.aspx")))

            1 -> startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.enterprise.com/en/home.html")))

            2 -> startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.nationalcar.com/en/home.html")))

            3 -> startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.avis.com/en/home")))

            4 -> startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.hertz.com/rentacar/reservation/")))

            5 -> startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.alamo.com/en_US/car-rental/home.html")))
        }
    }

}

