package com.example.app8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void act4(View view){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
        finish();
    }
    public void x2(View view){
        Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
    }
    public void cosx(View view){
        Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
    }
    public void x(View view){
        Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
    }
    public void tanx(View view){
        Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
    }
}