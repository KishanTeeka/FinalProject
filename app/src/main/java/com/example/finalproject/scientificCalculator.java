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

    double oldRadians1;
    double toDegree;
    double answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);

        Switch conversionSwitch = (Switch) findViewById(R.id.switch1);
        Boolean switchState = conversionSwitch.isChecked();
        enterButton = (Button)findViewById(R.id.enter);

        EditText radians1 = (EditText) findViewById(R.id.scientificInput1);
        double newRadians1 = Double.parseDouble(radians1.getText().toString());

        double oldRadians1 = Double.parseDouble(radians1.getText().toString());
        double toDegree = Math.toDegrees(oldRadians1);
    }

    public void onSinClick(View v)
    {
        // solveScientific();
        newRadians1 = Double.parseDouble(radians1.getText().toString());
        double toRadians = Math.toRadians(newRadians1);
        double toDegree = Math.toDegrees(newRadians1);

        if(switchState == false) { // radian format
            radians1.getText();
            answer = Math.sin(toRadians);
            result.setText(answer); // need to change later to match the format


        }
        else {
            double answer2 = Math.sin(toDegree);
            System.out.println(answer2);
        }
    }

    public void onCosClick(View v)
    {
        // solveScientific();
        double toRadians = Math.toRadians(newRadians1);
        double toDegree = Math.toDegrees(newRadians1);
        newRadians1 = Double.parseDouble(radians1.getText().toString());

        if(switchState == false) { // radian format
             // need to change later to match the format

            double answer = Math.cos(toRadians);
            System.out.println(answer);
        }
        else {
            double answer2 = Math.cos(toDegree);
            System.out.println(answer2);
        }
    }

    public void onTanClick(View v)
    {
        // solveScientific();
        double toRadians = Math.toRadians(newRadians1);
        double toDegree = Math.toDegrees(newRadians1);
        newRadians1 = Double.parseDouble(radians1.getText().toString());

        if(switchState == false) { // radian format
            radians1.getText();
            result.setText(radians1.getText()); // need to change later to match the format

            double answer = Math.tan(toRadians);
            System.out.println(answer);
        }
        else {
            double answer2 = Math.tan(toDegree);
            System.out.println(answer2);
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