package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class f13 extends xk {
    private static void z8(final cl clVar) {
        tr.g("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        jr.f4014b.post(new Runnable(clVar) { // from class: com.google.android.gms.internal.ads.e13
            private final cl d;

            {
                this.d = clVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cl clVar2 = this.d;
                if (clVar2 != null) {
                    try {
                        clVar2.P3(1);
                    } catch (RemoteException e) {
                        tr.e("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final Bundle A() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void G5(c.a.b.b.e.c cVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void I6(nz2 nz2Var) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final boolean W() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.tk
    @androidx.annotation.i0
    public final sk b6() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final String e() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void f6(hl hlVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void h6(zk zkVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final tz2 o() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void o8(jw2 jw2Var, cl clVar) throws RemoteException {
        z8(clVar);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void q0(oz2 oz2Var) {
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void r8(c.a.b.b.e.c cVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void v5(jw2 jw2Var, cl clVar) throws RemoteException {
        z8(clVar);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void w8(pl plVar) {
    }
}
