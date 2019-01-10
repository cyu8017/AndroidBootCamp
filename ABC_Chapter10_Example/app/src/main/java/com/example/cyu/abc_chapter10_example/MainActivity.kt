package com.example.cyu.abc_chapter10_example

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var lightsAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgFrame = findViewById<ImageView>(R.id.imgLights)
        imgFrame.setBackgroundResource(R.drawable.animation)
        lightsAnimation = imgFrame.background as AnimationDrawable

        val button1 = findViewById<Button>(R.id.btnStart)
        button1.setOnClickListener { lightsAnimation.start() }

        val button2 = findViewById<Button>(R.id.btnStop)
        button2.setOnClickListener {
            lightsAnimation.stop()
            startActivity(Intent(this@MainActivity, Tween::class.java))
        }

    }
}
