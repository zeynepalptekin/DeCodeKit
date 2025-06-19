package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ry2 extends ih2 implements py2 {
    ry2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.internal.ads.py2
    public final void Q(String str, String str2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        e2(1, parcelL0);
    }
}
