package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class volumeConvertor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_convertor);
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, conversionHome.class);
        startActivity(homePage);
    }
}