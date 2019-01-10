package com.example.cyu.abc_chapter10_exercise1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class Tween : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tween)

        val imgRotate = findViewById<ImageView>(R.id.imgTween)
        imgRotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation))
    }
}
