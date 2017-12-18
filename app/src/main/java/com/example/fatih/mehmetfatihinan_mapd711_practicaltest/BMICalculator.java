package com.example.fatih.mehmetfatihinan_mapd711_practicaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class BMICalculator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
    }


    public void btnCalculate (View view)
    {
        int bmiIndex;
        String bmiStatus = "Normal";

        EditText textAge = (EditText) findViewById(R.id.editTextAge);
        EditText textHeight = (EditText) findViewById(R.id.editTextHeight);
        EditText textWeight = (EditText) findViewById(R.id.weightEditText);


        int age = Integer.parseInt(textAge.toString());
        int height = Integer.parseInt(textHeight.toString());
        int weight = Integer.parseInt(textWeight.toString());

        RadioButton rbUnit = (RadioButton) findViewById(((RadioGroup) findViewById(R.id.radioGroupUnit)).getCheckedRadioButtonId());
        String unit = rbUnit.getText().toString();

        RadioButton rbGender = (RadioButton) findViewById(((RadioGroup) findViewById(R.id.radioGroupGender)).getCheckedRadioButtonId());
        String gender = rbGender.getText().toString();

        Intent i = new Intent(BMICalculator.this, Output.class);

        if (unit == "metric")
        {
            bmiIndex = weight/((height/100)*(height/100));
        }
        else
        {
            bmiIndex = 703*weight / (height*height);
        };

        String index = Integer.toString(bmiIndex);

        EditText textAge2 = (EditText) findViewById(R.id.editTextAge);
        EditText textHeight2 = (EditText) findViewById(R.id.editTextHeight);
        EditText textWeight2 = (EditText) findViewById(R.id.weightEditText);

        i.putExtra("age",textAge2.getText().toString());
        i.putExtra("height",textHeight2.getText().toString());
        i.putExtra("weight",textWeight2.getText().toString());
        i.putExtra("gender",gender);
        i.putExtra("unit",unit);
        i.putExtra("index",index);

        if (bmiIndex < 18.5)
        {
            i.putExtra("status","Underweight");
        }
        else if (bmiIndex>= 18.5 && bmiIndex<25)
        {
            i.putExtra("status","Normal");
        }

        else if (bmiIndex> 25)
        {
            i.putExtra("status","Overweight");
        }

        startActivity(i);
    }

}
