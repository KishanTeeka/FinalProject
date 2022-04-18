package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class lengthConvertor extends AppCompatActivity {

    private Spinner spinner1, spinner2;
    private Button btnSubmit;
    private Spinner inputUnit, outputUnit;
    private double input, output,result;
    private EditText outputResult, inputNumber;
    private String finalAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_convertor);
    }

    public void convert(View v) {
        inputUnit = findViewById(R.id.spinner1);
        outputUnit = findViewById(R.id.spinner2);

        inputNumber = (EditText) findViewById(R.id.input);
        outputResult = (EditText) findViewById(R.id.outputresult);
        double input = Double.parseDouble(inputNumber.toString());

        String inputText = inputUnit.getSelectedItem().toString();
        String outputText = outputUnit.getSelectedItem().toString();

        if(inputText.equals("mm")){
           if(outputText.equals("cm")) {
               result = input * 10;
               finalAnswer = String.format("%.3f", result);
               outputResult.setText(finalAnswer);
           }
        }
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