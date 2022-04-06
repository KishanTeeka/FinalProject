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
    private Boolean switchState;
    private Button enterButton;
    double newRadians1;

    double toRadians;
    double toDegree;

    String finalAnswer;
    double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);

        result = (EditText) findViewById(R.id.result);
        conversionSwitch = (Switch) findViewById(R.id.switch1);
        switchState = conversionSwitch.isChecked();
        enterButton = (Button)findViewById(R.id.enter);
        radians1 = (EditText) findViewById(R.id.scientificInput1);
    }

    public String sinClick(View v)
    {
        // solveScientific();
        newRadians1 = Double.parseDouble(radians1.getText().toString());
        toRadians = Math.toRadians(newRadians1);
        toDegree = Math.toDegrees(newRadians1);

        if(!switchState) { // radian format
            answer = Math.sin(toRadians);
        }
        else if (switchState){
            answer = Math.sin(toDegree);
        }
        finalAnswer = Double.toString(answer);
        result.setText(finalAnswer);
        return finalAnswer;
        // need to change later to match the format
    }

    public String cosClick(View v)
    {
        // solveScientific();
        newRadians1 = Double.parseDouble(radians1.getText().toString());
        toRadians = Math.toRadians(newRadians1);
        toDegree = Math.toDegrees(newRadians1);


        if(!switchState) { // radian format
             // need to change later to match the format

            answer = Math.cos(toRadians);
        }
        else if (switchState){
            answer = Math.cos(toDegree);
        }
        finalAnswer = Double.toString(answer);
        result.setText(finalAnswer);
        return finalAnswer;
    }

    public String tanClick(View v)
    {
        // solveScientific();
        toRadians = Math.toRadians(newRadians1);
        toDegree = Math.toDegrees(newRadians1);
        newRadians1 = Double.parseDouble(radians1.getText().toString());

        if(!switchState) { // radian format
            answer = Math.tan(toRadians);

        }
        else if (switchState) {
            answer = Math.tan(toDegree);
        }
        finalAnswer = Double.toString(answer);
        result.setText(finalAnswer);
        return finalAnswer;
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
}