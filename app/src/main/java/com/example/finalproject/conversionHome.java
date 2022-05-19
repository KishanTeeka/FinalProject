package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class conversionHome extends AppCompatActivity {

    //hello
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_home);
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }

    public void lengthConvertor(View v) {
        Intent moveLength = new Intent(this, lengthConvertor.class);
        startActivity(moveLength);
    }

    public void volumeConvertor(View v) {
        Intent moveVolume = new Intent(this, volumeConvertor.class);
        startActivity(moveVolume);
    }
    public void weightConvertor(View v) {
        Intent moveWeight = new Intent(this, weightConvertor.class);
        startActivity(moveWeight);
    }

    public void tempConvertor(View v) {
        Intent moveTemp = new Intent(this, tempConvertor.class);
        startActivity(moveTemp);
    }

}