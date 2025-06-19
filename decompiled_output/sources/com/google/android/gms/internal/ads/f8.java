package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class f8 extends ih2 implements d8 {
    f8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.d8
    public final void p1(List<a8> list) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeTypedList(list);
        e2(1, parcelL0);
    }
}
