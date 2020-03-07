package com.example.moneybitchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button curconverter;
    Button bitconverter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        curconverter = findViewById(R.id.curconverter);
        bitconverter = findViewById(R.id.bitconverter);

        curconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String CurrencyConverter = curconverter.getText().toString();

                Intent myintent = new Intent(MainActivity.this, Main2Activity.class);

                startActivity(myintent);

            }
        });
         bitconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String BitcoinConverter = bitconverter.getText().toString();

                Intent myintent = new Intent(MainActivity.this, Main3Activity.class);

                startActivity(myintent);

            }
        });

    }
}