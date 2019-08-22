package com.example.basiccurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convertCurr(View currView) {
        Double inrToUsdRate = 0.014;
        EditText currencyEditText = findViewById(R.id.currencyEditText);
        TextView currencyOutTextView = findViewById(R.id.currencyOutTextView);

        if (!currencyEditText.getText().toString().isEmpty())
            currencyOutTextView.setText(String.format("%.2f", Double.parseDouble(currencyEditText.getText().toString()) * inrToUsdRate) + " USD");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
