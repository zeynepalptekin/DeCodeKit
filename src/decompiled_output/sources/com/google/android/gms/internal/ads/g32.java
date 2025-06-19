package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class g32 implements Runnable {
    private final /* synthetic */ int d;
    private final /* synthetic */ int e;
    private final /* synthetic */ int f;

    g32(zw1 zw1Var, int r2, int r3, int r4) {
        this.d = r2;
        this.e = r3;
        this.f = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zw1.D.f(MotionEvent.obtain(0L, this.d, 0, this.e, this.f, 0));
        } catch (Exception e) {
            zw1.F.b(2022, -1L, e);
        }
    }
}
