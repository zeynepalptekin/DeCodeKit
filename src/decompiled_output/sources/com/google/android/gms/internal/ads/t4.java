package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class t4 extends ih2 implements r4 {
    t4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.r4
    public final void W0(h4 h4Var, String str) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, h4Var);
        parcelL0.writeString(str);
        e2(1, parcelL0);
    }
}
