package com.example.cyu.archroamrighttsb

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    private var mDelayHandler: Handler? = null
    private val splashDelay: Long = 3000 // 3 Seconds

    private val mRunnable: Runnable = Runnable {
        if (!isFinishing) {
            val intent = Intent(applicationContext, HomeActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the Handler
        mDelayHandler = Handler()

        // Navigate with delay
        mDelayHandler!!.postDelayed(mRunnable, splashDelay)
    }

    public override fun onDestroy() {
        if (mDelayHandler != null) {
            mDelayHandler!!.removeCallbacks(mRunnable)
        }

        super.onDestroy()
    }
}
