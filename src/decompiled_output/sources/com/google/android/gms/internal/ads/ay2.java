package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ay2 extends ih2 implements yx2 {
    ay2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final void I3(jw2 jw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, jw2Var);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final String R0() throws RemoteException {
        Parcel parcelB2 = b2(4, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final boolean Y() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final String e() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.yx2
    public final void s6(jw2 jw2Var, int r3) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeInt(r3);
        e2(5, parcelL0);
    }
}
