package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class a7 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ f6 e;

    a7(f6 f6Var, AtomicReference atomicReference) {
        this.e = f6Var;
        this.d = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            try {
                this.d.set(Double.valueOf(this.e.j().s(this.e.m().A(), u.P)));
            } finally {
                this.d.notify();
            }
        }
    }
}
