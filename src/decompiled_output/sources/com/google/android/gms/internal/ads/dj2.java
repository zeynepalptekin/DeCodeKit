package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class dj2 implements Runnable {
    private final /* synthetic */ int d;
    private final /* synthetic */ long e;
    private final /* synthetic */ long f;
    private final /* synthetic */ zi2 g;

    dj2(zi2 zi2Var, int r2, long j, long j2) {
        this.g = zi2Var;
        this.d = r2;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.f6270b.b(this.d, this.e, this.f);
    }
}
