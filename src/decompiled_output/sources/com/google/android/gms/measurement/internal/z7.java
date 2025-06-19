package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import c.a.b.b.g.c.pf;

/* loaded from: classes.dex */
final class z7 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ ma g;
    private final /* synthetic */ pf h;
    private final /* synthetic */ x7 i;

    z7(x7 x7Var, String str, String str2, boolean z, ma maVar, pf pfVar) {
        this.i = x7Var;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = maVar;
        this.h = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            try {
                o3 o3Var = this.i.d;
                if (o3Var == null) {
                    this.i.B().E().c("Failed to get user properties; not connected to service", this.d, this.e);
                } else {
                    bundle = ha.D(o3Var.K1(this.d, this.e, this.f, this.g));
                    this.i.f0();
                }
            } catch (RemoteException e) {
                this.i.B().E().c("Failed to get user properties; remote exception", this.d, e);
            }
        } finally {
            this.i.h().Q(this.h, bundle);
        }
    }
}
