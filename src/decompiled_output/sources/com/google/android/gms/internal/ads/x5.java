package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class x5 implements Runnable {
    private final /* synthetic */ com.google.android.gms.ads.c0.e d;
    private final /* synthetic */ hy2 e;
    private final /* synthetic */ y5 f;

    x5(y5 y5Var, com.google.android.gms.ads.c0.e eVar, hy2 hy2Var) {
        this.f = y5Var;
        this.d = eVar;
        this.e = hy2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.g(this.e)) {
            this.f.e.a(this.d);
        } else {
            tr.i("Could not bind.");
        }
    }
}
