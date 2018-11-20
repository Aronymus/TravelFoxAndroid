package com.example.aaron.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalledepartamentoActivity extends AppCompatActivity {

    TextView tvnombre, tvdescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalledepartamento);

        tvnombre=findViewById(R.id.tvNom);
        tvdescripcion=findViewById(R.id.tvDes);

        ListarDepartamento();
    }

    void ListarDepartamento() {
        Intent x=getIntent();

        tvnombre.setText(x.getStringExtra("title"));
        tvdescripcion.setText(x.getStringExtra("descripcion"));
    }
}
