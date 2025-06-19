package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class w9 implements Runnable {
    private final /* synthetic */ ba d;
    private final /* synthetic */ t9 e;

    w9(t9 t9Var, ba baVar) {
        this.e = t9Var;
        this.d = baVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.r(this.d);
        this.e.h();
    }
}
