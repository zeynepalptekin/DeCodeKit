package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class mt1 extends ih2 implements jt1 {
    mt1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.jt1
    public final void E4(et1 et1Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, et1Var);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.jt1
    public final ht1 N2(ft1 ft1Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, ft1Var);
        Parcel parcelB2 = b2(1, parcelL0);
        ht1 ht1Var = (ht1) kh2.b(parcelB2, ht1.CREATOR);
        parcelB2.recycle();
        return ht1Var;
    }

    @Override // com.google.android.gms.internal.ads.jt1
    public final rt1 k5(pt1 pt1Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, pt1Var);
        Parcel parcelB2 = b2(3, parcelL0);
        rt1 rt1Var = (rt1) kh2.b(parcelB2, rt1.CREATOR);
        parcelB2.recycle();
        return rt1Var;
    }
}
