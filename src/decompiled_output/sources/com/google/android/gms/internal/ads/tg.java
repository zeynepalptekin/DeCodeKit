package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class tg extends hh2 implements pg {
    public tg() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static pg y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof pg ? (pg) iInterfaceQueryLocalInterface : new sg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        switch (r2) {
            case 1:
                C1((Bundle) kh2.b(parcel, Bundle.CREATOR));
                break;
            case 2:
                N4();
                break;
            case 3:
                C0();
                break;
            case 4:
                onResume();
                break;
            case 5:
                onPause();
                break;
            case 6:
                Bundle bundle = (Bundle) kh2.b(parcel, Bundle.CREATOR);
                x1(bundle);
                parcel2.writeNoException();
                kh2.g(parcel2, bundle);
                return true;
            case 7:
                U0();
                break;
            case 8:
                onDestroy();
                break;
            case 9:
                Z1();
                break;
            case 10:
                A6();
                break;
            case 11:
                boolean zK7 = k7();
                parcel2.writeNoException();
                kh2.a(parcel2, zK7);
                return true;
            case 12:
                f2(parcel.readInt(), parcel.readInt(), (Intent) kh2.b(parcel, Intent.CREATOR));
                break;
            case 13:
                c5(c.a.b2(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
