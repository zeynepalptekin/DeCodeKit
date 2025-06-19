package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class ft2 extends hh2 implements gt2 {
    public ft2() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        IInterface iInterfaceO6;
        if (r2 != 2) {
            mt2 ot2Var = null;
            qt2 st2Var = null;
            if (r2 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    ot2Var = iInterfaceQueryLocalInterface instanceof mt2 ? (mt2) iInterfaceQueryLocalInterface : new ot2(strongBinder);
                }
                S2(ot2Var);
            } else if (r2 == 4) {
                c.a.b.b.e.c cVarB2 = c.a.b2(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    st2Var = iInterfaceQueryLocalInterface2 instanceof qt2 ? (qt2) iInterfaceQueryLocalInterface2 : new st2(strongBinder2);
                }
                S6(cVarB2, st2Var);
            } else {
                if (r2 != 5) {
                    return false;
                }
                iInterfaceO6 = o();
            }
            parcel2.writeNoException();
            return true;
        }
        iInterfaceO6 = o6();
        parcel2.writeNoException();
        kh2.c(parcel2, iInterfaceO6);
        return true;
    }
}
