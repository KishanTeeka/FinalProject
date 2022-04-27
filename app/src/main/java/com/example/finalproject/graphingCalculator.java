package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.Math;
import java.util.Vector;
import java.util.*;
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
