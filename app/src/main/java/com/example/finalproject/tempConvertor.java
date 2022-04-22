package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class tempConvertor extends AppCompatActivity {

    private Spinner inputUnit, outputUnit;
    private double input, output;
    private EditText outputResult, inputNumber;
    private String finalAnswer, inputText, outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_convertor);

        outputResult = (EditText) findViewById(R.id.outputET);
        inputNumber = (EditText) findViewById(R.id.inputET);
        // input = Double.parseDouble(inputNumber.toString());

        inputUnit = (Spinner) findViewById(R.id.spinner1);
        outputUnit = (Spinner) findViewById(R.id.spinner2);
    }

    public void convert(View v){
        inputText = inputUnit.getSelectedItem().toString();
        outputText = outputUnit.getSelectedItem().toString();

        if(inputText.equals("Celsius") && outputText.equals("Celsius")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if(inputText.equals("Celsius") && outputText.equals("Fahrenheit")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 1.8) + 32;

            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if(inputText.equals("Celsius") && outputText.equals("Kelvin")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input + 273.15;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }


        }

        else if(inputText.equals("Celsius") && outputText.equals("Rankine")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 1.8) + 491.67;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // Celsius done

        else if(inputText.equals("Fahrenheit") && outputText.equals("Fahrenheit")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if(inputText.equals("Fahrenheit") && outputText.equals("Celsius")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input - 32) * (0.5555556);
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if(inputText.equals("Fahrenheit") && outputText.equals("Kelvin")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input - 32) * (0.5555556) + 273.15;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if(inputText.equals("Fahrenheit") && outputText.equals("Rankine")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input + 459.67;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // Fahrenheit done


        else if(inputText.equals("Kelvin") && outputText.equals("Kelvin")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }

        }

        else if(inputText.equals("Kelvin") && outputText.equals("Celsius")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input - 273.15;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            };
        }

        else if(inputText.equals("Kelvin") && outputText.equals("Fahrenheit")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input - 273.15) * (1.8) + 32;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if(inputText.equals("Kelvin") && outputText.equals("Rankine")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input - 273.15) * (1.8) + 32;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // Kelvin done



        else if(inputText.equals("Rankine") && outputText.equals("Rankine")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if(inputText.equals("Rankine") && outputText.equals("Celsius")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input - 491.67) * (0.55555556);
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if(inputText.equals("Rankine") && outputText.equals("Fahrenheit")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input - 459.67;
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if(inputText.equals("Rankine") && outputText.equals("Kelvin")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * (0.5555556);
            finalAnswer = output + "";

            if(finalAnswer.length() < 8){
                outputResult.setText(finalAnswer);
            }
            else{
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }



    }
    public void homePage(View v){
        Intent homePage = new Intent(this, conversionHome.class);
        startActivity(homePage);
    }
}