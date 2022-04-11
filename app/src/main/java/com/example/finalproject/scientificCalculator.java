package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class scientificCalculator extends AppCompatActivity {

    private EditText result, radians1, input1, input2;
    private Switch conversionSwitch;
    private Boolean switchState = false;
    private Button enterButton;
    double newRadians1;
    double degrees;
    double radians;
    double toRadians;
    double toDegree;

    double roundOff;
    String finalAnswer;
    double answer;
    double newAnswer1;
    double previousAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);

        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);
        result = (EditText) findViewById(R.id.result);
        conversionSwitch = (Switch) findViewById(R.id.switch1);
        enterButton = (Button)findViewById(R.id.enter);
        radians1 = (EditText) findViewById(R.id.scientificInput1);
        conversionSwitch.setChecked(false);
    }

    public void add(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        double sum = num1 + num2;
        finalAnswer = String.format("%.3f", sum);
        result.setText(finalAnswer);
        previousAnswer = sum;
    }

    public void subtract(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        double diff = num1 - num2;
        finalAnswer = String.format("%.3f", diff);
        result.setText(finalAnswer);
        previousAnswer = diff;
    }

    public void multiply(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        double prod = num1 * num2;
        finalAnswer = String.format("%.3f", prod);
        result.setText(finalAnswer);
        previousAnswer = prod;
    }

    public void modular(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        double quo = num1 % num2;
        finalAnswer = String.format("%.3f", quo);
        result.setText(finalAnswer);
        previousAnswer = quo;
    }

    public void power(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        double prod = Math.pow(num1, num2);
        finalAnswer = String.format("%.3f", prod);
        result.setText(finalAnswer);
        previousAnswer = prod;
    }

    public void divide(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        if(num2 == 0){
            result.setText("undefined");
        }
        else {
            double quo = num1 / num2;
            finalAnswer = String.format("%.3f", quo);
            result.setText(finalAnswer);
            previousAnswer = quo;
        }

    }

    public void clear(View v){
        input1.setText(null);
        input2.setText(null);
        result.setText(null);
    }

    public void usePreviousAnswer(View v) {
        finalAnswer = String.format("%.3f", previousAnswer);

        if(input1.hasFocus()) {
            input1.setText(finalAnswer);
        }
        else{
            input2.setText(finalAnswer);
        }
    }

    public void usePi(View v){
        String pi = Double.toString(Math.PI);
        if(input1.hasFocus()){
            input1.setText(pi);
        }
        else{
            input2.setText(pi);
        }
    }
    public String sinClick(View v)
    {
        // solveScientific();
        newRadians1 = Double.parseDouble(radians1.getText().toString());
        switchState = conversionSwitch.isChecked();
//        degrees = Math.PI / (180 * newRadians1); // radians (doesn't work)

//        degrees = 0.01745329251 * newRadians1;
//        degrees = radians / 57.2958;
//        radians = (Math.PI / 180) * degrees; // doesnt work
//        degrees = (180 / Math.PI) * newRadians1;

        double variable = (180 / Math.PI) * newRadians1; // degrees
        radians = (Math.PI / 180) * variable; // this works but it should be for radians
        degrees = 0.01745329251 * newRadians1;
//        toRadians = newRadians1 * Math.PI / 180;

        if(switchState == false) { // radian format
            answer = Math.sin(radians);
            if(answer == -0) {
                answer = 0;
                finalAnswer = String.format("%.6f", answer);
                result.setText(finalAnswer);
                previousAnswer = answer;
            }
            else{
                finalAnswer = String.format("%.6f", answer);
                result.setText(finalAnswer);
                previousAnswer = answer;
            }
        }
        else{
            answer = Math.sin(degrees);
            finalAnswer = String.format("%.3f", answer);
            result.setText(finalAnswer);
            previousAnswer = answer;
        }
        return finalAnswer;
    }

    public String cosClick(View v)
    {
        // solveScientific();
        double variable = (180 / Math.PI) * newRadians1; // degrees
        radians = (Math.PI / 180) * variable; // this works but it should be for radians
        degrees = 0.01745329251 * newRadians1;
//        toRadians = newRadians1 * 180 / Math.PI;
//        toDegree = newRadians1 * Math.PI / 180;

        if(switchState == false) { // radian format
             // need to change later to match the format

            answer = Math.cos(radians);
            if(answer == -0) {
                answer = 0;
                finalAnswer = String.format("%.6f", answer);
                result.setText(finalAnswer);
                previousAnswer = answer;
            }
            else{
                finalAnswer = String.format("%.6f", answer);
                result.setText(finalAnswer);
                previousAnswer = answer;
            }
        }
        else{
            answer = Math.cos(degrees);
            finalAnswer = String.format("%.6f", answer);
            result.setText(finalAnswer);
            previousAnswer = answer;
        }
        return finalAnswer;
    }

    public String tanClick(View v)
    {
        // solveScientific();
        // toRadians = Math.toRadians(newRadians1);
        double variable = (180 / Math.PI) * newRadians1; // degrees
        radians = (Math.PI / 180) * variable; // this works but it should be for radians
        degrees = 0.01745329251 * newRadians1;

        if(!switchState) { // radian format
            answer = Math.tan(radians);
            if(answer == -0) {
                answer = 0;
                finalAnswer = String.format("%.6f", answer);
                result.setText(finalAnswer);
                previousAnswer = answer;
            }
            else{
                finalAnswer = String.format("%.6f", answer);
                result.setText(finalAnswer);
                previousAnswer = answer;
            }
        }
        else{
            answer = Math.tan(degrees);
            finalAnswer = String.format("%.6f", answer);
            result.setText(finalAnswer);
            previousAnswer = answer;
        }
        return finalAnswer;
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
}