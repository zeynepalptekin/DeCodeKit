package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class w8 implements Runnable {
    private final /* synthetic */ s8 d;

    w8(s8 s8Var) {
        this.d = s8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.f.C(new ComponentName(this.d.f.F(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
