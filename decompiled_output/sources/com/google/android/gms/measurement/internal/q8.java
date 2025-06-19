package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import c.a.b.b.g.c.pf;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class q8 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ ma f;
    private final /* synthetic */ pf g;
    private final /* synthetic */ x7 h;

    q8(x7 x7Var, String str, String str2, ma maVar, pf pfVar) {
        this.h = x7Var;
        this.d = str;
        this.e = str2;
        this.f = maVar;
        this.g = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                o3 o3Var = this.h.d;
                if (o3Var == null) {
                    this.h.B().E().c("Failed to get conditional properties; not connected to service", this.d, this.e);
                } else {
                    arrayList = ha.t0(o3Var.H7(this.d, this.e, this.f));
                    this.h.f0();
                }
            } catch (RemoteException e) {
                this.h.B().E().d("Failed to get conditional properties; remote exception", this.d, this.e, e);
            }
        } finally {
            this.h.h().S(this.g, arrayList);
        }
    }
}
