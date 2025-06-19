package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import c.a.b.b.g.c.pf;
import c.a.b.b.g.c.wb;

/* loaded from: classes.dex */
final class g8 implements Runnable {
    private final /* synthetic */ ma d;
    private final /* synthetic */ pf e;
    private final /* synthetic */ x7 f;

    g8(x7 x7Var, ma maVar, pf pfVar) {
        this.f = x7Var;
        this.d = maVar;
        this.e = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strK5 = null;
        try {
            try {
                if (wb.b() && this.f.j().p(u.J0) && !this.f.i().L().q()) {
                    this.f.B().K().a("Analytics storage consent denied; will not get app instance id");
                    this.f.l().V(null);
                    this.f.i().l.b(null);
                } else {
                    o3 o3Var = this.f.d;
                    if (o3Var == null) {
                        this.f.B().E().a("Failed to get app instance id");
                    } else {
                        strK5 = o3Var.K5(this.d);
                        if (strK5 != null) {
                            this.f.l().V(strK5);
                            this.f.i().l.b(strK5);
                        }
                        this.f.f0();
                    }
                }
            } catch (RemoteException e) {
                this.f.B().E().b("Failed to get app instance id", e);
            }
        } finally {
            this.f.h().R(this.e, null);
        }
    }
}
