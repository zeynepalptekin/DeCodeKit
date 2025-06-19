package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class gr2 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ long e;
    private final /* synthetic */ long f;
    private final /* synthetic */ er2 g;

    gr2(er2 er2Var, String str, long j, long j2) {
        this.g = er2Var;
        this.d = str;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.f3321b.y(this.d, this.e, this.f);
    }
}
