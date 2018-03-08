package com.example.ny.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NY on 7.03.2018.
 */

public class veriKaynagi {

    SQLiteDatabase db;

    sqlite_katmani bdb;
    public veriKaynagi(Context c){

        bdb=new sqlite_katmani(c);
    }
    public void ac(){
        db=bdb.getWritableDatabase();

    }

    public  void kapa(){
    bdb.close();
    }

    public void kullaniciOlustur(kullanici k){
       // String isim="ali demir";
        //kullanici k=new kullanici();
        //k.setIsim(isim);
        ContentValues val=new ContentValues(); //veri tabanına veri eklemek için

        val.put("isim",k.getIsim());
        db.insert("kullanici",null,val);


    }
    public List<kullanici>listele(){

        String kolonlar []={"id","isim"};
        //iterater gibi satır satır bakıyor.

    List<kullanici> liste=new ArrayList<kullanici>();
        Cursor cursor=db.query("kullanici",kolonlar,null,null,null,null,null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
          int id= cursor.getInt(0);
            String isim= cursor.getString(1);
            String eleman=""+id+"-"+isim;

            kullanici k=new kullanici(isim,id);

            liste.add(k);
            cursor.moveToNext();
        }
        return liste;

    }

    public void kullaniciSil(kullanici k){
        int id=k.getId();
        db.delete("kullanici","id="+id,null);

    }

}
