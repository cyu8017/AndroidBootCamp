package com.example.cyu.abc_chapter11_exercise1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView txtBmiResult = findViewById(R.id.txtBmiResult);
        ImageView img = findViewById(R.id.imgBMI2);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        int weight = sharedPref.getInt("key1", 0);
        int height = sharedPref.getInt("key2", 0);
        float bmi;

        bmi = ((weight * 703) / (height)^2);
        DecimalFormat currency = new DecimalFormat(("###,###.##"));
        txtBmiResult.setText(String.format("Your BMI is " + currency.format(bmi)));

    }
}
