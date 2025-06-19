package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.cv2;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class b01 implements rx1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f2766a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ yz0 f2767b;

    b01(yz0 yz0Var, boolean z) {
        this.f2767b = yz0Var;
        this.f2766a = z;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        tr.g("Failed to get signals bundle");
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        yz0 yz0Var = this.f2767b;
        final ArrayList arrayListK = yz0.k(bundle2);
        yz0 yz0Var2 = this.f2767b;
        final cv2.t.b bVarJ = yz0.j(bundle2);
        final cv2.r rVarI = this.f2767b.i(bundle2);
        oz0 oz0Var = this.f2767b.e;
        final boolean z = this.f2766a;
        oz0Var.a(new iq1(this, z, arrayListK, rVarI, bVarJ) { // from class: com.google.android.gms.internal.ads.a01

            /* renamed from: a, reason: collision with root package name */
            private final b01 f2610a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f2611b;

            /* renamed from: c, reason: collision with root package name */
            private final ArrayList f2612c;
            private final cv2.r d;
            private final cv2.t.b e;

            {
                this.f2610a = this;
                this.f2611b = z;
                this.f2612c = arrayListK;
                this.d = rVarI;
                this.e = bVarJ;
            }

            @Override // com.google.android.gms.internal.ads.iq1
            public final Object a(Object obj) throws SQLException {
                b01 b01Var = this.f2610a;
                boolean z2 = this.f2611b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                byte[] bArrD = b01Var.f2767b.d(z2, this.f2612c, this.d, this.e);
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(com.google.android.gms.ads.internal.p.j().a()));
                contentValues.put("serialized_proto_data", bArrD);
                sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                if (!z2) {
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                }
                return null;
            }
        });
    }
}
