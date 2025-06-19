package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class bj2 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ long e;
    private final /* synthetic */ long f;
    private final /* synthetic */ zi2 g;

    bj2(zi2 zi2Var, String str, long j, long j2) {
        this.g = zi2Var;
        this.d = str;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.f6270b.d(this.d, this.e, this.f);
    }
}
