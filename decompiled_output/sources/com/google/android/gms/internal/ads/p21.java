package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class p21 extends zc implements kc0 {

    @GuardedBy("this")
    private wc e;

    @GuardedBy("this")
    private jc0 f;

    @Override // com.google.android.gms.internal.ads.kc0
    public final synchronized void B6(jc0 jc0Var) {
        this.f = jc0Var;
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void D1() throws RemoteException {
        if (this.e != null) {
            this.e.D1();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void E(int r2) throws RemoteException {
        if (this.e != null) {
            this.e.E(r2);
        }
        if (this.f != null) {
            this.f.E(r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void J0(sk skVar) throws RemoteException {
        if (this.e != null) {
            this.e.J0(skVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void O5(bd bdVar) throws RemoteException {
        if (this.e != null) {
            this.e.O5(bdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void Q(String str, String str2) throws RemoteException {
        if (this.e != null) {
            this.e.Q(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void U() throws RemoteException {
        if (this.e != null) {
            this.e.U();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void U3(qk qkVar) throws RemoteException {
        if (this.e != null) {
            this.e.U3(qkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void W0(h4 h4Var, String str) throws RemoteException {
        if (this.e != null) {
            this.e.W0(h4Var, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void g0() throws RemoteException {
        if (this.e != null) {
            this.e.g0();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void h() throws RemoteException {
        if (this.e != null) {
            this.e.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void i0(Bundle bundle) throws RemoteException {
        if (this.e != null) {
            this.e.i0(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void j0() throws RemoteException {
        if (this.e != null) {
            this.e.j0();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void j4(String str) throws RemoteException {
        if (this.e != null) {
            this.e.j4(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void l6(int r2, String str) throws RemoteException {
        if (this.e != null) {
            this.e.l6(r2, str);
        }
        if (this.f != null) {
            this.f.a(r2, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void l7(int r2) throws RemoteException {
        if (this.e != null) {
            this.e.l7(r2);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void n7() throws RemoteException {
        if (this.e != null) {
            this.e.n7();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void o5(String str) throws RemoteException {
        if (this.e != null) {
            this.e.o5(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void p() throws RemoteException {
        if (this.e != null) {
            this.e.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void q1(dw2 dw2Var) throws RemoteException {
        if (this.e != null) {
            this.e.q1(dw2Var);
        }
        if (this.f != null) {
            this.f.i(dw2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void q3(dw2 dw2Var) throws RemoteException {
        if (this.e != null) {
            this.e.q3(dw2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void r() throws RemoteException {
        if (this.e != null) {
            this.e.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void s() throws RemoteException {
        if (this.e != null) {
            this.e.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void u() throws RemoteException {
        if (this.e != null) {
            this.e.u();
        }
        if (this.f != null) {
            this.f.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final synchronized void y5() throws RemoteException {
        if (this.e != null) {
            this.e.y5();
        }
    }

    public final synchronized void z8(wc wcVar) {
        this.e = wcVar;
    }
}
