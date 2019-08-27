package com.example.cardpio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cardpio.modelos.Produto;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {

    private TextView textView;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private LinearLayout linearLayout;
    private ImageView imageViewCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TÍTULO);

        textView = findViewById(R.id.text_view_produto);
        textView.setText(titulo);

        linearLayout = findViewById(R.id.layout);
        imageViewCategoria = findViewById(R.id.image_view_categoria);

        criarProdutos(titulo);
        listarProdutos();
    }

    public void criarProdutos(String titulo){
        if (titulo.equals("Bolo")){
            imageViewCategoria.setImageResource(R.drawable.bolo);
            produtos.add(new Produto("Bolo de chocolate",
                    5.00,
                    "Bolo",
                    "Bolo de chocolate e granulado"));

        }
        else if(titulo.equals("Carne")){
            imageViewCategoria.setImageResource(R.drawable.carne);
            produtos.add((new Produto("Carne cozida",
                    10.00,
                    "Carne",
                    "Carne cozida com legumes")));

        }
        else if(titulo.equals("Refrigerante")){
            imageViewCategoria.setImageResource(R.drawable.refrigerante);
            produtos.add(new Produto("Dolly",
                    3.00,
                    "Refrigerante",
                    "Dolly guaraná"));

        }
        else if (titulo.equals("Torta")){
            imageViewCategoria.setImageResource(R.drawable.torta);
            produtos.add(new Produto("Torta de frango",
                    8.00,
                    "Torta",
                    "Torta de frango com massa de creme de leite"));

        }


    }

    public void listarProdutos(){

        for (int i=0; i<produtos.size(); i++){
            TextView textVieNome = new TextView(this);
            TextView textViewPreco = new TextView(this);

            textVieNome.setText(produtos.get(i).getNome());
            textViewPreco.setTextSize(18);

            textViewPreco.setText(produtos.get(i).getPreco().toString());

            linearLayout.addView(textVieNome);
            linearLayout.addView(textViewPreco);
        }


    }
}
