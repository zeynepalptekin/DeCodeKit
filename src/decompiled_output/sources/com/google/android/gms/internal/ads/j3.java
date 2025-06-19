package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class j3 extends hh2 implements k3 {
    public j3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static k3 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof k3 ? (k3) iInterfaceQueryLocalInterface : new m3(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r3, Parcel parcel, Parcel parcel2, int r6) throws RemoteException {
        int width;
        if (r3 == 1) {
            c.a.b.b.e.c cVarJ6 = J6();
            parcel2.writeNoException();
            kh2.c(parcel2, cVarJ6);
        } else if (r3 == 2) {
            Uri uriS1 = s1();
            parcel2.writeNoException();
            kh2.g(parcel2, uriS1);
        } else if (r3 != 3) {
            if (r3 == 4) {
                width = getWidth();
            } else {
                if (r3 != 5) {
                    return false;
                }
                width = getHeight();
            }
            parcel2.writeNoException();
            parcel2.writeInt(width);
        } else {
            double dQ1 = Q1();
            parcel2.writeNoException();
            parcel2.writeDouble(dQ1);
        }
        return true;
    }
}
