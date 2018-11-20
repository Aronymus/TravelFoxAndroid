package com.example.aaron.myapplication.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.aaron.myapplication.Entidad.Departamentos;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoDAO {

    DepartamentoHelper helper;
    SQLiteDatabase db;

    public DepartamentoDAO(Context contexto)
    {
        helper = new DepartamentoHelper(contexto);
    }

    private void LeerBD()
    {
        db = helper.getReadableDatabase();
    }
    private void CerrarBD()
    {
        db.close();
    }

    public List<Departamentos> ListadoDepartamentos()
    {
        List<Departamentos> lista=new ArrayList<Departamentos>();

        LeerBD();

        Cursor c = db.rawQuery("select * from DEPARTAMENTOS", null);

        if (c.getCount()>0)
        {
            while (c.moveToNext())
            {
                Departamentos ci=new Departamentos(
                        c.getInt(0),
                        c.getString(1),
                        c.getString(2),
                        c.getInt(3)
                );

                lista.add(ci);
            }
        }
        c.close();

        CerrarBD();

        return lista;
    }
}
