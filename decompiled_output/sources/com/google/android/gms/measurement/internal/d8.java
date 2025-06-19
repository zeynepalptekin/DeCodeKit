package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import c.a.b.b.g.c.wb;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class d8 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ ma e;
    private final /* synthetic */ x7 f;

    d8(x7 x7Var, AtomicReference atomicReference, ma maVar) {
        this.f = x7Var;
        this.d = atomicReference;
        this.e = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.d) {
            try {
                try {
                } catch (RemoteException e) {
                    this.f.B().E().b("Failed to get app instance id", e);
                    atomicReference = this.d;
                }
                if (wb.b() && this.f.j().p(u.J0) && !this.f.i().L().q()) {
                    this.f.B().K().a("Analytics storage consent denied; will not get app instance id");
                    this.f.l().V(null);
                    this.f.i().l.b(null);
                    this.d.set(null);
                    return;
                }
                o3 o3Var = this.f.d;
                if (o3Var == null) {
                    this.f.B().E().a("Failed to get app instance id");
                    return;
                }
                this.d.set(o3Var.K5(this.e));
                String str = (String) this.d.get();
                if (str != null) {
                    this.f.l().V(str);
                    this.f.i().l.b(str);
                }
                this.f.f0();
                atomicReference = this.d;
                atomicReference.notify();
            } finally {
                this.d.notify();
            }
        }
    }
}
