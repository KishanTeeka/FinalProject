package com.example.finalproject;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class GraphActivity extends AppCompatActivity {

    private MyCanvas canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        canvas = new MyCanvas(this);
        canvas.setBackgroundColor(Color.WHITE);
        canvas.setEquations(getIntent().<Equation>getParcelableArrayListExtra("equations"));
        canvas.setVisibilities(getIntent().getBooleanArrayExtra("visibilities"));
        canvas.setNums(getIntent().getIntExtra("xNum", 10), getIntent().getIntExtra("yNum", 10));
        setContentView(canvas);
    }
}