package com.example.cyu.abc_chapter11_exercise2;

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

        TextView interestPaid = findViewById(R.id.txtInterestPaid);
        ImageView image = findViewById(R.id.imgMortgage);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        float monthlyPayment = sharedPref.getFloat("key1", 0);
        int numOfYears = sharedPref.getInt("key2", 0);
        float principalAmount = sharedPref.getFloat("key3", 0);
        float totalInterest;

        totalInterest = monthlyPayment * numOfYears - principalAmount;

        DecimalFormat currency = new DecimalFormat("$###,###.##");
        interestPaid.setText("Your total interest is: " + currency.format(totalInterest));

        if (numOfYears == 10) {
            image.setImageResource(R.drawable.ten);
        }

        else if (numOfYears == 20) {
            image.setImageResource(R.drawable.twenty);
        }

        else if (numOfYears == 30) {
            image.setImageResource(R.drawable.thirty);
        }

        else {
            interestPaid.setText("Error");
        }
    }
}
