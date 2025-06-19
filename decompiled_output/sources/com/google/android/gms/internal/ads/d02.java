package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class d02 implements Runnable {
    private final /* synthetic */ MotionEvent d;

    d02(zw1 zw1Var, MotionEvent motionEvent) {
        this.d = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zw1.D.f(this.d);
        } catch (Exception e) {
            zw1.F.b(2022, -1L, e);
        }
    }
}
