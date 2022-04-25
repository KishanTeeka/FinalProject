package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class volumeConvertor extends AppCompatActivity {

    private Spinner inputUnit, outputUnit;
    private double input, output;
    private EditText outputResult, inputNumber;
    private String finalAnswer, inputText, outputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_convertor);

        outputResult = (EditText) findViewById(R.id.outputET);
        inputNumber = (EditText) findViewById(R.id.inputET);
        // input = Double.parseDouble(inputNumber.toString());

        inputUnit = (Spinner) findViewById(R.id.spinner1);
        outputUnit = (Spinner) findViewById(R.id.spinner2);
    }

    public void convert(View v) {
        inputText = inputUnit.getSelectedItem().toString();
        outputText = outputUnit.getSelectedItem().toString();

        if (inputText.equals("ml") && outputText.equals("ml")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("ml") && outputText.equals("liter")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 1000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("ml") && outputText.equals("cup")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 240);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("ml") && outputText.equals("pint")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 473);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("ml") && outputText.equals("quart")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 946);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("ml") && outputText.equals("gallon")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 3785);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // milliliter done

        else if (inputText.equals("liter") && outputText.equals("liter")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("liter") && outputText.equals("ml")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 1000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("liter") && outputText.equals("cup")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 4.167);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("liter") && outputText.equals("pint")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 2.113);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("liter") && outputText.equals("quart")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 1.057);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("liter") && outputText.equals("gallon")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 3.785);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // liter done


        else if (inputText.equals("cup") && outputText.equals("cup")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("cup") && outputText.equals("ml")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 240);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("cup") && outputText.equals("liter")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 0.24);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("cup") && outputText.equals("pint")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 1.972);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("cup") && outputText.equals("quart")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 3.943);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("cup") && outputText.equals("gallon")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 15.773);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // cup done


        else if (inputText.equals("pint") && outputText.equals("pint")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("pint") && outputText.equals("ml")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 473.176);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("pint") && outputText.equals("liter")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 0.473176);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("pint") && outputText.equals("cup")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 1.97157);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("pint") && outputText.equals("quart")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 2);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("pint") && outputText.equals("gallon")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 8);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // pint done


        else if (inputText.equals("quart") && outputText.equals("quart")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("quart") && outputText.equals("ml")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 946.353);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("quart") && outputText.equals("liter")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 0.946353);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("quart") && outputText.equals("cup")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 3.94314);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("quart") && outputText.equals("pint")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 2);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("quart") && outputText.equals("gallon")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 4);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // quart done


        else if (inputText.equals("gallon") && outputText.equals("gallon")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("gallon") && outputText.equals("ml")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 3785.41);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("gallon") && outputText.equals("liter")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 3.78541);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("gallon") && outputText.equals("cup")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 15.7725);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("gallon") && outputText.equals("pint")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 8);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("gallon") && outputText.equals("quart")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 4);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // gallon done
    }

        public void homePage (View v){
            Intent homePage = new Intent(this, conversionHome.class);
            startActivity(homePage);
        }
}