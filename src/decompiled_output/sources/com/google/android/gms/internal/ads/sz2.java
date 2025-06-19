package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class sz2 extends hh2 implements tz2 {
    public sz2() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static tz2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof tz2 ? (tz2) iInterfaceQueryLocalInterface : new vz2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        String strE;
        if (r1 == 1) {
            strE = e();
        } else {
            if (r1 != 2) {
                if (r1 != 3) {
                    return false;
                }
                List<uw2> listJ2 = j2();
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ2);
                return true;
            }
            strE = f4();
        }
        parcel2.writeNoException();
        parcel2.writeString(strE);
        return true;
    }
}
