package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class y6 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ f6 e;

    y6(f6 f6Var, AtomicReference atomicReference) {
        this.e = f6Var;
        this.d = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            try {
                this.d.set(Long.valueOf(this.e.j().m(this.e.m().A(), u.N)));
            } finally {
                this.d.notify();
            }
        }
    }
}
