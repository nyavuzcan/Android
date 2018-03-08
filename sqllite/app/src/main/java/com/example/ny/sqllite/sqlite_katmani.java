package com.example.ny.sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by NY on 7.03.2018.
 */

public class sqlite_katmani extends SQLiteOpenHelper {

    public sqlite_katmani(Context c){
        super(c,"kullanici",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            String sql=" create table kullanici ( id integer primary key autoincrement isim"
        +" isim text not null)";

            sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists kullanici");
    }
}
