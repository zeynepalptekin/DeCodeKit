package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class li extends hh2 implements mi {
    public li() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
        if (r4 != 1) {
            ni qiVar = null;
            pi riVar = null;
            pi riVar2 = null;
            pi riVar3 = null;
            pi riVar4 = null;
            if (r4 == 2) {
                gi giVar = (gi) kh2.b(parcel, gi.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    qiVar = iInterfaceQueryLocalInterface instanceof ni ? (ni) iInterfaceQueryLocalInterface : new qi(strongBinder);
                }
                S4(giVar, qiVar);
            } else if (r4 == 4) {
                wi wiVar = (wi) kh2.b(parcel, wi.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    riVar4 = iInterfaceQueryLocalInterface2 instanceof pi ? (pi) iInterfaceQueryLocalInterface2 : new ri(strongBinder2);
                }
                s4(wiVar, riVar4);
            } else if (r4 == 5) {
                wi wiVar2 = (wi) kh2.b(parcel, wi.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    riVar3 = iInterfaceQueryLocalInterface3 instanceof pi ? (pi) iInterfaceQueryLocalInterface3 : new ri(strongBinder3);
                }
                v6(wiVar2, riVar3);
            } else if (r4 == 6) {
                wi wiVar3 = (wi) kh2.b(parcel, wi.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    riVar2 = iInterfaceQueryLocalInterface4 instanceof pi ? (pi) iInterfaceQueryLocalInterface4 : new ri(strongBinder4);
                }
                Z7(wiVar3, riVar2);
            } else {
                if (r4 != 7) {
                    return false;
                }
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    riVar = iInterfaceQueryLocalInterface5 instanceof pi ? (pi) iInterfaceQueryLocalInterface5 : new ri(strongBinder5);
                }
                r4(string, riVar);
            }
            parcel2.writeNoException();
        } else {
            ii iiVarR3 = r3((gi) kh2.b(parcel, gi.CREATOR));
            parcel2.writeNoException();
            kh2.g(parcel2, iiVarR3);
        }
        return true;
    }
}
