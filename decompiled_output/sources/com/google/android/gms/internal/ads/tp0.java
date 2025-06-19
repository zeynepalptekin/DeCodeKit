package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class tp0 extends l5 {

    @androidx.annotation.i0
    private final String e;
    private final bl0 f;
    private final nl0 g;

    public tp0(@androidx.annotation.i0 String str, bl0 bl0Var, nl0 nl0Var) {
        this.e = str;
        this.f = bl0Var;
        this.g = nl0Var;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final boolean A1() {
        return this.f.h();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final e3 B1() throws RemoteException {
        return this.f.x().b();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void F1(g5 g5Var) throws RemoteException {
        this.f.n(g5Var);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final k3 G() throws RemoteException {
        return this.g.a0();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String H() throws RemoteException {
        return this.g.k();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final c.a.b.b.e.c K() throws RemoteException {
        return c.a.b.b.e.e.i2(this.f);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String L() throws RemoteException {
        return this.g.b();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String N() throws RemoteException {
        return this.g.m();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void N0() {
        this.f.I();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final boolean Q5() throws RemoteException {
        return (this.g.j().isEmpty() || this.g.D() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void V0() throws RemoteException {
        this.f.g();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final boolean Z(Bundle bundle) throws RemoteException {
        return this.f.H(bundle);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void c0(Bundle bundle) throws RemoteException {
        this.f.E(bundle);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void destroy() throws RemoteException {
        this.f.a();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String e() throws RemoteException {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final List<?> f3() throws RemoteException {
        return Q5() ? this.g.j() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final Bundle getExtras() throws RemoteException {
        return this.g.f();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final uz2 getVideoController() throws RemoteException {
        return this.g.n();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final b3 i() throws RemoteException {
        return this.g.b0();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String j() throws RemoteException {
        return this.g.g();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void j1(ez2 ez2Var) throws RemoteException {
        this.f.p(ez2Var);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String k() throws RemoteException {
        return this.g.c();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String l() throws RemoteException {
        return this.g.d();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final c.a.b.b.e.c m() throws RemoteException {
        return this.g.c0();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final List<?> n() throws RemoteException {
        return this.g.h();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void n1(@androidx.annotation.i0 jz2 jz2Var) throws RemoteException {
        this.f.q(jz2Var);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final tz2 o() throws RemoteException {
        if (((Boolean) qx2.e().c(e0.T4)).booleanValue()) {
            return this.f.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void q0(oz2 oz2Var) throws RemoteException {
        this.f.r(oz2Var);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void u7() {
        this.f.i();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final double v() throws RemoteException {
        return this.g.l();
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void v0(Bundle bundle) throws RemoteException {
        this.f.F(bundle);
    }
}
