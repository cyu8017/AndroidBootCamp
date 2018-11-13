package com.example.cyu.abc_chapter4_exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double value1 = 0.19;
    double value2 = 0.49;
    double value3 = 0.79;

    double weightEntered;
    double convertedWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText weight = findViewById(R.id.txtWeight);
        final RadioButton radType1 = findViewById(R.id.radType1);
        final RadioButton radType2 = findViewById(R.id.radType2);
        final RadioButton radType3 = findViewById(R.id.radType3);
        final TextView result = findViewById(R.id.txtResult);

        Button convert = findViewById(R.id.btnORDER);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weightEntered = Double.parseDouble(weight.getText().toString());
                DecimalFormat tenth = new DecimalFormat("#.##");

                if (radType1.isChecked()) {
                    if (weightEntered <= 50) {
                        convertedWeight = weightEntered * value1;
                        result.setText("The order cost is " + tenth.format(convertedWeight));
                    } else {
                        Toast.makeText(MainActivity.this,
                                "Number of prints must be less than 50",
                                Toast.LENGTH_LONG).show();
                    }
                }

                if (radType2.isChecked()) {
                    if (weightEntered <= 50) {
                        convertedWeight = weightEntered * value2;
                        result.setText("The order cost is " + tenth.format(convertedWeight));
                    } else {
                        Toast.makeText(MainActivity.this,
                                "Number of prints must be less than 50",
                                Toast.LENGTH_LONG).show();
                    }
                }

                if (radType3.isChecked()) {
                    if (weightEntered <= 50) {
                        convertedWeight = weightEntered * value3;
                        result.setText("The order cost is " + tenth.format(convertedWeight));
                    } else {
                        Toast.makeText(MainActivity.this,
                                "Number of prints must be less than 50",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}