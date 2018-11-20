package com.example.aaron.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CiudadesActivity extends AppCompatActivity {

    TextView tvnombre, tvdescripcion, tvplatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Detalledepartamento);

        tvnombre=findViewById(R.id.tvNom);
        tvdescripcion=findViewById(R.id.tvDes);
        tvplatos=findViewById(R.id.tvPlatos);

        ListarCiudad();
    }

    void ListarCiudad() {
        Intent x=getIntent();

        tvnombre.setText(x.getStringExtra("title"));
        tvdescripcion.setText(x.getStringExtra("descripcion"));
        tvplatos.setText(x.getStringExtra("platos"));
    }
}
