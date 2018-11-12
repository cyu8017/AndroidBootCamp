package com.example.cyu.abc_chapter3_exercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    int numberOfAthletes;
    double costPerAthlete = 725.00;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText athletes = findViewById(R.id.txtTriathlon);
        final Spinner group = findViewById(R.id.txtGroup);

        final Button cost = findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result = findViewById(R.id.txtResult);

            @Override
            public void onClick(View view) {
                numberOfAthletes = Integer.parseInt(athletes.getText().toString());
                totalCost = numberOfAthletes * costPerAthlete;

                DecimalFormat currency = new DecimalFormat("$###,###.##");

                groupChoice = group.getSelectedItem().toString();
                result.setText("Cost for " + groupChoice + " is " + currency.format(totalCost));
            }
        });

    }
}
