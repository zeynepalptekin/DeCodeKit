package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class it2 extends ih2 implements gt2 {
    it2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.gt2
    public final void S2(mt2 mt2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, mt2Var);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.gt2
    public final void S6(c.a.b.b.e.c cVar, qt2 qt2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, qt2Var);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.gt2
    public final tz2 o() throws RemoteException {
        Parcel parcelB2 = b2(5, L0());
        tz2 tz2VarY8 = sz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return tz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.gt2
    public final hy2 o6() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        hy2 hy2VarY8 = ky2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return hy2VarY8;
    }
}
