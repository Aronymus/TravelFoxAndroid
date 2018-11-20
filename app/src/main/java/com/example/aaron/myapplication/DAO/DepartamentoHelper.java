package com.example.aaron.myapplication.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DepartamentoHelper extends SQLiteOpenHelper {
    String cad="create table DEPARTAMENTOS(CODDEP int primary key, "+
            "NOMCIU varchar(25), DESCRIP varchar(100), PLATOS varchar(100), IMGCIU INT);";

    public DepartamentoHelper(Context context) {
        super(context, "BDPERU", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(cad);
        db.execSQL("insert into DEPARTAMENTOS values(1001,'AYACUCHO','Es una ciudad ubicada en el centro del sur de Perú.','Puca picante, Patasca o sopa de mondongo, Picante de quinua.',1);");
        db.execSQL("insert into DEPARTAMENTOS values(1002,'CALLAO','Es una ciudad situada en la provincia constitucional del Callao.','Cebiche, Leche de tigre, Parihuela.',2);");
        db.execSQL("insert into DEPARTAMENTOS values(1003,'CHICLAYO','Es la capital de la región de Lambayeque.','Cabrito a la norteña, Tortilla de raya.',3);");
        db.execSQL("insert into DEPARTAMENTOS values(1004,'MOYOBAMBA','Es la capital de la provincia de San Martín.','Juanes, Inchicapi, Timbuche.',4);");
        db.execSQL("insert into DEPARTAMENTOS values(1005,'TACNA','Ciudad del sur de Perú.','Picante a la tacneña, Cordero a la parrilla.',5);");
        db.execSQL("insert into DEPARTAMENTOS values(1006,'TRUJILLO','Ciudad del noroeste de Perú.','Cebiche, Cabrito con frijoles.',6);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists BDTRAVEL");
        //onCreate(db);
        db.execSQL(cad);
    }
}
