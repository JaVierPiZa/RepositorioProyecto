package com.example.r;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Receta extends AppCompatActivity {
    private TextView txtingredientes;
    private TextView txtPreparacion;
    private Button btnRegresar;
    private String es;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);
        txtingredientes = (TextView) findViewById(R.id.ingredientes);
        txtPreparacion = (TextView) findViewById(R.id.preparacion);
        btnRegresar = (Button)findViewById(R.id.regresar);

        String receta = getIntent().getStringExtra("ingredientes");
        txtingredientes.setText("Ingredientes\n" +receta);
        String preparacion = getIntent().getStringExtra("preparacion");
        txtPreparacion.setText("Preparacion\n"+preparacion );
        es = getIntent().getStringExtra("es");
    }

    public void btnRegresar(View view){
        if(es.equals("Almuerzo")){
            Intent back = new Intent(Receta.this,Almuerzos.class);
            startActivity(back);
        }else if(es.equals("Ensalada")){
            Intent back = new Intent(Receta.this,Ensaladas.class);
            startActivity(back);
        }else if(es.equals("Postre")){
            Intent back = new Intent(Receta.this,Postres.class);
            startActivity(back);
        }else if(es.equals("Pendiente")){}


    }

}