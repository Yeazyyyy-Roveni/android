package com.example.vojtkov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding3);
    }
    public void onClick1(View v){
        Intent intent = new Intent(this, Onboarding4.class);
        startActivity(intent);
    }
    public void onClick(View v){
        Intent intent = new Intent(this, EmailActivity.class);
        startActivity(intent);
    }
}