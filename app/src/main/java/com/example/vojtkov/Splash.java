package com.example.vojtkov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Onboarding1.class);
                startActivity(intent);
            }
        }, 3000);

    }
    public void onClick(View v){
        Intent intent = new Intent(this, Onboarding1.class);
        startActivity(intent);
    }
}