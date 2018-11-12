package com.example.cyu.abc_chapter3_exercise3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    double gallonsPerSqFt = 250;
    double numberOfGallons;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText gallons = findViewById(R.id.txtGallons);
        final Spinner group = findViewById(R.id.txtGroup);

        Button cost = findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result = findViewById(R.id.txtResult);

            @Override
            public void onClick(View view) {
                numberOfGallons = Integer.parseInt(gallons.getText().toString());
                totalCost = gallonsPerSqFt * numberOfGallons;
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                groupChoice = group.getSelectedItem().toString();
                result.setText("Cost for " + groupChoice + " is " + currency.format(totalCost));
            }
        });
    }
}
