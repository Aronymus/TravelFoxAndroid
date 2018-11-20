package com.example.aaron.myapplication.DAO;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aaron.myapplication.Entidad.Departamentos;
import com.example.aaron.myapplication.R;

import java.util.List;

public class DepartamentoAdaptador extends ArrayAdapter<Departamentos> {
    Context micontexto;
    int milayout;
    List<Departamentos> milista;

    public DepartamentoAdaptador(@NonNull Context contexto,
                           int layout,
                           @NonNull List<Departamentos> lista) {
        super(contexto, layout, lista);

        micontexto=contexto;
        milayout=layout;
        milista=lista;
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View mivista, @NonNull ViewGroup parent) {

        LayoutInflater infla=LayoutInflater.from(micontexto);

        mivista = infla.inflate(milayout, null);

        Departamentos c=milista.get(position);

        ImageView img = mivista.findViewById(R.id.IMGDEP);
        TextView tvtitle, tvdescripcion;
        tvtitle = mivista.findViewById(R.id.TVTITULO);
        tvdescripcion = mivista.findViewById(R.id.TVDESCRIP);

        tvtitle.setText(c.getNOMDEP());
        tvdescripcion.setText(c.getDESCRIP());

        img.setImageResource(getImagen(c.getIMGDEP()));

        return mivista;
    }

    int getImagen(int codigo)
    {
        String recurso="drawable";
        String paquete=micontexto.getPackageName();
        String nombre="paisaje"+codigo;

        int devolver =
                micontexto.getResources().getIdentifier(nombre,recurso,paquete);

        return devolver;
    }
}
