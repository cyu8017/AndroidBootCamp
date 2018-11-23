package com.example.cyu.abc_chapter10_example;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable lightsAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgFrame = findViewById(R.id.imgLights);
        imgFrame.setBackgroundResource(R.drawable.animation);
        lightsAnimation = (AnimationDrawable) imgFrame.getBackground();

        Button button1 = findViewById(R.id.btnStart);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lightsAnimation.start();
            }
        });

        Button button2 = findViewById(R.id.btnStop);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lightsAnimation.stop();
                startActivity(new Intent(MainActivity.this, Tween.class));
            }
        });

    }
}
