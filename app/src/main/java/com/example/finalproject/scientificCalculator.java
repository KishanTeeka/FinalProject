package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.view.View;
import android.widget.TextView;

public class scientificCalculator extends AppCompatActivity {

    double cosConversion;
    double sinConversion;
    double tanConversion;

    TextView result = (TextView) findViewById(R.id.result);
    Switch conversionSwitch = (Switch) findViewById(R.id.switch1);
    Boolean switchState = conversionSwitch.isChecked();
    Button enterButton = (Button)findViewById(R.id.enter);

    EditText radians1 = (EditText) findViewById(R.id.scientificInput1);
    double newRadians1;

    double toRadians;
    double toDegree;

    String finalAnswer;
    double answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);
    }

    public void onSinClick(View v)
    {
        // solveScientific();
        newRadians1 = Double.parseDouble(radians1.getText().toString());
        double toRadians = Math.toRadians(newRadians1);
        double toDegree = Math.toDegrees(newRadians1);

        if(switchState == false) { // radian format
            answer = Math.sin(toRadians);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer); // need to change later to match the format


        }
        else {
            answer = Math.sin(toDegree);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer);
        }
    }

    public void onCosClick(View v)
    {
        // solveScientific();
        toRadians = Math.toRadians(newRadians1);
        toDegree = Math.toDegrees(newRadians1);
        newRadians1 = Double.parseDouble(radians1.getText().toString());

        if(switchState == false) { // radian format
             // need to change later to match the format

            answer = Math.cos(toRadians);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer);
        }
        else {
            answer = Math.cos(toDegree);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer);
        }
    }

    public void onTanClick(View v)
    {
        // solveScientific();
        double toRadians = Math.toRadians(newRadians1);
        double toDegree = Math.toDegrees(newRadians1);
        newRadians1 = Double.parseDouble(radians1.getText().toString());

        if(switchState == false) { // radian format
            answer = Math.tan(toRadians);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer); // need to change later to match the format

        }
        else {
            answer = Math.tan(toDegree);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer);
        }
    }

//    public void solveScientific() {
//        newRadians1 = Double.parseDouble(radians1.getText().toString());
//        oldRadians1 = Double.parseDouble(radians1.getText().toString());
//        toDegree = Math.toDegrees(oldRadians1);
//
//    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
}