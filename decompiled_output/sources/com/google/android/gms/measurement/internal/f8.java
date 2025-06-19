package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class f8 implements Runnable {
    private final /* synthetic */ ma d;
    private final /* synthetic */ x7 e;

    f8(x7 x7Var, ma maVar) {
        this.e = x7Var;
        this.d = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        o3 o3Var = this.e.d;
        if (o3Var == null) {
            this.e.B().E().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            o3Var.R1(this.d);
            this.e.p().J();
            this.e.L(o3Var, null, this.d);
            this.e.f0();
        } catch (RemoteException e) {
            this.e.B().E().b("Failed to send app launch to the service", e);
        }
    }
}
