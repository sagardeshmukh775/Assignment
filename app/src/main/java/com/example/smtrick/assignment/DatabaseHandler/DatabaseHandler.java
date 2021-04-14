package com.example.smtrick.assignment.DatabaseHandler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.smtrick.assignment.Models.Data1;

import java.util.ArrayList;

/**
 * Created by padcc on 29/09/2018.
 */

public class DatabaseHandler extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "UserDB";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    private static final String TABLE_VISITORS = "visitors";

    // User Table Columns names

    private static final String KEY_VISITOR_FIRSTNAME = "user_name";

    private static final String KEY_VILLAGE = "village";
    private static final String KEY_ROUT= "rout";


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String CREATE_VISITOR_TABLE = "CREATE TABLE " + TABLE_VISITORS + "("
                + KEY_VISITOR_FIRSTNAME + " TEXT,"
                + KEY_VILLAGE + " TEXT,"
                + KEY_ROUT + " TEXT"+")";
        sqLiteDatabase.execSQL(CREATE_VISITOR_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Long insertUser (Data1 data1) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(KEY_VISITOR_FIRSTNAME, data1.getFName());
        contentValues.put(KEY_VILLAGE,data1.getVillageName());
        contentValues.put(KEY_ROUT,data1.getRouteName());



        Long result= db.insert(TABLE_VISITORS, null, contentValues);
        return result;
    }

    public void deleteUser(){

        SQLiteDatabase db = this.getWritableDatabase();
       // db.execSQL("delete from "+ TABLE_VISITORS+ " WHERE "+KEY_VISITOR_ID+"='"+ visitor.getVisitorId());
    }


    public int UpdateUser (Data1 data1) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();


        contentValues.put(KEY_VISITOR_FIRSTNAME, data1.getFName());

        contentValues.put(KEY_VILLAGE,data1.getVillageName());
        contentValues.put(KEY_ROUT,data1.getRouteName());



        // Long result= db.update(TABLE_VISITORS, contentValues,KEY_VISITOR_ID+" ="+ visitor.getVisitorId(), );

        int result=db.update(TABLE_VISITORS, contentValues,KEY_VISITOR_FIRSTNAME+" ="+ data1.getFName(),null);

        //int result= db.update(TABLE_VISITORS,contentValues,KEY_VISITOR_ID + " = ?",new String[]{String.valueOf(visitor.getVisitorId())});
        return result;
    }


    public ArrayList<Data1> getAllUser() {
        ArrayList<Data1> visitors = new ArrayList<>();

        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_VISITORS;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Data1 visitor = new Data1();

                visitor.setFName(cursor.getString(cursor.getColumnIndex(KEY_VISITOR_FIRSTNAME)));

                visitor.setVillageName(cursor.getString(cursor.getColumnIndex(KEY_VILLAGE)));
                visitor.setRouteName(cursor.getString(cursor.getColumnIndex(KEY_ROUT)));

                visitors.add(visitor);
            } while (cursor.moveToNext());
        }
        // close db connection
        db.close();
        // return notes list
        return visitors;
    }
}
