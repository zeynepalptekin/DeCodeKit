package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class wk extends ih2 implements tk {
    wk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final Bundle A() throws RemoteException {
        Parcel parcelB2 = b2(9, L0());
        Bundle bundle = (Bundle) kh2.b(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void G5(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void I6(nz2 nz2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, nz2Var);
        e2(8, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final boolean W() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final sk b6() throws RemoteException {
        sk ukVar;
        Parcel parcelB2 = b2(11, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            ukVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            ukVar = iInterfaceQueryLocalInterface instanceof sk ? (sk) iInterfaceQueryLocalInterface : new uk(strongBinder);
        }
        parcelB2.recycle();
        return ukVar;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final String e() throws RemoteException {
        Parcel parcelB2 = b2(4, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void f6(hl hlVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, hlVar);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void h6(zk zkVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, zkVar);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final tz2 o() throws RemoteException {
        Parcel parcelB2 = b2(12, L0());
        tz2 tz2VarY8 = sz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return tz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void o8(jw2 jw2Var, cl clVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, jw2Var);
        kh2.c(parcelL0, clVar);
        e2(14, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void q0(oz2 oz2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, oz2Var);
        e2(13, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void r8(c.a.b.b.e.c cVar, boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.a(parcelL0, z);
        e2(10, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void v5(jw2 jw2Var, cl clVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, jw2Var);
        kh2.c(parcelL0, clVar);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void w8(pl plVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, plVar);
        e2(7, parcelL0);
    }
}
