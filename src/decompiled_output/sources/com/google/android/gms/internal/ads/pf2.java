package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;

/* loaded from: classes.dex */
final class pf2 implements Runnable {
    private final /* synthetic */ int d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ jf2 f;

    pf2(jf2 jf2Var, int r2, boolean z) {
        this.f = jf2Var;
        this.d = r2;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        fm0.a aVarL = this.f.l(this.d, this.e);
        this.f.j = aVarL;
        if (jf2.i(this.d, aVarL)) {
            this.f.f(this.d + 1, this.e);
        }
    }
}
