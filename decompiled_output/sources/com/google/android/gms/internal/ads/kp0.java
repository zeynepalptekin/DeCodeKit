package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class kp0 extends x3 {

    @androidx.annotation.i0
    private final String e;
    private final bl0 f;
    private final nl0 g;

    public kp0(@androidx.annotation.i0 String str, bl0 bl0Var, nl0 nl0Var) {
        this.e = str;
        this.f = bl0Var;
        this.g = nl0Var;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final k3 G() throws RemoteException {
        return this.g.a0();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String H() throws RemoteException {
        return this.g.k();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final c.a.b.b.e.c K() throws RemoteException {
        return c.a.b.b.e.e.i2(this.f);
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String N() throws RemoteException {
        return this.g.m();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final boolean Z(Bundle bundle) throws RemoteException {
        return this.f.H(bundle);
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final void c0(Bundle bundle) throws RemoteException {
        this.f.E(bundle);
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final void destroy() throws RemoteException {
        this.f.a();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String e() throws RemoteException {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final Bundle getExtras() throws RemoteException {
        return this.g.f();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final uz2 getVideoController() throws RemoteException {
        return this.g.n();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final b3 i() throws RemoteException {
        return this.g.b0();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String j() throws RemoteException {
        return this.g.g();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String k() throws RemoteException {
        return this.g.c();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String l() throws RemoteException {
        return this.g.d();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final c.a.b.b.e.c m() throws RemoteException {
        return this.g.c0();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final List<?> n() throws RemoteException {
        return this.g.h();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final double v() throws RemoteException {
        return this.g.l();
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final void v0(Bundle bundle) throws RemoteException {
        this.f.F(bundle);
    }
}
