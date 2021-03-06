package com.zarkaoui.digitalsou9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimationView);
        lottieAnimationView.animate().translationX(-1500).setDuration(2000).setStartDelay(2500);

        TextView splashText = findViewById(R.id.splashText);
        splashText.animate().translationX(1000).setDuration(1000).setStartDelay(2500);

        Thread thread = new Thread() {

            public void run(){
                try{
                    Thread.sleep(4000);
                } catch (Exception e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, WelcomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        thread.start();
    }
}