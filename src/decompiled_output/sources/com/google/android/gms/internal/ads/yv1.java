package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class yv1 implements Runnable {
    yv1() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zw1.D.n();
            zw1.D.o();
        } catch (Exception e) {
            zw1.F.b(2001, -1L, e);
        }
    }
}
