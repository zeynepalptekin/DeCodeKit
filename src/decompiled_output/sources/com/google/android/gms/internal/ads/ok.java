package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ok extends ih2 implements mk {
    ok(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void C3(c.a.b.b.e.c cVar, int r3) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeInt(r3);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void C5(c.a.b.b.e.c cVar, int r3) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeInt(r3);
        e2(9, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void C7(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void G2(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void H2(c.a.b.b.e.c cVar, qk qkVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, qkVar);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void K4(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void T7(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void Z5(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(11, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void h4(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(10, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void i0(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        e2(12, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void l2(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(8, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void z6(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(5, parcelL0);
    }
}
