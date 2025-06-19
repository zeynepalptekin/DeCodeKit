package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.c.a;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {
    @androidx.annotation.y0
    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    static void b(w3 w3Var, SQLiteDatabase sQLiteDatabase) {
        if (w3Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            w3Var.I().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            w3Var.I().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            w3Var.I().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        w3Var.I().a("Failed to turn on database write permission for owner");
    }

    @androidx.annotation.y0
    static void c(w3 w3Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLException {
        if (w3Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!d(w3Var, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            if (w3Var == null) {
                throw new IllegalArgumentException("Monitor must not be null");
            }
            Set<String> setA = a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!setA.remove(str4)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                    sb.append("Table ");
                    sb.append(str);
                    sb.append(" is missing required column: ");
                    sb.append(str4);
                    throw new SQLiteException(sb.toString());
                }
            }
            if (strArr != null) {
                for (int r1 = 0; r1 < strArr.length; r1 += 2) {
                    if (!setA.remove(strArr[r1])) {
                        sQLiteDatabase.execSQL(strArr[r1 + 1]);
                    }
                }
            }
            if (setA.isEmpty()) {
                return;
            }
            w3Var.I().c("Table has extra columns. table, columns", str, TextUtils.join(", ", setA));
        } catch (SQLiteException e) {
            w3Var.E().b("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    @androidx.annotation.y0
    private static boolean d(w3 w3Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (w3Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{a.C0190a.f6334b}, "name=?", new String[]{str}, null, null, null);
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return zMoveToFirst;
            } catch (SQLiteException e) {
                w3Var.I().c("Error querying for table", str, e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
