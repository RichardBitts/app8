package com.example.app8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    RadioButton rb11,rb22,rb33, rb44;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        rb11 = (RadioButton) findViewById(R.id.rb1);
        rb22 = (RadioButton) findViewById(R.id.rb2);
        rb33 = (RadioButton) findViewById(R.id.rb3);
        rb44 = (RadioButton) findViewById(R.id.rb4);

    }
    public void act6(View view){

        if (rb11.isChecked()){
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        } else if (rb22.isChecked()) {
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        } else if (rb33.isChecked()) {
            Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity6.class);
            startActivity(intent);
            finish();
        } else if (rb44.isChecked()) {
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();

        }

        //Intent intent = new Intent(this, MainActivity6.class);
        //startActivity(intent);
    }
}