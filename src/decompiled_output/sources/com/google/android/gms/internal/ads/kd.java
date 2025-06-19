package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class kd extends xz2 {
    private final Object e = new Object();
    private volatile zz2 f;

    @Override // com.google.android.gms.internal.ads.uz2
    public final boolean A2() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void B5(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final zz2 I5() throws RemoteException {
        zz2 zz2Var;
        synchronized (this.e) {
            zz2Var = this.f;
        }
        return zz2Var;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void J4() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float M() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final int M0() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final boolean M3() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final boolean M4() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void P7(zz2 zz2Var) throws RemoteException {
        synchronized (this.e) {
            this.f = zz2Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float X() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float d0() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void stop() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void t() throws RemoteException {
        throw new RemoteException();
    }
}
