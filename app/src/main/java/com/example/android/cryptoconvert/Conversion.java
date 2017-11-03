package com.example.android.cryptoconvert;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Conversion extends AppCompatActivity {

    double Eth, Btc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);



        Intent intent = getIntent();
        String Curr = intent.getStringExtra("Curr");
        Btc = intent.getDoubleExtra("btcVal", 0);
        Eth = intent.getDoubleExtra("ethVal", 0);

        String fullName = getFullName(Curr) + " Conversion";

        //get the initial value TextView
        TextView currFullName = findViewById(R.id.currency);
        currFullName.setText(fullName);

    }

        //Get full money name from curency code
    public String getFullName(String moneyCode) {
        switch (moneyCode) {
            case "NGN": return "Naira";
            case "USD": return "US Dollar";
            case "EUR": return "Euro";
            case "JPY": return "Yen";
            case "GBP": return "Pound Sterling";
            case "AUD": return "Australian Dollar";
            case "CAD": return "Canadian Dollar";
            case "CHF": return "Swiss Franc";
            case "CNY": return "Yuan";
            case "KES": return "Kenyan Shilling";
            case "GHS": return "Cedi";
            case "UGX": return "Ugandan Shilling";
            case "ZAR": return "Rand";
            case "XAF": return "CFA Franc BCEAO";
            case "NZD": return "New Zealand Dollar";
            case "MYR": return "Malaysian Ringgit";
            case "BND": return "Brunei Dollar";
            case "GEL": return "Lari";
            case "RUB": return "Russian Ruble";
            case "INR": return "Indian Rupee";
            default: return "";
        }


    }

         @SuppressLint("DefaultLocale")
        public void convert(View view) {

            EditText initValue = findViewById(R.id.init_value);
            double flatValue = Double.parseDouble(initValue.getText().toString());

            EditText btcValue = findViewById(R.id.btc_value);
            btcValue.setText(String.valueOf(Btc * flatValue));

            EditText ethValue = findViewById(R.id.eth_value);
            ethValue.setText(String.valueOf(Eth * flatValue));

        }
    }

