package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class b7 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ f6 e;

    b7(f6 f6Var, AtomicReference atomicReference) {
        this.e = f6Var;
        this.d = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            try {
                this.d.set(Integer.valueOf(this.e.j().r(this.e.m().A(), u.O)));
            } finally {
                this.d.notify();
            }
        }
    }
}
