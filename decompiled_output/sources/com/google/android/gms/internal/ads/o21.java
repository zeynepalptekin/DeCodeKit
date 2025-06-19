package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class o21 extends lk implements kc0 {

    @GuardedBy("this")
    private mk e;

    @GuardedBy("this")
    private jc0 f;

    @GuardedBy("this")
    private th0 g;

    public final synchronized void A8(th0 th0Var) {
        this.g = th0Var;
    }

    @Override // com.google.android.gms.internal.ads.kc0
    public final synchronized void B6(jc0 jc0Var) {
        this.f = jc0Var;
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void C3(c.a.b.b.e.c cVar, int r3) throws RemoteException {
        if (this.e != null) {
            this.e.C3(cVar, r3);
        }
        if (this.g != null) {
            this.g.a(r3);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void C5(c.a.b.b.e.c cVar, int r3) throws RemoteException {
        if (this.e != null) {
            this.e.C5(cVar, r3);
        }
        if (this.f != null) {
            this.f.E(r3);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void C7(c.a.b.b.e.c cVar) throws RemoteException {
        if (this.e != null) {
            this.e.C7(cVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void G2(c.a.b.b.e.c cVar) throws RemoteException {
        if (this.e != null) {
            this.e.G2(cVar);
        }
        if (this.f != null) {
            this.f.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void H2(c.a.b.b.e.c cVar, qk qkVar) throws RemoteException {
        if (this.e != null) {
            this.e.H2(cVar, qkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void K4(c.a.b.b.e.c cVar) throws RemoteException {
        if (this.e != null) {
            this.e.K4(cVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void T7(c.a.b.b.e.c cVar) throws RemoteException {
        if (this.e != null) {
            this.e.T7(cVar);
        }
        if (this.g != null) {
            this.g.f0();
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void Z5(c.a.b.b.e.c cVar) throws RemoteException {
        if (this.e != null) {
            this.e.Z5(cVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void h4(c.a.b.b.e.c cVar) throws RemoteException {
        if (this.e != null) {
            this.e.h4(cVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void i0(Bundle bundle) throws RemoteException {
        if (this.e != null) {
            this.e.i0(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void l2(c.a.b.b.e.c cVar) throws RemoteException {
        if (this.e != null) {
            this.e.l2(cVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final synchronized void z6(c.a.b.b.e.c cVar) throws RemoteException {
        if (this.e != null) {
            this.e.z6(cVar);
        }
    }

    public final synchronized void z8(mk mkVar) {
        this.e = mkVar;
    }
}
