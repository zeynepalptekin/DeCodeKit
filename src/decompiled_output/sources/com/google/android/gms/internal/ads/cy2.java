package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class cy2 extends hh2 implements dy2 {
    public cy2() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        xx2 zx2Var = null;
        vy2 yy2Var = null;
        switch (r1) {
            case 1:
                yx2 yx2VarC4 = C4();
                parcel2.writeNoException();
                kh2.c(parcel2, yx2VarC4);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zx2Var = iInterfaceQueryLocalInterface instanceof xx2 ? (xx2) iInterfaceQueryLocalInterface : new zx2(strongBinder);
                }
                c3(zx2Var);
                break;
            case 3:
                n5(k4.y8(parcel.readStrongBinder()));
                break;
            case 4:
                B3(p4.y8(parcel.readStrongBinder()));
                break;
            case 5:
                P2(parcel.readString(), v4.y8(parcel.readStrongBinder()), q4.y8(parcel.readStrongBinder()));
                break;
            case 6:
                Q3((z2) kh2.b(parcel, z2.CREATOR));
                break;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    yy2Var = iInterfaceQueryLocalInterface2 instanceof vy2 ? (vy2) iInterfaceQueryLocalInterface2 : new yy2(strongBinder2);
                }
                q6(yy2Var);
                break;
            case 8:
                W2(y4.y8(parcel.readStrongBinder()), (qw2) kh2.b(parcel, qw2.CREATOR));
                break;
            case 9:
                D4((com.google.android.gms.ads.d0.m) kh2.b(parcel, com.google.android.gms.ads.d0.m.CREATOR));
                break;
            case 10:
                u2(d5.y8(parcel.readStrongBinder()));
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                F2((n8) kh2.b(parcel, n8.CREATOR));
                break;
            case 14:
                J1(u8.y8(parcel.readStrongBinder()));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
