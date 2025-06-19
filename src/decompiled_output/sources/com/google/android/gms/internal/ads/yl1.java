package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class yl1 extends xk {
    private final ql1 e;
    private final qk1 f;
    private final String g;
    private final zm1 h;
    private final Context i;

    @androidx.annotation.i0
    @GuardedBy("this")
    private qq0 j;

    public yl1(@androidx.annotation.i0 String str, ql1 ql1Var, Context context, qk1 qk1Var, zm1 zm1Var) {
        this.g = str;
        this.e = ql1Var;
        this.f = qk1Var;
        this.h = zm1Var;
        this.i = context;
    }

    private final synchronized void B8(jw2 jw2Var, cl clVar, int r5) throws RemoteException {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        this.f.m(clVar);
        com.google.android.gms.ads.internal.p.c();
        if (to.L(this.i) && jw2Var.v == null) {
            tr.g("Failed to load the ad because app ID is missing.");
            this.f.i(vn1.b(xn1.APP_ID_MISSING, null, null));
        } else {
            if (this.j != null) {
                return;
            }
            ml1 ml1Var = new ml1(null);
            this.e.h(r5);
            this.e.Z(jw2Var, this.g, ml1Var, new am1(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final Bundle A() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        qq0 qq0Var = this.j;
        return qq0Var != null ? qq0Var.g() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final synchronized void G5(c.a.b.b.e.c cVar) throws RemoteException {
        r8(cVar, false);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void I6(nz2 nz2Var) {
        if (nz2Var == null) {
            this.f.e(null);
        } else {
            this.f.e(new xl1(this, nz2Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final boolean W() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        qq0 qq0Var = this.j;
        return (qq0Var == null || qq0Var.i()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.tk
    @androidx.annotation.i0
    public final sk b6() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        qq0 qq0Var = this.j;
        if (qq0Var != null) {
            return qq0Var.k();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final synchronized String e() throws RemoteException {
        if (this.j == null || this.j.d() == null) {
            return null;
        }
        return this.j.d().e();
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void f6(hl hlVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        this.f.n(hlVar);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void h6(zk zkVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        this.f.l(zkVar);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final tz2 o() {
        qq0 qq0Var;
        if (((Boolean) qx2.e().c(e0.T4)).booleanValue() && (qq0Var = this.j) != null) {
            return qq0Var.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final synchronized void o8(jw2 jw2Var, cl clVar) throws RemoteException {
        B8(jw2Var, clVar, sm1.f5282c);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void q0(oz2 oz2Var) {
        com.google.android.gms.common.internal.r.f("setOnPaidEventListener must be called on the main UI thread.");
        this.f.o(oz2Var);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final synchronized void r8(c.a.b.b.e.c cVar, boolean z) throws RemoteException {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        if (this.j == null) {
            tr.i("Rewarded can not be shown before loaded");
            this.f.d(vn1.b(xn1.NOT_READY, null, null));
        } else {
            this.j.j(z, (Activity) c.a.b.b.e.e.e2(cVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final synchronized void v5(jw2 jw2Var, cl clVar) throws RemoteException {
        B8(jw2Var, clVar, sm1.f5281b);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final synchronized void w8(pl plVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        zm1 zm1Var = this.h;
        zm1Var.f6290a = plVar.d;
        if (((Boolean) qx2.e().c(e0.v0)).booleanValue()) {
            zm1Var.f6291b = plVar.e;
        }
    }
}
