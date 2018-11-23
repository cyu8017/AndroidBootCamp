package com.example.cyu.abc_chapter6_exercise1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    MediaPlayer mpBagpipes, mpIrishJig;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btnBagPipes);
        button2 = findViewById(R.id.btnJig);

        button1.setOnClickListener(bBagpipes);
        button2.setOnClickListener(bJig);

        mpBagpipes = new MediaPlayer();
        mpBagpipes = MediaPlayer.create(this, R.raw.bagpipes);

        mpIrishJig = new MediaPlayer();
        mpIrishJig = MediaPlayer.create(this, R.raw.jig);

        playing = 0;
    }

    Button.OnClickListener bJig = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(playing) {
                case 0:
                    mpBagpipes.start();
                    playing = 1;
                    button1.setText("Pause Bagpipes Song");
                    button2.setVisibility(View.INVISIBLE);
                    break;

                case 1:
                    mpBagpipes.pause();
                    playing = 0;
                    button1.setText("Play Bagpipes Song");
                    button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };

    Button.OnClickListener bBagpipes = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(playing) {
                case 0:
                    mpIrishJig.start();
                    playing = 1;
                    button1.setText("Pause Irish Jig");
            }
        }
    };

}
