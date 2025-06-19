package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class f7 implements Runnable {
    private final /* synthetic */ e d;
    private final /* synthetic */ int e;
    private final /* synthetic */ long f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ f6 h;

    f7(f6 f6Var, e eVar, int r3, long j, boolean z) {
        this.h = f6Var;
        this.d = eVar;
        this.e = r3;
        this.f = j;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.K(this.d);
        this.h.M(this.d, this.e, this.f, false, this.g);
    }
}
