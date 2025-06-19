package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class k4 extends hh2 implements l4 {
    public k4() {
        super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public static l4 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof l4 ? (l4) iInterfaceQueryLocalInterface : new n4(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        y3 a4Var;
        if (r2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            a4Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            a4Var = iInterfaceQueryLocalInterface instanceof y3 ? (y3) iInterfaceQueryLocalInterface : new a4(strongBinder);
        }
        j5(a4Var);
        parcel2.writeNoException();
        return true;
    }
}
