package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class dl0 implements Runnable {
    private final vl0 d;

    private dl0(vl0 vl0Var) {
        this.d = vl0Var;
    }

    static Runnable a(vl0 vl0Var) {
        return new dl0(vl0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.f();
    }
}
