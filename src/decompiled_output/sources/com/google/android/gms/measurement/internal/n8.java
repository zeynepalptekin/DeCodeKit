package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class n8 implements Runnable {
    private final /* synthetic */ ma d;
    private final /* synthetic */ x7 e;

    n8(x7 x7Var, ma maVar) {
        this.e = x7Var;
        this.d = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o3 o3Var = this.e.d;
        if (o3Var == null) {
            this.e.B().E().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            o3Var.L3(this.d);
            this.e.f0();
        } catch (RemoteException e) {
            this.e.B().E().b("Failed to send measurementEnabled to the service", e);
        }
    }
}
