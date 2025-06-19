package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class oz0 {

    /* renamed from: a, reason: collision with root package name */
    private final mz0 f4759a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f4760b;

    public oz0(mz0 mz0Var, cy1 cy1Var) {
        this.f4759a = mz0Var;
        this.f4760b = cy1Var;
    }

    public final void a(iq1<SQLiteDatabase, Void> iq1Var) {
        cy1 cy1Var = this.f4760b;
        mz0 mz0Var = this.f4759a;
        mz0Var.getClass();
        qx1.f(cy1Var.submit(nz0.a(mz0Var)), new qz0(this, iq1Var), this.f4760b);
    }
}
