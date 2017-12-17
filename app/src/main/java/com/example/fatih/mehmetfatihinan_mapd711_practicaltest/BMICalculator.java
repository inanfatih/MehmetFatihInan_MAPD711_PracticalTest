package com.example.fatih.mehmetfatihinan_mapd711_practicaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BMICalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
    }


    public void btnCalculate (View view)
    {
        Intent i = new Intent(BMICalculator.this, Output.class);
        startActivity(i);
    }

}
