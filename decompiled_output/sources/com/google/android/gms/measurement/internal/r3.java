package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
final class r3 extends SQLiteOpenHelper {
    private final /* synthetic */ s3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r3(s3 s3Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.d = s3Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.y0
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.d.B().E().a("Opening the local database failed, dropping and recreating it");
            if (!this.d.F().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.d.B().E().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.d.B().E().b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.y0
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        h.b(this.d.B(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.y0
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int r2, int r3) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.y0
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        h.c(this.d.B(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.y0
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int r2, int r3) {
    }
}
