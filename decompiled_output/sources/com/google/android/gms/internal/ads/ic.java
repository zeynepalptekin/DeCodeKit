package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ic extends dz {
    private final com.google.android.gms.measurement.c.a e;

    ic(com.google.android.gms.measurement.c.a aVar) {
        this.e = aVar;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final String C2() throws RemoteException {
        return this.e.e();
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int E1(String str) throws RemoteException {
        return this.e.m(str);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final void E2(Bundle bundle) throws RemoteException {
        this.e.q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final String E3() throws RemoteException {
        return this.e.h();
    }

    @Override // com.google.android.gms.internal.ads.az
    public final String K2() throws RemoteException {
        return this.e.j();
    }

    @Override // com.google.android.gms.internal.ads.az
    public final Bundle L5(Bundle bundle) throws RemoteException {
        return this.e.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final void O3(Bundle bundle) throws RemoteException {
        this.e.t(bundle);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final List X0(String str, String str2) throws RemoteException {
        return this.e.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final void b8(String str) throws RemoteException {
        this.e.c(str);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        this.e.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final void d6(String str, String str2, c.a.b.b.e.c cVar) throws RemoteException {
        this.e.z(str, str2, cVar != null ? c.a.b.b.e.e.e2(cVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final void e6(String str) throws RemoteException {
        this.e.a(str);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final Map g2(String str, String str2, boolean z) throws RemoteException {
        return this.e.n(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final String m5() throws RemoteException {
        return this.e.f();
    }

    @Override // com.google.android.gms.internal.ads.az
    public final void n3(c.a.b.b.e.c cVar, String str, String str2) throws RemoteException {
        this.e.v(cVar != null ? (Activity) c.a.b.b.e.e.e2(cVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.az
    public final long n6() throws RemoteException {
        return this.e.d();
    }

    @Override // com.google.android.gms.internal.ads.az
    public final String u6() throws RemoteException {
        return this.e.i();
    }

    @Override // com.google.android.gms.internal.ads.az
    public final void y1(String str, String str2, Bundle bundle) throws RemoteException {
        this.e.o(str, str2, bundle);
    }
}
