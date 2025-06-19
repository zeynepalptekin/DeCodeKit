package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class kh extends hh2 implements lh {
    public kh() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static lh y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof lh ? (lh) iInterfaceQueryLocalInterface : new nh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 == 1) {
            Y7(parcel.createTypedArrayList(Uri.CREATOR));
        } else {
            if (r2 != 2) {
                return false;
            }
            u1(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
