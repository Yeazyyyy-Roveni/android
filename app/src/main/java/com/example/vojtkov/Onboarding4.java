package com.example.vojtkov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding4);
    }
    public void onClick(View v){
        Intent intent = new Intent(this, Onboarding3.class);
        startActivity(intent);
    }
    public void onClick1(View v){
        Intent intent = new Intent(this, Onboarding1.class);
        startActivity(intent);
    }
}