package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class gy2 extends ih2 implements dy2 {
    gy2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void B3(m4 m4Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, m4Var);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final yx2 C4() throws RemoteException {
        yx2 ay2Var;
        Parcel parcelB2 = b2(1, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            ay2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            ay2Var = iInterfaceQueryLocalInterface instanceof yx2 ? (yx2) iInterfaceQueryLocalInterface : new ay2(strongBinder);
        }
        parcelB2.recycle();
        return ay2Var;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void D4(com.google.android.gms.ads.d0.m mVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, mVar);
        e2(9, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void F2(n8 n8Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, n8Var);
        e2(13, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void J1(v8 v8Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, v8Var);
        e2(14, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void P2(String str, s4 s4Var, r4 r4Var) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        kh2.c(parcelL0, s4Var);
        kh2.c(parcelL0, r4Var);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void Q3(z2 z2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, z2Var);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void W2(z4 z4Var, qw2 qw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, z4Var);
        kh2.d(parcelL0, qw2Var);
        e2(8, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void c3(xx2 xx2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, xx2Var);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void n5(l4 l4Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, l4Var);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void q6(vy2 vy2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, vy2Var);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void u2(a5 a5Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, a5Var);
        e2(10, parcelL0);
    }
}
