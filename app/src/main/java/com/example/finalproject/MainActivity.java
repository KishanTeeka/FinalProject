package com.example.finalproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BoundDialog.BoundDialogListener {

    private Button btnToggleDark;
    private Button graphingCalculatorID;
    private Button scientificCalculatorID;
    private Button conversionCalculatorID;

    private ArrayList<Equation> equations = new ArrayList<>();
    private ArrayList<Boolean> visibilities = new ArrayList<>();
    private ArrayList<Intent> intents = new ArrayList<>();

    private EquationItemAdapter equationAdapter;

    private int xDomain = 10;
    private int yDomain = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addEquationBtn = findViewById(R.id.addEquationBtn);

        btnToggleDark
                = findViewById(R.id.btnToggleDark);

        graphingCalculatorID = findViewById(R.id.graphingCalculatorID);
        scientificCalculatorID = findViewById(R.id.scientificCalculatorID);
        conversionCalculatorID = findViewById(R.id.conversionCalculatorID);
        // Saving state of our app
        // using SharedPreferences
        SharedPreferences sharedPreferences
                = getSharedPreferences(
                "sharedPrefs", MODE_PRIVATE);
        final SharedPreferences.Editor editor
                = sharedPreferences.edit();
        final boolean isDarkModeOn
                = sharedPreferences
                .getBoolean(
                        "isDarkModeOn", false);
        btnToggleDark.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);
        graphingCalculatorID.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);
        scientificCalculatorID.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);
        conversionCalculatorID.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);

        // When user reopens the app
        // after applying dark/light mode
        if (isDarkModeOn) {
            AppCompatDelegate
                    .setDefaultNightMode(
                            AppCompatDelegate
                                    .MODE_NIGHT_YES);
            btnToggleDark.setText(
                    "Change Color");
        }
        else {
            AppCompatDelegate
                    .setDefaultNightMode(
                            AppCompatDelegate
                                    .MODE_NIGHT_NO);

            btnToggleDark
                    .setText(
                            "Change Color");
        }

        btnToggleDark.setOnClickListener(
                new View.OnClickListener() {

                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view)
                    {
                        // When user taps the enable/disable
                        // dark mode button
                        if (isDarkModeOn) {

                            // if dark mode is on it
                            // will turn it off
                            AppCompatDelegate
                                    .setDefaultNightMode(
                                            AppCompatDelegate
                                                    .MODE_NIGHT_NO);
                            btnToggleDark.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);
                            graphingCalculatorID.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);
                            scientificCalculatorID.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);
                            conversionCalculatorID.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);

                            // it will set isDarkModeOn
                            // boolean to false
                            editor.putBoolean(
                                    "isDarkModeOn", false);
                            editor.apply();

                            // change text of Button
                            btnToggleDark.setText(
                                    "Change Color");
                        }
                        else {

                            // if dark mode is off
                            // it will turn it on
                            AppCompatDelegate
                                    .setDefaultNightMode(
                                            AppCompatDelegate
                                                    .MODE_NIGHT_YES);
                            btnToggleDark.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);
                            graphingCalculatorID.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);
                            scientificCalculatorID.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);
                            conversionCalculatorID.getResources().getDrawable(R.drawable.gradient_drawable_lightmode);

                            // it will set isDarkModeOn
                            // boolean to true
                            editor.putBoolean(
                                    "isDarkModeOn", true);
                            editor.apply();

                            // change text of Button
                            btnToggleDark.setText(
                                    "Change Color");
                        }
                    }
                });

        addEquationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (equations.size() >= 8){
                    Toast.makeText(getApplicationContext(), "Maximum Equation Limit Reached", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(getApplicationContext(), EquationActivity.class);
                    intents.add(intent);
                    startActivityForResult(intent, 1);
                }
            }
        });

    // onCreate ends here


        Button generateGraphsBtn = findViewById(R.id.generateGraphsBtn);
        generateGraphsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (equations.size() == 0){
                    Toast.makeText(getApplicationContext(), "Please add an equation", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(getApplicationContext(), GraphActivity.class);
                    visibilities = equationAdapter.getVisibilities();
                    intent.putExtra("visibilities", booleanListToArray());
                    intent.putParcelableArrayListExtra("equations", equations);
                    intent.putExtra("xNum", xDomain);
                    intent.putExtra("yNum", yDomain);
                    startActivity(intent);
                }
            }
        });

        Button setBoundsBtn = findViewById(R.id.setBoundsBtn);
        setBoundsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        ListView equationListView = findViewById(R.id.equationListView);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                Equation newEquation = new Equation(data.getStringExtra("equation"), data.getDoubleArrayExtra("coefficients"),
                        data.getIntExtra("degree", 1), data.getIntExtra("graphColor", Color.BLACK));
                equations.add(newEquation);
                equationAdapter = new EquationItemAdapter(this, R.layout.equations_listview_details, equations);
                equationListView.setAdapter(equationAdapter);
            }
        }
    }

    private void openDialog(){
        BoundDialog boundDialog = new BoundDialog();
        boundDialog.show(getSupportFragmentManager(), "Bound Dialog");
    }

    private boolean[] booleanListToArray(){
        boolean[] toReturn = new boolean[visibilities.size()];
        for (int i = 0; i < toReturn.length; i++){
            toReturn[i] = visibilities.get(i);
        }
        return toReturn;
    }

    @Override
    public void applyXBound(int xBound){
        final TextView xDomainTextView = findViewById(R.id.xDomainTextView);
        xDomain = xBound;
        String xText = "x: [" + -xBound + ", " + xBound + "]";
        xDomainTextView.setText(xText);
    }

    @Override
    public void applyYBound(int yBound){
        final TextView yDomainTextView = findViewById(R.id.yDomainTextView);
        xDomain = yBound;
        String xText = "x: [" + -yBound + ", " + yBound + "]";
        yDomainTextView.setText(xText);
    }

    public void conversionPage(View v) {
        Intent MoveConversionHome = new Intent(this, conversionHome.class);
        startActivity(MoveConversionHome);
    }

    public void scientificPage(View v) {
        Intent MoveScientificHome = new Intent(this, scientificCalculator.class);
        startActivity(MoveScientificHome);
    }

    public void graphingPage(View v) {
        Intent MoveGraphingHome = new Intent(this, graphingCalculator.class);
        startActivity(MoveGraphingHome);
    }
}