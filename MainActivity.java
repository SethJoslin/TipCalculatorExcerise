package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton15();
        initButton18();
        initButton20();
    }


    private void initButton15() {
        Button tip15Button = findViewById(R.id.button15);
        tip15Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Resources res = getResources();

                EditText editTextBill = findViewById(R.id.editTextBillAmount);
                String billString = editTextBill.getText().toString();
                double bill = Double.valueOf(billString);
                double tip = (bill * .15);
                String displayTip = String.format("%.2f", tip);
                double total = tip + bill;
                String displayTotal = String.format("%.2f", total);

                String displayString = res.getString(R.string.result, displayTip, displayTotal);
                TextView textDisplay = findViewById(R.id.textViewTotals);
                textDisplay.setText(displayString);
            }
        });
    }

    private void initButton18() {
        Button tip18Button = findViewById(R.id.button18);
        tip18Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Resources res = getResources();

                EditText editTextBill = findViewById(R.id.editTextBillAmount);
                String billString = editTextBill.getText().toString();
                double bill = Double.valueOf(billString);
                double tip = (bill * .18);
                String displayTip = String.format("%.2f", tip);
                double total = tip + bill;
                String displayTotal = String.format("%.2f", total);

                String displayString = res.getString(R.string.result, displayTip, displayTotal);
                TextView textDisplay = findViewById(R.id.textViewTotals);
                textDisplay.setText(displayString);
            }
        });
    }

    private void initButton20() {
        Button tip20Button = findViewById(R.id.button20);
        tip20Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Resources res = getResources();

                EditText editTextBill = findViewById(R.id.editTextBillAmount);
                String billString = editTextBill.getText().toString();
                double bill = Double.valueOf(billString);
                double tip = (bill * .2);
                String displayTip = String.format("%.2f", tip);
                double total = tip + bill;
                String displayTotal = String.format("%.2f", total);

                String displayString = res.getString(R.string.result, displayTip, displayTotal);
                TextView textDisplay = findViewById(R.id.textViewTotals);
                textDisplay.setText(displayString);
            }
        });

    }

}