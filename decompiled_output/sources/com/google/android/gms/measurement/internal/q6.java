package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class q6 implements Runnable {
    private final /* synthetic */ long d;
    private final /* synthetic */ f6 e;

    q6(f6 f6Var, long j) {
        this.e = f6Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.G(this.d, true);
        this.e.n().R(new AtomicReference<>());
    }
}
