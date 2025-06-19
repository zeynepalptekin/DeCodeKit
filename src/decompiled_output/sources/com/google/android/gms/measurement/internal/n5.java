package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.wb;

/* loaded from: classes.dex */
final class n5 implements Runnable {
    private final /* synthetic */ ma d;
    private final /* synthetic */ c5 e;

    n5(c5 c5Var, ma maVar) {
        this.e = c5Var;
        this.d = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.e.k0();
        t9 t9Var = this.e.e;
        ma maVar = this.d;
        if (wb.b() && t9Var.M().p(u.L0)) {
            t9Var.x().c();
            t9Var.i0();
            com.google.android.gms.common.internal.r.g(maVar.d);
            e eVarB = e.b(maVar.z);
            e eVarB2 = t9Var.b(maVar.d);
            t9Var.A(maVar.d, eVarB);
            if (eVarB.h(eVarB2)) {
                t9Var.t(maVar);
            }
        }
    }
}
