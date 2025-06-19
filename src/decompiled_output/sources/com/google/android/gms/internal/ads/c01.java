package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.cv2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c01 {
    public static int a(SQLiteDatabase sQLiteDatabase, int r3) {
        int r0 = 0;
        if (r3 == 2) {
            return 0;
        }
        Cursor cursorD = d(sQLiteDatabase, r3);
        if (cursorD.getCount() > 0) {
            cursorD.moveToNext();
            r0 = 0 + cursorD.getInt(cursorD.getColumnIndexOrThrow("value"));
        }
        cursorD.close();
        return r0;
    }

    public static ArrayList<cv2.t.a> b(SQLiteDatabase sQLiteDatabase) {
        ArrayList<cv2.t.a> arrayList = new ArrayList<>();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(cv2.t.a.i0(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (w92 e) {
                tr.g("Unable to deserialize proto from offline signals database:");
                tr.g(e.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static long c(SQLiteDatabase sQLiteDatabase, int r5) {
        Cursor cursorD = d(sQLiteDatabase, 2);
        long j = 0;
        if (cursorD.getCount() > 0) {
            cursorD.moveToNext();
            j = 0 + cursorD.getLong(cursorD.getColumnIndexOrThrow("value"));
        }
        cursorD.close();
        return j;
    }

    private static Cursor d(SQLiteDatabase sQLiteDatabase, int r10) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (r10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (r10 == 1) {
            strArr2[0] = "total_requests";
        } else if (r10 == 2) {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }
}
