package com.example.layout02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int nClicks = 0;
    private TextView txt_contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_contador = findViewById(R.id.txt_contador);
        txt_contador.setText(Integer.toString(nClicks));
    }

    public void mostrarTostada(View view){
        Toast.makeText(this,"Prueba de una tostada", Toast.LENGTH_LONG).show();
    }

    public void contador(View view){
        nClicks++;
        txt_contador.setText(Integer.toString(nClicks));
    }

    public void reset(View view){
        nClicks = 0;
        txt_contador.setText(Integer.toString(nClicks));
    }

    public void reducir(View view){
        nClicks--;
        txt_contador.setText(Integer.toString(nClicks));
    }
}