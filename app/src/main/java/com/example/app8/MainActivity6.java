package com.example.app8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        new Handler().postDelayed(new Runnable(){
        @Override
                public void run(){
            Intent intent = new Intent(getApplicationContext(), MainActivity7.class);
            startActivity(intent);
            finish();
                }
        }, 5000);
    }
}