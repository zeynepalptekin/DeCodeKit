package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.cv2;
import com.google.android.gms.internal.ads.vu2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f01 {

    /* renamed from: a, reason: collision with root package name */
    private tu2 f3346a;

    /* renamed from: b, reason: collision with root package name */
    private Context f3347b;

    /* renamed from: c, reason: collision with root package name */
    private oz0 f3348c;
    private as d;

    public f01(Context context, as asVar, tu2 tu2Var, oz0 oz0Var) {
        this.f3347b = context;
        this.d = asVar;
        this.f3346a = tu2Var;
        this.f3348c = oz0Var;
    }

    public final void a() {
        try {
            this.f3348c.a(new iq1(this) { // from class: com.google.android.gms.internal.ads.e01

                /* renamed from: a, reason: collision with root package name */
                private final f01 f3195a;

                {
                    this.f3195a = this;
                }

                @Override // com.google.android.gms.internal.ads.iq1
                public final Object a(Object obj) {
                    return this.f3195a.b((SQLiteDatabase) obj);
                }
            });
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            tr.g(strValueOf.length() != 0 ? "Error in offline signals database startup: ".concat(strValueOf) : new String("Error in offline signals database startup: "));
        }
    }

    final /* synthetic */ Void b(SQLiteDatabase sQLiteDatabase) throws Exception {
        ArrayList<cv2.t.a> arrayListB = c01.b(sQLiteDatabase);
        final cv2.t tVar = (cv2.t) ((l92) cv2.t.W().v(this.f3347b.getPackageName()).w(Build.MODEL).x(c01.a(sQLiteDatabase, 0)).D(arrayListB).z(c01.a(sQLiteDatabase, 1)).A(com.google.android.gms.ads.internal.p.j().a()).C(c01.c(sQLiteDatabase, 2)).P());
        int size = arrayListB.size();
        long jH = 0;
        int r10 = 0;
        while (r10 < size) {
            cv2.t.a aVar = arrayListB.get(r10);
            r10++;
            cv2.t.a aVar2 = aVar;
            if (aVar2.j0() == mv2.ENUM_TRUE && aVar2.H() > jH) {
                jH = aVar2.H();
            }
        }
        if (jH != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jH));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        this.f3346a.a(new su2(tVar) { // from class: com.google.android.gms.internal.ads.h01

            /* renamed from: a, reason: collision with root package name */
            private final cv2.t f3604a;

            {
                this.f3604a = tVar;
            }

            @Override // com.google.android.gms.internal.ads.su2
            public final void a(cv2.n.a aVar3) {
                aVar3.A(this.f3604a);
            }
        });
        final cv2.z zVar = (cv2.z) ((l92) cv2.z.N().v(this.d.e).w(this.d.f).x(this.d.g ? 0 : 2).P());
        this.f3346a.a(new su2(zVar) { // from class: com.google.android.gms.internal.ads.g01

            /* renamed from: a, reason: collision with root package name */
            private final cv2.z f3483a;

            {
                this.f3483a = zVar;
            }

            @Override // com.google.android.gms.internal.ads.su2
            public final void a(cv2.n.a aVar3) {
                aVar3.z(aVar3.J().A().v(this.f3483a));
            }
        });
        this.f3346a.b(vu2.a.b.OFFLINE_UPLOAD);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
