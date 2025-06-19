package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zx2 extends ih2 implements xx2 {
    zx2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.xx2
    public final void E(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xx2
    public final void U() throws RemoteException {
        e2(7, L0());
    }

    @Override // com.google.android.gms.internal.ads.xx2
    public final void h() throws RemoteException {
        e2(3, L0());
    }

    @Override // com.google.android.gms.internal.ads.xx2
    public final void p() throws RemoteException {
        e2(6, L0());
    }

    @Override // com.google.android.gms.internal.ads.xx2
    public final void q1(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(8, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xx2
    public final void r() throws RemoteException {
        e2(1, L0());
    }

    @Override // com.google.android.gms.internal.ads.xx2
    public final void s() throws RemoteException {
        e2(5, L0());
    }

    @Override // com.google.android.gms.internal.ads.xx2
    public final void u() throws RemoteException {
        e2(4, L0());
    }
}
