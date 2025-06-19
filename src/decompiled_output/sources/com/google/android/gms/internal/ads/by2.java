package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class by2 extends hh2 implements yx2 {
    public by2() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        String strE;
        if (r2 != 1) {
            if (r2 == 2) {
                strE = e();
            } else {
                if (r2 == 3) {
                    boolean zY = Y();
                    parcel2.writeNoException();
                    kh2.a(parcel2, zY);
                    return true;
                }
                if (r2 == 4) {
                    strE = R0();
                } else {
                    if (r2 != 5) {
                        return false;
                    }
                    s6((jw2) kh2.b(parcel, jw2.CREATOR), parcel.readInt());
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(strE);
            return true;
        }
        I3((jw2) kh2.b(parcel, jw2.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
