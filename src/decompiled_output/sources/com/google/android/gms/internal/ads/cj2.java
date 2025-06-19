package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class cj2 implements Runnable {
    private final /* synthetic */ ck2 d;
    private final /* synthetic */ zi2 e;

    cj2(zi2 zi2Var, ck2 ck2Var) {
        this.e = zi2Var;
        this.d = ck2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a();
        this.e.f6270b.f(this.d);
    }
}
