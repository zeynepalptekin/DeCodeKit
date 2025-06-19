package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class p5 implements Runnable {
    private final /* synthetic */ s d;
    private final /* synthetic */ String e;
    private final /* synthetic */ c5 f;

    p5(c5 c5Var, s sVar, String str) {
        this.f = c5Var;
        this.d = sVar;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f.e.k0();
        this.f.e.n(this.d, this.e);
    }
}
