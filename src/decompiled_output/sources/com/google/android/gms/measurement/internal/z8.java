package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class z8 implements Runnable {
    private final /* synthetic */ s8 d;

    z8(s8 s8Var) {
        this.d = s8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x7.y(this.d.f, null);
        this.d.f.i0();
    }
}
