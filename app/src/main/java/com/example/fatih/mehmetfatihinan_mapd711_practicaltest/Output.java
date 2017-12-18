package com.example.fatih.mehmetfatihinan_mapd711_practicaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Output extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);


/*
        i.putExtra("age",textAge2.getText().toString());
        i.putExtra("height",textHeight2.getText().toString());
        i.putExtra("weight",textWeight2.getText().toString());
        i.putExtra("gender",gender);
        i.putExtra("index",index);
        i.putExtra("indexunit",indexUnit);
        i.putExtra("heightunit",heightUnit);
        i.putExtra("weightunit",weightUnit);

        if (bmiIndex < 18.5)
        {
            i.putExtra("status","Underweight");
        }*/
        Intent i2 = getIntent();

        TextView textAge = (TextView) findViewById(R.id.outputAge);
        textAge.setText(i2.getExtras().getString("age"));

        TextView textHeight = (TextView) findViewById(R.id.outputHeight);
        textHeight.setText(i2.getExtras().getString("height"));

        TextView textWeight = (TextView) findViewById(R.id.outputWeight);
        textWeight.setText(i2.getExtras().getString("weight"));

        TextView textGender = (TextView) findViewById(R.id.outputGender);
        textGender.setText(i2.getExtras().getString("gender"));

        TextView textIndex = (TextView) findViewById(R.id.outputBMI);
        textIndex.setText(i2.getExtras().getString("index"));

        TextView textStatus = (TextView) findViewById(R.id.outputStatus);
        textStatus.setText(i2.getExtras().getString("status"));

        TextView textIndexUnit = (TextView) findViewById(R.id.outputBMIUnit);
        textIndexUnit.setText(i2.getExtras().getString("indexunit"));

        TextView textHeightUnit = (TextView) findViewById(R.id.outputHeightUnit);
        textHeightUnit.setText(i2.getExtras().getString("heightunit"));

        TextView textWeightUnit = (TextView) findViewById(R.id.outputWeightUnit);
        textWeightUnit.setText(i2.getExtras().getString("weightunit"));
    }
}
