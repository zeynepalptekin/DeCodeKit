package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class c7 implements Runnable {
    private final /* synthetic */ e d;
    private final /* synthetic */ long e;
    private final /* synthetic */ int f;
    private final /* synthetic */ long g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ f6 i;

    c7(f6 f6Var, e eVar, long j, int r5, long j2, boolean z) {
        this.i = f6Var;
        this.d = eVar;
        this.e = j;
        this.f = r5;
        this.g = j2;
        this.h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.K(this.d);
        this.i.G(this.e, false);
        this.i.M(this.d, this.f, this.g, true, this.h);
    }
}
