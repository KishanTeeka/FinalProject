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

    public void convert(View v) {

        inputText = inputUnit.getSelectedItem().toString();
        outputText = outputUnit.getSelectedItem().toString();
        if(inputText.equals("mm") && outputText.equals("cm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 10;
            String outputString = new Double(output).toString();
            outputResult.setText(outputString);
        }


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