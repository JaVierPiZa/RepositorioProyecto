package com.example.r;

import android.database.sqlite.SQLiteDatabase;

import android.content.Context;
public class Modelo {

    public SQLiteDatabase getConn(Context context){
        SQL conn = new SQL(context, "dbusuarios", null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        return db;
    }

    int insertaReceta(Context context, RecetasDTO dto){
        int res = 0;
        String sql = "INSERT INTO recetas(id ,nombre, tipo, ingredientes) VALUES('"+dto.getId()+"','"+dto.getNombrereceta()+"''"+dto.getTipo()+"''"+dto.getIngredientes()+"')";
        SQLiteDatabase db = this.getConn(context);
        try{
            db.execSQL(sql);

        }catch(Exception e){

        }
        return res;


    }
}
