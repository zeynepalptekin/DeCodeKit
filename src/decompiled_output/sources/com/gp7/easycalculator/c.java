package com.gp7.easycalculator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public class c extends SQLiteOpenHelper {
    private static final int d = 2;
    private static final String e = "Calculations.db";
    private static final String f = "CREATE TABLE UserCalculations (_id INTEGER PRIMARY KEY,espressionerisolta TEXT,risultatofornito TEXT,Data TEXT,protezione TEXT)";
    private static final String g = "ALTER TABLE UserCalculations ADD COLUMN protezione TEXT DEFAULT 'N' ";
    private static final String h = "CREATE TABLE UserListShopping (_id INTEGER PRIMARY KEY,nomelista TEXT,totitems TEXT,totprice TEXT,items TEXT,prices TEXT,qts TEXT,Typoqts TEXT,data TEXT,protezione TEXT)";

    c(Context context) {
        super(context, e, (SQLiteDatabase.CursorFactory) null, 2);
        Log.e("DATABASE  OPERATIONS ", "dATABSE CREATED / OPENED ...");
    }

    long a(String str, String str2, String str3, String str4, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("espressionerisolta", str);
        contentValues.put("risultatofornito", str2);
        contentValues.put("Data", str3);
        contentValues.put("protezione", str4);
        long jInsert = sQLiteDatabase.insert("UserCalculations", null, contentValues);
        Log.e("DATABASE  OPERATIONS ", "one row is insert ");
        return jInsert;
    }

    long b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("nomelista", str);
        contentValues.put("totitems", str2);
        contentValues.put("totprice", str3);
        contentValues.put(FirebaseAnalytics.b.k0, str4);
        contentValues.put("prices", str5);
        contentValues.put("qts", str6);
        contentValues.put("Typoqts", str7);
        contentValues.put("data", str8);
        contentValues.put("protezione", str9);
        long jInsert = sQLiteDatabase.insert("UserListShopping", null, contentValues);
        Log.e("DATABASE  OPERATIONS ", "one row is insert ");
        return jInsert;
    }

    void e(long j, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("UserCalculations", "_id LIKE ?", new String[]{String.valueOf(j)});
    }

    void f(long j, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("UserListShopping", "_id LIKE ?", new String[]{String.valueOf(j)});
    }

    Cursor g(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.query("UserCalculations", new String[]{"_id", "espressionerisolta", "risultatofornito", "Data", "protezione"}, null, null, null, null, null);
    }

    Cursor h(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.query("UserListShopping", new String[]{"_id", "nomelista", "totitems", "totprice", FirebaseAnalytics.b.k0, "prices", "qts", "Typoqts", "data", "protezione"}, null, null, null, null, null);
    }

    Cursor i(long j, SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.query("UserCalculations", new String[]{"risultatofornito"}, "_id LIKE ?", new String[]{String.valueOf(j)}, null, null, null);
    }

    Cursor j(long j, SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.query("UserListShopping", new String[]{"nomelista", "totitems", "totprice", FirebaseAnalytics.b.k0, "prices", "qts", "Typoqts"}, "_id LIKE ?", new String[]{String.valueOf(j)}, null, null, null);
    }

    void k(Long l, String str, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("protezione", str);
        sQLiteDatabase.update("UserListShopping", contentValues, "_id LIKE ?", new String[]{String.valueOf(l)});
        Log.e("DATABASE  OPERATIONS", "one row is updated ");
    }

    void l(Long l, String str, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("protezione", str);
        sQLiteDatabase.update("UserCalculations", contentValues, "_id LIKE ?", new String[]{String.valueOf(l)});
        Log.e("DATABASE  OPERATIONS", "one row is updated ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(f);
        sQLiteDatabase.execSQL(h);
        Log.e("DATABASE  OPERATIONS ", "Tables CREATED ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int r2, int r3) throws SQLException {
        if (r2 < 2) {
            sQLiteDatabase.execSQL(g);
            sQLiteDatabase.execSQL(h);
            Log.e("DATABASE  OPERATIONS ", "dATABASE upgraded ...");
        }
    }
}
