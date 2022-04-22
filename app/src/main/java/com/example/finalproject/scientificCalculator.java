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

    String finalAnswer;
    double answer;
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
        finalAnswer = sum + "";

        if(finalAnswer.length() < 8){
            result.setText(finalAnswer);
        }
        else{
            finalAnswer = String.format("%6.3e", sum);
            result.setText(finalAnswer);
        }
        previousAnswer = sum;
    }

    public void subtract(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        double diff = num1 - num2;
        finalAnswer = diff + "";

        if(finalAnswer.length() < 8){
            result.setText(finalAnswer);
        }
        else{
            finalAnswer = String.format("%6.3e", diff);
            result.setText(finalAnswer);
        }
        previousAnswer = diff;

    }

    public void multiply(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        double prod = num1 * num2;
        finalAnswer = prod + "";

        if(finalAnswer.length() < 8){
            result.setText(finalAnswer);
        }
        else{
            finalAnswer = String.format("%6.3e", prod);
            result.setText(finalAnswer);
        }
        previousAnswer = prod;
    }

    public void modular(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        double quo = num1 % num2;
        finalAnswer = quo + "";

        if(finalAnswer.length() < 8){
            result.setText(finalAnswer);
        }
        else{
            finalAnswer = String.format("%6.3e", quo);
            result.setText(finalAnswer);
        }
        previousAnswer = quo;
    }

    public void power(View v) {
        input1 = findViewById(R.id.scientificInput1);
        input2 = findViewById(R.id.scientificInput2);

        double num1 = Double.parseDouble(input1.getText().toString());
        double num2 = Double.parseDouble(input2.getText().toString());

        double prod = Math.pow(num1, num2);
        finalAnswer = prod + "";

        if(finalAnswer.length() < 8){
            result.setText(finalAnswer);
        }
        else{
            finalAnswer = String.format("%6.3e", prod);
            result.setText(finalAnswer);
        }
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
            finalAnswer = quo + "";

            if(finalAnswer.length() < 8){
                result.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", quo);
                result.setText(finalAnswer);
            }
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
        newRadians1 = Double.parseDouble(radians1.getText().toString());
        switchState = conversionSwitch.isChecked();

        double variable = (180 / Math.PI) * newRadians1; // degrees
        radians = (Math.PI / 180) * variable;
        degrees = 0.01745329251 * newRadians1;

        if(switchState == false) { // radian format
            answer = Math.sin(radians);

            if(answer == -0) {
                answer = 0;
                finalAnswer = answer + "";

                if(finalAnswer.length() < 8){
                    result.setText(finalAnswer);
                }
                else{
                    finalAnswer = String.format("%6.3e", answer);
                    result.setText(finalAnswer);
                }
                previousAnswer = answer;
            }
            else{
                finalAnswer = answer + "";

                if(finalAnswer.length() < 8){
                    result.setText(finalAnswer);
                }
                else{
                    finalAnswer = String.format("%6.3e", answer);
                    result.setText(finalAnswer);
                }
                previousAnswer = answer;
            }
        }
        else{
            answer = Math.sin(degrees);
            finalAnswer = answer + "";

            if(finalAnswer.length() < 8){
                result.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", answer);
                result.setText(finalAnswer);
            }
            previousAnswer = answer;
        }
        return finalAnswer;
    }

    public String cosClick(View v)
    {
        double variable = (180 / Math.PI) * newRadians1;
        radians = (Math.PI / 180) * variable;
        degrees = 0.01745329251 * newRadians1;

        if(switchState == false) { // radian format
            answer = Math.cos(radians);

            if(answer == -0) {
                answer = 0;
                finalAnswer = answer + "";

                if(finalAnswer.length() < 8){
                    result.setText(finalAnswer);
                }
                else{
                    finalAnswer = String.format("%6.3e", answer);
                    result.setText(finalAnswer);
                }
                previousAnswer = answer;
            }
            else{
                finalAnswer = answer + "";

                if(finalAnswer.length() < 8){
                    result.setText(finalAnswer);
                }
                else{
                    finalAnswer = String.format("%6.3e", answer);
                    result.setText(finalAnswer);
                }
                previousAnswer = answer;
            }
        }
        else{
            answer = Math.cos(degrees);
            finalAnswer = answer + "";

            if(finalAnswer.length() < 8){
                result.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", answer);
                result.setText(finalAnswer);
            }
            previousAnswer = answer;
        }
        return finalAnswer;
    }

    public String tanClick(View v)
    {
        double variable = (180 / Math.PI) * newRadians1; // degrees
        radians = (Math.PI / 180) * variable;
        degrees = 0.01745329251 * newRadians1;

        if(!switchState) { // radian format
            answer = Math.tan(radians);

            if(answer == -0) {
                answer = 0;
                finalAnswer = answer + "";

                if(finalAnswer.length() < 8){
                    result.setText(finalAnswer);
                }
                else{
                    finalAnswer = String.format("%6.3e", answer);
                    result.setText(finalAnswer);
                }
                previousAnswer = answer;
            }
            else{
                finalAnswer = answer + "";

                if(finalAnswer.length() < 8){
                    result.setText(finalAnswer);
                }
                else{
                    finalAnswer = String.format("%6.3e", answer);
                    result.setText(finalAnswer);
                }
                previousAnswer = answer;
            }
        }
        else{
            answer = Math.tan(degrees);
            finalAnswer = answer + "";

            if(finalAnswer.length() < 8){
                result.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", answer);
                result.setText(finalAnswer);
            }
            previousAnswer = answer;
        }
        return finalAnswer;
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
}