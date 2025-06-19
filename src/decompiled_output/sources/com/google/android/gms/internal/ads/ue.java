package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ue extends ih2 implements se {
    ue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.se
    public final void P(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.se
    public final void f8(jd jdVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, jdVar);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.se
    public final void w(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(2, parcelL0);
    }
}
