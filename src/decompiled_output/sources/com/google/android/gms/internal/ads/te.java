package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class te extends ih2 implements re {
    te(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.re
    public final void P(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.re
    public final void w(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.re
    public final void w1() throws RemoteException {
        e2(2, L0());
    }
}
