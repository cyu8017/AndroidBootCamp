package com.example.cyu.abc_chapter11_exercise2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    float monthlyPayment;
    int numOfYears;
    float principalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtMonthlyPayment = findViewById(R.id.txtMonthlyPayment);
        final EditText txtNumOfYears = findViewById(R.id.txtNumOfYears);
        final EditText txtPrincipalAmount = findViewById(R.id.txtPrincipalAmount);

        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        Button btnCompute = findViewById(R.id.btnCompute);
        btnCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                monthlyPayment = Float.parseFloat(txtMonthlyPayment.getText().toString());
                numOfYears = Integer.parseInt(txtNumOfYears.getText().toString());
                principalAmount = Float.parseFloat(txtPrincipalAmount.getText().toString());

                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putFloat("key1", monthlyPayment);
                editor.putInt("key2", numOfYears);
                editor.putFloat("key3", principalAmount);
                editor.commit();

                startActivity(new Intent(MainActivity.this, Payment.class));
            }
        });
    }
}
