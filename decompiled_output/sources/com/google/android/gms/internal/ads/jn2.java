package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class jn2 implements Runnable {
    private final /* synthetic */ hn2 d;

    jn2(hn2 hn2Var) {
        this.d = hn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.K) {
            return;
        }
        this.d.t.f(this.d);
    }
}
