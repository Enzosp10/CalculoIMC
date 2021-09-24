package com.example.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnAceptar;
    private EditText eTpeso,eTAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       final Context context = getApplicationContext();
       btnAceptar = (Button)  findViewById(R.id.btnAceptar);
       eTpeso = (EditText) findViewById(R.id.eTpeso);
       eTAltura = (EditText) findViewById(R.id.eTAltura);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //resultado = peso/(altura*altura)
               Toast.makeText(context, "Click en el Boton Aceptar ", Toast.LENGTH_SHORT).show();
           }
       });

    }
}