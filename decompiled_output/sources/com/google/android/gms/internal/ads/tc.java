package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class tc extends hh2 implements qc {
    public tc() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static qc y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof qc ? (qc) iInterfaceQueryLocalInterface : new sc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        IInterface iInterfaceO2;
        if (r2 == 1) {
            iInterfaceO2 = O2(parcel.readString());
        } else {
            if (r2 == 2) {
                boolean zF4 = F4(parcel.readString());
                parcel2.writeNoException();
                kh2.a(parcel2, zF4);
                return true;
            }
            if (r2 != 3) {
                return false;
            }
            iInterfaceO2 = H5(parcel.readString());
        }
        parcel2.writeNoException();
        kh2.c(parcel2, iInterfaceO2);
        return true;
    }
}
