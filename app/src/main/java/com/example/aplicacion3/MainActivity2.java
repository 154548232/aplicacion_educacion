package com.example.aplicacion3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText nombreEditText,emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void enviarformulario(View view) {
        nombreEditText = (EditText) findViewById(R.id.nombreEditText);
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        String nombreValue = nombreEditText.getText().toString();
        String emailValue = emailEditText.getText().toString();
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("nombre", nombreValue);
        intent.putExtra("email", emailValue);
        startActivity(intent);
    }
}
