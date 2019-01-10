package com.example.cyu.abc_chapter10_exercise1

import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var lightsAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgFrame = findViewById<ImageView>(R.id.imgActor)
        imgFrame.setBackgroundResource(R.drawable.animation)
        lightsAnimation = imgFrame.background as AnimationDrawable

        val button1 = findViewById<Button>(R.id.btnStart)
        button1.setOnClickListener { lightsAnimation.start() }
    }
}
