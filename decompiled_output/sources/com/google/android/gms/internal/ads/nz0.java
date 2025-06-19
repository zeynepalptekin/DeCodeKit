package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final /* synthetic */ class nz0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final mz0 f4619a;

    private nz0(mz0 mz0Var) {
        this.f4619a = mz0Var;
    }

    static Callable a(mz0 mz0Var) {
        return new nz0(mz0Var);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4619a.getWritableDatabase();
    }
}
