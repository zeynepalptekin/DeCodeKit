package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class q5 implements Runnable {
    private final /* synthetic */ s d;
    private final /* synthetic */ ma e;
    private final /* synthetic */ c5 f;

    q5(c5 c5Var, s sVar, ma maVar) {
        this.f = c5Var;
        this.d = sVar;
        this.e = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        s sVarY3 = this.f.y3(this.d, this.e);
        this.f.e.k0();
        this.f.e.m(sVarY3, this.e);
    }
}
