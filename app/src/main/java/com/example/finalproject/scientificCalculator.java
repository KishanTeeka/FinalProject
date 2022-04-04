package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.view.View;

public class scientificCalculator extends AppCompatActivity {

    double cosConversion;
    double sinConversion;
    double tanConversion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);

        Switch conversionSwitch = (Switch) findViewById(R.id.switch1);
        Boolean switchState = conversionSwitch.isChecked();
        enterButton = (Button)findViewById(R.id.enter);

        EditText radians1 = (EditText) findViewById(R.id.scientificInput1);
        double newRadians1 = Double.parseDouble(radians1.getText().toString());

        double oldRadians1 = Double.parseDouble(radians1.getText().toString());
        double toDegree = Math.toDegrees(oldRadians1);

        Button sinButton = findViewById(R.id.sine);
        Button cosButton = findViewById(R.id.cosine);
        Button tanButton = findViewById(R.id.tangent);
    }


    Button enterButton;

    public void solveScientific(EditText scientificInput1, EditText scientificInput2) {
        Switch conversionSwitch = (Switch) findViewById(R.id.switch1);
        Boolean switchState = conversionSwitch.isChecked();
        enterButton = (Button)findViewById(R.id.enter);

        EditText radians1 = (EditText) findViewById(R.id.scientificInput1);
        double newRadians1 = Double.parseDouble(radians1.getText().toString());

        double oldRadians1 = Double.parseDouble(radians1.getText().toString());
        double toDegree = Math.toDegrees(oldRadians1);

        Button sinButton = findViewById(R.id.sine);
        Button cosButton = findViewById(R.id.cosine);
        Button tanButton = findViewById(R.id.tangent);

        public void onClick(View v)
        {
            double toRadians = Math.toRadians(newRadians1);
        }



        if(switchState == false) { //radian format

            if(sinButton.setOnClickListener(View v)){ // sin
                double toRadians = Math.toRadians(newRadians1);

            }
            else if () { // cos
            }

            else if () { // tan
                tanConversion = sinConversion / cosConversion;
            }


            System.out.println("Radians " + radians1 + " in degrees  = " + toDegree); // need to print the answer in

            // Converts an angle measured in radians to an
            // approximately equivalent angle measured in
            // degrees.
            double toDegree = Math.toDegrees(newRadians1);

            // Converts an angle measured in degrees to an
            // approximately equivalent angle measured in
            // radians.

            System.out.println("Degrees " + degrees + " in radians = " + toRadians);
        }
        else { // degree format

            EditText radians1 = (EditText) findViewById(R.id.scientificInput1);
            double oldRadians1 = Double.parseDouble(radians1.getText().toString());
            double toDegree = Math.toDegrees(oldRadians1);
        }
    }
}


    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
}