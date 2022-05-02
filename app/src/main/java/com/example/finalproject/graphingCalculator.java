package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class graphingCalculator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphing_calculator);
    }
    
    public void homePage(View v) {
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
}
