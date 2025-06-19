package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes.dex */
final class kr2 implements Runnable {
    private final /* synthetic */ Surface d;
    private final /* synthetic */ er2 e;

    kr2(er2 er2Var, Surface surface) {
        this.e = er2Var;
        this.d = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.f3321b.z(this.d);
    }
}
