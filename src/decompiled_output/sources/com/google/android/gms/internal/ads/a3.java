package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a3 extends hh2 implements b3 {
    public a3() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static b3 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof b3 ? (b3) iInterfaceQueryLocalInterface : new d3(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 == 2) {
            String strX2 = X2();
            parcel2.writeNoException();
            parcel2.writeString(strX2);
            return true;
        }
        if (r1 != 3) {
            return false;
        }
        List<k3> listU5 = u5();
        parcel2.writeNoException();
        parcel2.writeList(listU5);
        return true;
    }
}
