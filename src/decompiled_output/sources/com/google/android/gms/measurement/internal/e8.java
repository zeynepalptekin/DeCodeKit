package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class e8 implements Runnable {
    private final /* synthetic */ ma d;
    private final /* synthetic */ x7 e;

    e8(x7 x7Var, ma maVar) {
        this.e = x7Var;
        this.d = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o3 o3Var = this.e.d;
        if (o3Var == null) {
            this.e.B().E().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            o3Var.y7(this.d);
        } catch (RemoteException e) {
            this.e.B().E().b("Failed to reset data on the service: remote exception", e);
        }
        this.e.f0();
    }
}
