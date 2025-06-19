package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import c.a.b.b.g.c.pf;

/* loaded from: classes.dex */
final class k8 implements Runnable {
    private final /* synthetic */ s d;
    private final /* synthetic */ String e;
    private final /* synthetic */ pf f;
    private final /* synthetic */ x7 g;

    k8(x7 x7Var, s sVar, String str, pf pfVar) {
        this.g = x7Var;
        this.d = sVar;
        this.e = str;
        this.f = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZ3 = null;
        try {
            try {
                o3 o3Var = this.g.d;
                if (o3Var == null) {
                    this.g.B().E().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrZ3 = o3Var.Z3(this.d, this.e);
                    this.g.f0();
                }
            } catch (RemoteException e) {
                this.g.B().E().b("Failed to send event to the service to bundle", e);
            }
        } finally {
            this.g.h().U(this.f, bArrZ3);
        }
    }
}
