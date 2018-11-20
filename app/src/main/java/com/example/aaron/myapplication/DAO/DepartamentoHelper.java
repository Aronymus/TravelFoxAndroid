package com.example.aaron.myapplication.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DepartamentoHelper extends SQLiteOpenHelper {
    String cad="create table DEPARTAMENTOS(CODDEP int primary key, "+
            "NOMDEP varchar(25), DESCRIP varchar(100), IMGDEP INT);";

    public DepartamentoHelper(Context context) {
        super(context, "BDTRAVEL", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(cad);
        db.execSQL("insert into DEPARTAMENTOS values(1001,'ICA','Es una ciudad ubicada en el centro del sur de Perú.',1);");
        db.execSQL("insert into DEPARTAMENTOS values(1002,'CAÑETE','Es una ciudad situada en la provincia..',2);");
        db.execSQL("insert into DEPARTAMENTOS values(1003,'CUZCO','Es la capital de la región de Lambayeque.',3);");
        db.execSQL("insert into DEPARTAMENTOS values(1002,'CAÑETE','Es una ciudad situada en la provincia.',4);");
        db.execSQL("insert into DEPARTAMENTOS values(1001,'ICA','Es una ciudad ubicada en el centro del sur de Perú.',5);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists BDTRAVEL");
        //onCreate(db);
        db.execSQL(cad);
    }
}
