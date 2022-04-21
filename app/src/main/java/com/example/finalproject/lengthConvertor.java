package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;


public class lengthConvertor extends AppCompatActivity {


    private Spinner inputUnit, outputUnit;
    private double input, output;
    private EditText outputResult, inputNumber;
    private String finalAnswer, inputText, outputText;

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
        if(inputText.equals("mm") && outputText.equals("mm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mm") && outputText.equals("cm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 10;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mm") && outputText.equals("m")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 1000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mm") && outputText.equals("km")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 1000000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mm") && outputText.equals("in")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 25.4;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mm") && outputText.equals("ft")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 304.8;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mm") && outputText.equals("mi")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 1609000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }


        // mm done


        else if(inputText.equals("cm") && outputText.equals("mm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 10;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("cm") && outputText.equals("cm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("cm") && outputText.equals("m")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 100;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("cm") && outputText.equals("km")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 10000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("cm") && outputText.equals("in")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 2.54;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("cm") && outputText.equals("ft")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 30.48;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("cm") && outputText.equals("mi")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 160900;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }


        // cm done


        else if(inputText.equals("m") && outputText.equals("mm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 1000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("m") && outputText.equals("cm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 100;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("m") && outputText.equals("m")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("m") && outputText.equals("km")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 1000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("m") && outputText.equals("in")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 39.37;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("m") && outputText.equals("ft")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 3.281;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("m") && outputText.equals("mi")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 1609;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }


        // m done


        else if(inputText.equals("km") && outputText.equals("mm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 1000000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("km") && outputText.equals("cm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 100000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("km") && outputText.equals("m")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 1000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("km") && outputText.equals("km")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("km") && outputText.equals("in")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 39370;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("km") && outputText.equals("ft")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 3280.84;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("km") && outputText.equals("mi")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 1.609;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }


        // km done


        else if(inputText.equals("in") && outputText.equals("in")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("in") && outputText.equals("ft")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 12;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("in") && outputText.equals("mi")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 63360;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("in") && outputText.equals("mm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 25.4;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("in") && outputText.equals("cm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 2.54;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("in") && outputText.equals("m")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 39.37;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("in") && outputText.equals("km")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 39370;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        // in done

        else if(inputText.equals("ft") && outputText.equals("in")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 12;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("ft") && outputText.equals("ft")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("ft") && outputText.equals("mi")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 5280;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("ft") && outputText.equals("mm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 305;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("ft") && outputText.equals("cm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 30.48;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("ft") && outputText.equals("m")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 3.281;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("ft") && outputText.equals("km")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input / 3281;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        // ft done

        else if(inputText.equals("mi") && outputText.equals("in")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 63360;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mi") && outputText.equals("ft")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 5280;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mi") && outputText.equals("mi")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mi") && outputText.equals("mm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 1609000;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mi") && outputText.equals("cm")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 160934;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mi") && outputText.equals("m")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 1609;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }

        else if(inputText.equals("mi") && outputText.equals("km")){
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input * 1.609;
            finalAnswer = String.format("%6.3e", output);
            outputResult.setText(finalAnswer);
        }
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, conversionHome.class);
        startActivity(homePage);
    }
}