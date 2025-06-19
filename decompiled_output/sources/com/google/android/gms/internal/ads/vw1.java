package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class vw1 implements Runnable {
    private final /* synthetic */ iv1 d;
    private final /* synthetic */ tw1 e;

    vw1(tw1 tw1Var, iv1 iv1Var) {
        this.e = tw1Var;
        this.d = iv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.L(this.d);
    }
}
