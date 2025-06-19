package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class u8 extends hh2 implements v8 {
    public u8() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public static v8 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof v8 ? (v8) iInterfaceQueryLocalInterface : new x8(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        p8 r8Var;
        if (r2 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                r8Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                r8Var = iInterfaceQueryLocalInterface instanceof p8 ? (p8) iInterfaceQueryLocalInterface : new r8(strongBinder);
            }
            y6(r8Var);
        } else if (r2 == 2) {
            U6(parcel.readInt());
        } else {
            if (r2 != 3) {
                return false;
            }
            a5((dw2) kh2.b(parcel, dw2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
