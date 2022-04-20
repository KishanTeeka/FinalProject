package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;


public class lengthConvertor extends AppCompatActivity {

    private Spinner spinner1, spinner2;
    private Button btnSubmit;
    private Spinner inputUnit, outputUnit;
    private double input, output;
    private EditText outputResult, inputNumber;
    private String finalAnswer, inputText, outputText, compareValue, compareValue2;
    private ArrayAdapter<CharSequence> adapter, adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_convertor);

        outputResult = (EditText) findViewById(R.id.outputET);
        inputNumber = (EditText) findViewById(R.id.inputET);
        // input = Double.parseDouble(inputNumber.toString());

        inputUnit = (Spinner) findViewById(R.id.spinner1);
        outputUnit = (Spinner) findViewById(R.id.spinner2);
    }

    public String convert(View v) {

        input = Double.parseDouble(inputNumber.toString());
        compareValue = "mm";
        adapter = ArrayAdapter.createFromResource(this, R.array.length_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inputUnit.setAdapter(adapter);

        //int spinnerPosition1 = adapter.getPosition(compareValue);

        compareValue2 = "cm";
        adapter2 = ArrayAdapter.createFromResource(this, R.array.length_arrays2, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        outputUnit.setAdapter(adapter2);

        //int spinnerPosition2 = adapter2.getPosition(compareValue2);

        int spinnerPosition1 = adapter.getPosition(compareValue);
        int spinnerPosition2 = adapter.getPosition(compareValue2);

        if (compareValue != null && compareValue2 != null) {
            inputUnit.setSelection(spinnerPosition1);
            outputUnit.setSelection(spinnerPosition2);

            if(spinnerPosition1 == 0) {
                if(spinnerPosition2 == 1) {
                    double result = input *= 10;
                    finalAnswer = String.format("%.3f", result);
                    outputResult.setText(finalAnswer);
                }
            }
        }


//        inputUnit = findViewById(R.id.spinner1);
//        outputUnit = findViewById(R.id.spinner2);


//        ArrayAdapter<String> spinnerCountShoesArrayAdapter = new ArrayAdapter<String>(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                getResources().getStringArray(R.array.length_arrays));
//        inputUnit.setAdapter(spinnerCountShoesArrayAdapter);
//
//
//        ArrayAdapter<String> spinnerCountShoesArrayAdapter2 = new ArrayAdapter<String>(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                getResources().getStringArray(R.array.length_arrays));
//        inputUnit.setAdapter(spinnerCountShoesArrayAdapter2);

//        inputNumber = (EditText) findViewById(R.id.input);
//        outputResult = (EditText) findViewById(R.id.outputresult);
//        double input = Double.parseDouble(inputNumber.toString());

//        inputUnit.setSelection(((ArrayAdapter<String>)inputUnit.getAdapter()).getPosition());
//         inputText = inputUnit.getSelectedItem().toString();
//         outputText = outputUnit.getSelectedItem().toString();




//        else if(inputText == "mm" && outputText == "mm"){
//            result = input * 1000;
//            finalAnswer = String.format("%.3f", result);
//            outputResult.setText(finalAnswer);
//        }
//        else if(inputText == "mm" && outputText == "km"){
//            result = input * 1000000;
//            finalAnswer = String.format("%.3f", result);
//            outputResult.setText(finalAnswer);
//        }
//        else if(inputText == "mm" && outputText == "in"){
//            result = input / 25.4;
//            finalAnswer = String.format("%.3f", result);
//            outputResult.setText(finalAnswer);
//        }
//        else if(inputText == "mm" && outputText == "ft"){
//            result = input / 305;
//            finalAnswer = String.format("%.3f", result);
//            outputResult.setText(finalAnswer);
//        }
//        else if(inputText == "mm" && outputText == "mi"){
//            result = input / 1852000;
//            finalAnswer = String.format("%.3f", result);
//            outputResult.setText(finalAnswer);
//        }
        return finalAnswer;
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, conversionHome.class);
        startActivity(homePage);
    }

//    @Override
//    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
//
//        switch (position) {
//            case 0:
//                // Whatever you want to happen when the first item gets selected
//                break;
//            case 1:
//                // Whatever you want to happen when the second item gets selected
//                break;
//            case 2:
//                // Whatever you want to happen when the thrid item gets selected
//                break;
//
//        }
//    }

}