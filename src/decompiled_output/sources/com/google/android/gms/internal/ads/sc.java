package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class sc extends ih2 implements qc {
    sc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final boolean F4(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        Parcel parcelB2 = b2(2, parcelL0);
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final ye H5(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        Parcel parcelB2 = b2(3, parcelL0);
        ye yeVarY8 = bf.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return yeVarY8;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final vc O2(String str) throws RemoteException {
        vc xcVar;
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        Parcel parcelB2 = b2(1, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            xcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            xcVar = iInterfaceQueryLocalInterface instanceof vc ? (vc) iInterfaceQueryLocalInterface : new xc(strongBinder);
        }
        parcelB2.recycle();
        return xcVar;
    }
}
