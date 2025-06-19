package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class kl0 extends xz2 {
    private final Object e = new Object();

    @Nullable
    private uz2 f;

    @Nullable
    private final jd g;

    public kl0(@Nullable uz2 uz2Var, @Nullable jd jdVar) {
        this.f = uz2Var;
        this.g = jdVar;
    }

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
        synchronized (this.e) {
            if (this.f == null) {
                return null;
            }
            return this.f.I5();
        }
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void J4() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float M() throws RemoteException {
        jd jdVar = this.g;
        if (jdVar != null) {
            return jdVar.q5();
        }
        return 0.0f;
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
            if (this.f != null) {
                this.f.P7(zz2Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float X() throws RemoteException {
        jd jdVar = this.g;
        if (jdVar != null) {
            return jdVar.A4();
        }
        return 0.0f;
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
