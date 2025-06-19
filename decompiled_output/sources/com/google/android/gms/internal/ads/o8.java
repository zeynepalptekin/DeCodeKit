package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class o8 extends hh2 implements p8 {
    public o8() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        IInterface videoController;
        q8 s8Var;
        if (r2 != 3) {
            if (r2 == 4) {
                destroy();
            } else if (r2 == 5) {
                c.a.b.b.e.c cVarB2 = c.a.b2(parcel.readStrongBinder());
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    s8Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    s8Var = iInterfaceQueryLocalInterface instanceof q8 ? (q8) iInterfaceQueryLocalInterface : new s8(strongBinder);
                }
                S7(cVarB2, s8Var);
            } else if (r2 == 6) {
                H3(c.a.b2(parcel.readStrongBinder()));
            } else {
                if (r2 != 7) {
                    return false;
                }
                videoController = B1();
            }
            parcel2.writeNoException();
            return true;
        }
        videoController = getVideoController();
        parcel2.writeNoException();
        kh2.c(parcel2, videoController);
        return true;
    }
}
