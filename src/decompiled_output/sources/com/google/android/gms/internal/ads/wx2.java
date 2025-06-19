package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class wx2 extends hh2 implements xx2 {
    public wx2() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        switch (r1) {
            case 1:
                r();
                break;
            case 2:
                E(parcel.readInt());
                break;
            case 3:
                h();
                break;
            case 4:
                u();
                break;
            case 5:
                s();
                break;
            case 6:
                p();
                break;
            case 7:
                U();
                break;
            case 8:
                q1((dw2) kh2.b(parcel, dw2.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
