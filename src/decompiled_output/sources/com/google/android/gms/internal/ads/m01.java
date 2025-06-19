package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class m01 implements rx1<SQLiteDatabase> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ iq1 f4324a;

    m01(i01 i01Var, iq1 iq1Var) {
        this.f4324a = iq1Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        tr.g(strValueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(strValueOf) : new String("Failed to get offline buffered ping database: "));
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f4324a.a(sQLiteDatabase);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            tr.g(strValueOf.length() != 0 ? "Error executing function on offline buffered ping database: ".concat(strValueOf) : new String("Error executing function on offline buffered ping database: "));
        }
    }
}
