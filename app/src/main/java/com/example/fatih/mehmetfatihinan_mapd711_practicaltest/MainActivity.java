package com.example.fatih.mehmetfatihinan_mapd711_practicaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnWebsite (View view)
    {
        Intent i = new Intent(MainActivity.this, WebViewActivity.class);
        startActivity(i);
    }



}
