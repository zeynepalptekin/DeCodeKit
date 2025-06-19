package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class i01 extends SQLiteOpenHelper {
    private final cy1 d;

    public i01(Context context, cy1 cy1Var) {
        super(context, "OfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.d = cy1Var;
    }

    final void a(final SQLiteDatabase sQLiteDatabase, final xr xrVar, final String str) {
        this.d.execute(new Runnable(sQLiteDatabase, str, xrVar) { // from class: com.google.android.gms.internal.ads.k01
            private final SQLiteDatabase d;
            private final String e;
            private final xr f;

            {
                this.d = sQLiteDatabase;
                this.e = str;
                this.f = xrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SQLiteDatabase sQLiteDatabase2 = this.d;
                String str2 = this.e;
                xr xrVar2 = this.f;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase2.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str2});
                sQLiteDatabase2.beginTransaction();
                try {
                    String[] strArr = {com.google.android.gms.common.internal.o.f2536a};
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("event_state = 1");
                    Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, sb.toString(), null, null, null, "timestamp ASC", null);
                    int count = cursorQuery.getCount();
                    String[] strArr2 = new String[count];
                    int r4 = 0;
                    while (cursorQuery.moveToNext()) {
                        int columnIndex = cursorQuery.getColumnIndex(com.google.android.gms.common.internal.o.f2536a);
                        if (columnIndex != -1) {
                            strArr2[r4] = cursorQuery.getString(columnIndex);
                        }
                        r4++;
                    }
                    cursorQuery.close();
                    sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                    sQLiteDatabase2.setTransactionSuccessful();
                    for (int r13 = 0; r13 < count; r13++) {
                        xrVar2.a(strArr2[r13]);
                    }
                } finally {
                    sQLiteDatabase2.endTransaction();
                }
            }
        });
    }

    public final void b(final o01 o01Var) {
        qx1.f(this.d.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.l01

            /* renamed from: a, reason: collision with root package name */
            private final i01 f4173a;

            {
                this.f4173a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4173a.getWritableDatabase();
            }
        }), new m01(this, new iq1(o01Var) { // from class: com.google.android.gms.internal.ads.n01

            /* renamed from: a, reason: collision with root package name */
            private final o01 f4471a;

            {
                this.f4471a = o01Var;
            }

            @Override // com.google.android.gms.internal.ads.iq1
            public final Object a(Object obj) {
                o01 o01Var2 = this.f4471a;
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(o01Var2.f4624a));
                contentValues.put("gws_query_id", o01Var2.f4625b);
                contentValues.put(com.google.android.gms.common.internal.o.f2536a, o01Var2.f4626c);
                contentValues.put("event_state", Integer.valueOf(o01Var2.d - 1));
                ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
                return null;
            }
        }), this.d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int r2, int r3) throws SQLException {
        onUpgrade(sQLiteDatabase, r2, r3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int r2, int r3) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
