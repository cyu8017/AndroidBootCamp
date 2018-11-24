package com.example.cyu.abc_chapter11_exercise1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int weight;
    int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtWeight = findViewById(R.id.txtWeight);
        final EditText txtHeight = findViewById(R.id.txtHeight);

        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        Button btnCompute = findViewById(R.id.btnCompute);
        btnCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weight = Integer.parseInt(txtWeight.getText().toString());
                height = Integer.parseInt(txtHeight.getText().toString());

                SharedPreferences.Editor editor = sharedPref.edit();

                editor.putInt("key1", weight);
                editor.putInt("key2", height);
                editor.commit();

                startActivity(new Intent(MainActivity.this, Payment.class));
            }
        });

    }
}
