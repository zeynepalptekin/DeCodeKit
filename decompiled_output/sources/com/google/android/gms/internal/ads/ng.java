package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ng extends ih2 implements lg {
    ng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final gg Y0(c.a.b.b.e.c cVar, qc qcVar, int r4) throws RemoteException {
        gg igVar;
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r4);
        Parcel parcelB2 = b2(1, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            igVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            igVar = iInterfaceQueryLocalInterface instanceof gg ? (gg) iInterfaceQueryLocalInterface : new ig(strongBinder);
        }
        parcelB2.recycle();
        return igVar;
    }
}
