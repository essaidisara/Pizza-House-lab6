package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle essBundle) {
        super.onCreate(essBundle);
        setContentView(R.layout.activity_splash);

        Thread essThreadSplash = new Thread(() -> {
            try {
                Thread.sleep(1800);
            } catch (InterruptedException ignored) {
            }

            startActivity(new Intent(SplashActivity.this, ListPizzaActivity.class));
            finish();
        });

        essThreadSplash.start();
    }
}