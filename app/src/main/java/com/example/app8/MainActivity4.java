package com.example.app8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    CheckBox cb11,cb22,cb33,cb44;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        cb11 = (CheckBox) findViewById(R.id.cb1);
        cb22 = (CheckBox) findViewById(R.id.cb2);
        cb33 = (CheckBox) findViewById(R.id.cb3);
        cb44 = (CheckBox) findViewById(R.id.cb4);

    }

    public void act5(View view){

        if (cb11.isChecked()){
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked()) {
            Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity5.class);
            startActivity(intent);
            finish();
        }else if (cb33.isChecked()) {
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        }else if (cb44.isChecked()) {
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        }

        //Intent intent = new Intent(this, MainActivity5.class);
        //startActivity(intent);
    }

}