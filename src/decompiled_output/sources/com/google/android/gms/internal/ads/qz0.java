package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class qz0 implements rx1<SQLiteDatabase> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ iq1 f5076a;

    qz0(oz0 oz0Var, iq1 iq1Var) {
        this.f5076a = iq1Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        tr.g(strValueOf.length() != 0 ? "Failed to get offline signal database: ".concat(strValueOf) : new String("Failed to get offline signal database: "));
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f5076a.a(sQLiteDatabase);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            tr.g(strValueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(strValueOf) : new String("Error executing function on offline signal database: "));
        }
    }
}
