package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class r6 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ f6 f;

    r6(f6 f6Var, AtomicReference atomicReference, boolean z) {
        this.f = f6Var;
        this.d = atomicReference;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f.n().U(this.d, this.e);
    }
}
