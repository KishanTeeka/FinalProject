package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class weightConvertor extends AppCompatActivity {

    private Spinner inputUnit, outputUnit;
    private double input, output;
    private EditText outputResult, inputNumber;
    private String finalAnswer, inputText, outputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_convertor);

        outputResult = (EditText) findViewById(R.id.outputET);
        inputNumber = (EditText) findViewById(R.id.inputET);
        // input = Double.parseDouble(inputNumber.toString());

        inputUnit = (Spinner) findViewById(R.id.spinner1);
        outputUnit = (Spinner) findViewById(R.id.spinner2);
    }


    public void convert(View v) {
        inputText = inputUnit.getSelectedItem().toString();
        outputText = outputUnit.getSelectedItem().toString();

        if (inputText.equals("oz") && outputText.equals("oz")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = input;
            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            }

            else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("oz") && outputText.equals("lb")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 16);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("oz") && outputText.equals("US ton")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 32000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("oz") && outputText.equals("mg")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 28349.5);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("oz") && outputText.equals("g")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 28.3495);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("oz") && outputText.equals("kg")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 35.274);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // ounce done


        else if (inputText.equals("lb") && outputText.equals("lb")) {
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

        else if (inputText.equals("lb") && outputText.equals("oz")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 16);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("lb") && outputText.equals("US ton")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 2000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("lb") && outputText.equals("mg")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 453592);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("lb") && outputText.equals("g")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 453.592);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("lb") && outputText.equals("kg")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 0.453592);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // pound done



        else if (inputText.equals("US ton") && outputText.equals("US ton")) {
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

        else if (inputText.equals("US ton") && outputText.equals("lb")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 2000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("US ton") && outputText.equals("oz")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 32000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("US ton") && outputText.equals("mg")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 907185000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("US ton") && outputText.equals("g")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 907185);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("US ton") && outputText.equals("kg")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 907.185);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // US ton done


        else if (inputText.equals("mg") && outputText.equals("mg")) {
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

        else if (inputText.equals("mg") && outputText.equals("lb")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 453592);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("mg") && outputText.equals("US ton")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 907185000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("mg") && outputText.equals("oz")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 28350);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("mg") && outputText.equals("g")) {
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

        else if (inputText.equals("mg") && outputText.equals("kg")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 1000000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // milligram done


        else if (inputText.equals("g") && outputText.equals("g")) {
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

        else if (inputText.equals("g") && outputText.equals("lb")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 454);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("g") && outputText.equals("US ton")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 907185);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("g") && outputText.equals("oz")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 28.35);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("g") && outputText.equals("mg")) {
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

        else if (inputText.equals("g") && outputText.equals("kg")) {
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

        // gram done


        else if (inputText.equals("kg") && outputText.equals("kg")) {
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

        else if (inputText.equals("kg") && outputText.equals("lb")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 2.205);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("kg") && outputText.equals("ton")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input / 907);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("kg") && outputText.equals("oz")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 35.274);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        else if (inputText.equals("kg") && outputText.equals("g")) {
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

        else if (inputText.equals("kg") && outputText.equals("mg")) {
            String inputT = inputNumber.getText().toString();
            input = Double.parseDouble(inputT);
            output = (input * 1000000);

            finalAnswer = output + "";

            if (finalAnswer.length() < 8) {
                outputResult.setText(finalAnswer);
            } else {
                finalAnswer = String.format("%6.3e", output);
                outputResult.setText(finalAnswer);
            }
        }

        // kilogram done
    }
        public void homePage(View v){
        Intent homePage = new Intent(this, conversionHome.class);
        startActivity(homePage);
    }
}