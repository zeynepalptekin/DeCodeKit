package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class st2 extends ih2 implements qt2 {
    st2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.qt2
    public final void J5() throws RemoteException {
        e2(1, L0());
    }

    @Override // com.google.android.gms.internal.ads.qt2
    public final void h8(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.qt2
    public final void o7() throws RemoteException {
        e2(2, L0());
    }
}
