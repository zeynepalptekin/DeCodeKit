package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class b8 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ ma e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ x7 g;

    b8(x7 x7Var, AtomicReference atomicReference, ma maVar, boolean z) {
        this.g = x7Var;
        this.d = atomicReference;
        this.e = maVar;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        o3 o3Var;
        synchronized (this.d) {
            try {
                try {
                    o3Var = this.g.d;
                } catch (RemoteException e) {
                    this.g.B().E().b("Failed to get all user properties; remote exception", e);
                    atomicReference = this.d;
                }
                if (o3Var == null) {
                    this.g.B().E().a("Failed to get all user properties; not connected to service");
                    return;
                }
                this.d.set(o3Var.M1(this.e, this.f));
                this.g.f0();
                atomicReference = this.d;
                atomicReference.notify();
            } finally {
                this.d.notify();
            }
        }
    }
}
