package com.example.cyu.archroamrighttsb

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnPreExisting.setOnClickListener {
            val intent = Intent(this, preExistingActivity::class.java)
            startActivity(intent)
        }

        btnFreeLookPeriod.setOnClickListener {
            val intent = Intent(this, freeLookPeriod::class.java)
            startActivity(intent)
        }
    }
}
