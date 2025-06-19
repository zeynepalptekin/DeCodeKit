package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class u8 implements Runnable {
    private final /* synthetic */ ComponentName d;
    private final /* synthetic */ s8 e;

    u8(s8 s8Var, ComponentName componentName) {
        this.e = s8Var;
        this.d = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.f.C(this.d);
    }
}
