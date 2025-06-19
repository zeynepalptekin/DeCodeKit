package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class v6 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ f6 e;

    v6(f6 f6Var, AtomicReference atomicReference) {
        this.e = f6Var;
        this.d = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            try {
                this.d.set(this.e.j().O(this.e.m().A()));
            } finally {
                this.d.notify();
            }
        }
    }
}
