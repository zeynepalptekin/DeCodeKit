package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class q4 extends hh2 implements r4 {
    public q4() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static r4 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof r4 ? (r4) iInterfaceQueryLocalInterface : new t4(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r3, Parcel parcel, Parcel parcel2, int r6) throws RemoteException {
        h4 j4Var;
        if (r3 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            j4Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            j4Var = iInterfaceQueryLocalInterface instanceof h4 ? (h4) iInterfaceQueryLocalInterface : new j4(strongBinder);
        }
        W0(j4Var, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
