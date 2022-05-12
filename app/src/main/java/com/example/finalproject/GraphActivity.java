package com.example.finalproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GraphActivity extends AppCompatActivity {

    private MyCanvas canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        canvas = new MyCanvas(this);
        canvas.setBackgroundColor(Color.rgb(255,0,0));
        canvas.setEquations(getIntent().<Equation>getParcelableArrayListExtra("equations"));
        canvas.setVisibilities(getIntent().getBooleanArrayExtra("visibilities"));
        canvas.setNums(getIntent().getIntExtra("xNum", 10), getIntent().getIntExtra("yNum", 10));
        setContentView(canvas);
    }
    public void homePage(View v){
        Intent homePage = new Intent(this, graphingCalculator.class);
        startActivity(homePage);
    }
}