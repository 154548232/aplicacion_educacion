package com.example.aplicacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView nombre = (TextView) findViewById(R.id.textViewNombre);
        TextView email = (TextView) findViewById(R.id.textViewEmail);
        Intent intent = getIntent();
        String nombreValue = intent.getStringExtra("nombre");
        String emailValue = intent.getStringExtra("email");
        nombre.setText(nombreValue);
        email.setText(emailValue);
    }
}