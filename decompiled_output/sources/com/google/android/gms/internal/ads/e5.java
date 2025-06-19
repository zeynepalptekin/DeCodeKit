package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class e5 extends hh2 implements f5 {
    public e5() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static f5 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof f5 ? (f5) iInterfaceQueryLocalInterface : new i5(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 2) {
            return false;
        }
        boolean zP6 = p6(c.a.b2(parcel.readStrongBinder()));
        parcel2.writeNoException();
        kh2.a(parcel2, zP6);
        return true;
    }
}
