package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class scientificCalculator extends AppCompatActivity {

    private EditText result, radians1;
    private Switch conversionSwitch;
    private Boolean switchState = false;
    private Button enterButton;
    double newRadians1;
    double degrees;
    double radians;
    double toRadians;
    double toDegree;

    String finalAnswer;
    double answer;
    double newAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);

        result = (EditText) findViewById(R.id.result);
        conversionSwitch = (Switch) findViewById(R.id.switch1);
        enterButton = (Button)findViewById(R.id.enter);
        radians1 = (EditText) findViewById(R.id.scientificInput1);
        conversionSwitch.setChecked(false);
    }

    public String sinClick(View v)
    {
        // solveScientific();
        newRadians1 = Double.parseDouble(radians1.getText().toString());
        switchState = conversionSwitch.isChecked();
//        degrees = Math.PI / (180 * newRadians1); // radians (doesn't work)

        degrees = 0.01745329251 * newRadians1;
        radians = (180 / Math.PI) * newRadians1; // degrees
//        toRadians = newRadians1 * Math.PI / 180;

        if(switchState == false) { // radian format
            answer = Math.sin(radians);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer);
        }
        else{
            answer = Math.sin(degrees);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer);
        }
        return finalAnswer;
    }

    public String cosClick(View v)
    {
        // solveScientific();
        newRadians1 = Double.parseDouble(radians1.getText().toString());
        switchState = conversionSwitch.isChecked();
        toRadians = Math.toRadians(newRadians1);
        toDegree = Math.toDegrees(newRadians1);
//        toRadians = newRadians1 * 180 / Math.PI;
//        toDegree = newRadians1 * Math.PI / 180;

        if(!switchState) { // radian format
             // need to change later to match the format

            answer = Math.cos(toDegree);
        }
        else{
            answer = Math.cos(toRadians);
        }
        finalAnswer = Double.toString(answer);
        result.setText(finalAnswer);

        return finalAnswer;
    }

    public String tanClick(View v)
    {
        // solveScientific();
        // toRadians = Math.toRadians(newRadians1);
        newRadians1 = Double.parseDouble(radians1.getText().toString());
        toDegree = Math.toDegrees(newRadians1);
        toRadians = newRadians1 * Math.PI / 180;

        if(!switchState) { // radian format
            answer = Math.tan(toDegree);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer);

        }
        else{
            answer = Math.tan(toRadians);
            finalAnswer = Double.toString(answer);
            result.setText(finalAnswer);
        }
        return finalAnswer;
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
}