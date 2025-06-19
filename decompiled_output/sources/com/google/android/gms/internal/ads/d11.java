package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class d11 implements Runnable {
    private final ur0 d;

    private d11(ur0 ur0Var) {
        this.d = ur0Var;
    }

    static Runnable a(ur0 ur0Var) {
        return new d11(ur0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a();
    }
}
