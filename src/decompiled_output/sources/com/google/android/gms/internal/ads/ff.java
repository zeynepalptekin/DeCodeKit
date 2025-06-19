package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ff extends ih2 implements df {
    ff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.df
    public final void O4(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.df
    public final void S(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.df
    public final void g5(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(3, parcelL0);
    }
}
