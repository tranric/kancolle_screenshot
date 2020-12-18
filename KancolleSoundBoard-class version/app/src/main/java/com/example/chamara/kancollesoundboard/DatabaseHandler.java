package com.example.chamara.kancollesoundboard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "KancolleSoundboard";
    private static final String TABLE = "NameHolder";
    private static final String KEY_NAME = "name";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE + "("
                + KEY_NAME + " TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE);

        onCreate(db);
    }

    public void addName (DatabaseHandler dh ,String Name) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, Name);
        db.insert(TABLE, null, values);
        db.close();
    }


    public Cursor getName(DatabaseHandler dh) {
        SQLiteDatabase db = dh.getReadableDatabase();
        String[] coloumns = {KEY_NAME};
        Cursor CR = db.query(TABLE, coloumns, null,null,null,null,null);

        return CR;
    }



}