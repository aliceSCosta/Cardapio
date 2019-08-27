package com.example.cardpio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cardpio.modelos.Produto;

public class MainActivity extends AppCompatActivity {

    public static final String TÍTULO = "com.example.cardpio.TÍTULO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirBolo(View v){
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TÍTULO,"Bolo");
        startActivity(intent);

    }

    public void abrirCarne(View v){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TÍTULO,"Carne");
        startActivity(intent);
    }

    public void abrirRefrigerante(View v){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TÍTULO,"Refrigerante");
        startActivity(intent);
    }

    public void  abrirTorta(View v){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TÍTULO,"Torta");
        startActivity(intent);
    }
}
