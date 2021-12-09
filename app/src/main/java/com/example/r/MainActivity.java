package com.example.r;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnEnsalada;
    private Button btnAlmuerzo;
    private Button btnPostre;
    private Button btn;
    private Button btnSql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnsalada=(Button) findViewById(R.id.btnEnsalada);
        btnAlmuerzo=(Button) findViewById(R.id.btnAlmuerzo);
        btnPostre =(Button) findViewById(R.id.button5);
        btnSql =(Button) findViewById(R.id.btnsql);

        btnEnsalada.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent innt = new Intent(MainActivity.this,Ensaladas.class);
        startActivity(innt);
    }
    public void btnAlmuerzo(View view){
        Intent A = new Intent(MainActivity.this,Almuerzos.class);
        startActivity(A);
    }
    public void btnPostre(View view){
        Intent P = new Intent(MainActivity.this,Postres.class);
        startActivity(P);
    }
    public void Sensro(View view){
        Intent S = new Intent(MainActivity.this, Sensor.class);
        startActivity(S);
    }
    public void FireBase(View view){
        Intent j = new Intent(MainActivity.this,Firebase.class);
        startActivity(j);
    }
}