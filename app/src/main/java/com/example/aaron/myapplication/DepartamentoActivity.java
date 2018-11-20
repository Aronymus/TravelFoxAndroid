package com.example.aaron.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aaron.myapplication.DAO.DepartamentoAdaptador;
import com.example.aaron.myapplication.DAO.DepartamentoDAO;
import com.example.aaron.myapplication.Entidad.Departamentos;

import java.util.List;

public class DepartamentoActivity extends AppCompatActivity {

    ListView lvdep;
    List<Departamentos> lista;
    DepartamentoDAO cdao;
    DepartamentoAdaptador adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departamento);

        lvdep = findViewById(R.id.lv1);

        TraerCiudades();

        lvdep.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                MandarEnvio(position);
                return false;
            }
        });
    }

    void MandarEnvio(int posicion) {
        final int pos=posicion;
        Departamentos dep = lista.get(pos);
        Intent i=new Intent(getApplicationContext(),
                DepartamentoActivity.class);
        i.putExtra("img", dep.getIMGDEP()+"");
        i.putExtra("title",dep.getNOMDEP());
        i.putExtra("descripcion", dep.getDESCRIP());

        startActivity(i);
    }

    void TraerCiudades() {
        cdao=new DepartamentoDAO(getApplicationContext());
        lista = cdao.ListadoDepartamentos();
        cdao=null;

        adap=new DepartamentoAdaptador(DepartamentoActivity.this,
                R.layout.item_departamentos,
                lista);

        lvdep.setAdapter(adap);
    }
}
