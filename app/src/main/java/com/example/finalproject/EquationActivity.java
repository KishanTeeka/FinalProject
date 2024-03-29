package com.example.finalproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EquationActivity extends AppCompatActivity {

    private TextView[][] equationViews;
    private double[] coefficients = new double[6];
    private int graphColor = Color.rgb(255, 0, 0);
    private Button cancelBtn;
    private Button submitBtn;
    private int degrees = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation);

        equationsViewsSetUp();

        final TextView degreeTextEdit = findViewById(R.id.degreeTextEdit);
        degreeTextEdit.setText("1");

        final TextView equationTextView = findViewById(R.id.baseEquationTextView);
        equationTextView.setText(generateEquation(1));

        setViewVisibility();

        final SeekBar degreeSeekBar = findViewById(R.id.degreeSeekBar);
        degreeSeekBar.setProgress(1);
        degreeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                degrees = i;
                degreeTextEdit.setText(i + "");
                equationTextView.setText(generateEquation(i));
                setCoefficients();
                setViewVisibility();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        cancelBtn = findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setCoefficients();
                intent.putExtra("equation", "");
                intent.putExtra("coefficients", coefficients);
                intent.putExtra("graphColor", graphColor);
                intent.putExtra("degree", Integer.parseInt(degreeTextEdit.getText().toString()));
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }


    private void setCoefficients(){
        for (int i = coefficients.length - 1; i >= 0; i--){
            if (i <= degrees){
                try{
                    double coefficient = Double.parseDouble(equationViews[i][0].getText().toString());
                    if (coefficient >= 99999){
                        coefficient = 99999;
                    }
                    coefficients[i] = coefficient;
                }
                catch(Exception e){
                    coefficients[i] = 0;
                }
            }
            else{
                coefficients[i] = 0;
            }

        }
    }

    private void setViewVisibility(){
        for (int i = 0; i < equationViews.length; i++){
            if (i <= degrees){
                for (TextView view: equationViews[i]){
                    view.setVisibility(View.VISIBLE);
                }
            }
            else{
                for (TextView view: equationViews[i]){
                    view.setVisibility(View.GONE);
                }
            }
        }
    }

    private void equationsViewsSetUp(){
        TextView aTextEdit = findViewById(R.id.aTextEdit);
        TextView bTextEdit = findViewById(R.id.bTextEdit);
        TextView cTextEdit = findViewById(R.id.cTextEdit);
        TextView dTextEdit = findViewById(R.id.dTextEdit);
        TextView eTextEdit = findViewById(R.id.eTextEdit);
        TextView fTextEdit = findViewById(R.id.fTextEdit);

        TextView aTextView = findViewById(R.id.aTextView);
        TextView bTextView = findViewById(R.id.bTextView);
        TextView cTextView = findViewById(R.id.cTextView);
        TextView dTextView = findViewById(R.id.dTextView);
        TextView eTextView = findViewById(R.id.eTextView);
        TextView fTextView = findViewById(R.id.fTextView);

        equationViews = new TextView[][]{{aTextEdit, aTextView}, {bTextEdit, bTextView}, {cTextEdit, cTextView}, {dTextEdit, dTextView}, {eTextEdit, eTextView}, {fTextEdit, fTextView}};
    }

    private String generateEquation(int degree){
        String str = "y = ";
        for (int i = degree; i >=2; i--){
            char letter = (char) (97 + (degree - i));
            str += letter + "x^" + i + " + ";
        }

        if (degree >= 1){
            str += (char) (97 + degree - 1) + "x + ";
        }

        if (degree >= 0){
            str += (char) (97 + degree);
        }

        return str.trim();
    }
}