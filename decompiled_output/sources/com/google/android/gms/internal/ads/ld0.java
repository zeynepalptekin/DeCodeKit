package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ld0 implements Runnable {
    private final WeakReference<gd0> d;

    private ld0(gd0 gd0Var) {
        this.d = new WeakReference<>(gd0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        gd0 gd0Var = this.d.get();
        if (gd0Var != null) {
            gd0Var.J0();
        }
    }
}
