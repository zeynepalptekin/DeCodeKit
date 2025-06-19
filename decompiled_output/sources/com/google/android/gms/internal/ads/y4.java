package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class y4 extends hh2 implements z4 {
    public y4() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static z4 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof z4 ? (z4) iInterfaceQueryLocalInterface : new b5(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 1) {
            return false;
        }
        E7(ky2.y8(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
