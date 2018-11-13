package com.example.cyu.abc_chapter4_exercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    double weightEntered;
    double convertedWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText weight = findViewById(R.id.txtWeight);
        final RadioButton radType1 = findViewById(R.id.radType1);
        final RadioButton radType2 = findViewById(R.id.radType2);
        final TextView result = findViewById(R.id.txtResult);

        final Button convert = findViewById(R.id.btnORDER);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weightEntered = Double.parseDouble(weight.getText().toString());
                NumberFormat tenth = NumberFormat.getCurrencyInstance();

                if (radType1.isChecked()) {
                    convertedWeight = weightEntered * 10.99;
                    result.setText(tenth.format(convertedWeight));
                    Toast.makeText(MainActivity.this,
                            "Must purchase 12 washes to obtain a discount.",
                            Toast.LENGTH_LONG).show();
                }

                else if (weightEntered > 12) {
                    convertedWeight = weightEntered * 8.99;
                    result.setText(tenth.format(convertedWeight));
                }


                if (radType2.isChecked()) {

                    if (weightEntered < 12) {
                        convertedWeight = weightEntered * 15.99;
                        result.setText(tenth.format(convertedWeight));
                        Toast.makeText(MainActivity.this,
                                "Must purchase 12 washes to obtain a discount." ,
                                Toast.LENGTH_LONG).show();
                    }

                    else if (weightEntered >= 12) {
                        convertedWeight = weightEntered * 12.99;
                        result.setText(tenth.format(convertedWeight));
                    }
                }
            }
        });
    }
}
