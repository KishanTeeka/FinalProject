package com.example.finalproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

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






    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
//        super.onActivityResult(requestCode, resultCode, data);
//        ListView equationListView = findViewById(R.id.equationListView);
//        if (requestCode == 1){
//            if (resultCode == RESULT_OK){
//                Equation newEquation = new Equation(data.getStringExtra("equation"), data.getDoubleArrayExtra("coefficients"),
//                        data.getIntExtra("degree", 1), data.getIntExtra("graphColor", Color.BLACK));
//                equations.add(newEquation);
//                equationAdapter = new EquationItemAdapter(this, R.layout.equations_listview_details, equations);
//                equationListView.setAdapter(equationAdapter);
//            }
//        }
//    }
//
//    private void openDialog(){
//        BoundDialog boundDialog = new BoundDialog();
//        boundDialog.show(getSupportFragmentManager(), "Bound Dialog");
//    }
//
//    private boolean[] booleanListToArray(){
//        boolean[] toReturn = new boolean[visibilities.size()];
//        for (int i = 0; i < toReturn.length; i++){
//            toReturn[i] = visibilities.get(i);
//        }
//        return toReturn;
//    }
//

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