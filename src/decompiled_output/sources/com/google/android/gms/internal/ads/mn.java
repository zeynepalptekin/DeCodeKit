package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class mn extends ih2 implements kn {
    mn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.kn
    public final jn d7(c.a.b.b.e.c cVar, qc qcVar, int r4) throws RemoteException {
        jn lnVar;
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r4);
        Parcel parcelB2 = b2(2, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            lnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            lnVar = iInterfaceQueryLocalInterface instanceof jn ? (jn) iInterfaceQueryLocalInterface : new ln(strongBinder);
        }
        parcelB2.recycle();
        return lnVar;
    }
}
