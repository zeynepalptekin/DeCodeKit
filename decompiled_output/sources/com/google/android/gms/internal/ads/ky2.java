package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class ky2 extends hh2 implements hy2 {
    public ky2() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static hy2 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof hy2 ? (hy2) iInterfaceQueryLocalInterface : new jy2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        IInterface iInterfaceQ4;
        boolean zT0;
        Parcelable parcelableQ8;
        String strE;
        xx2 zx2Var = null;
        oz2 qz2Var = null;
        oy2 qy2Var = null;
        vy2 yy2Var = null;
        sx2 ux2Var = null;
        py2 ry2Var = null;
        switch (r1) {
            case 1:
                iInterfaceQ4 = Q4();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceQ4);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                zT0 = t0();
                parcel2.writeNoException();
                kh2.a(parcel2, zT0);
                return true;
            case 4:
                zT0 = f5((jw2) kh2.b(parcel, jw2.CREATOR));
                parcel2.writeNoException();
                kh2.a(parcel2, zT0);
                return true;
            case 5:
                t();
                parcel2.writeNoException();
                return true;
            case 6:
                D();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zx2Var = iInterfaceQueryLocalInterface instanceof xx2 ? (xx2) iInterfaceQueryLocalInterface : new zx2(strongBinder);
                }
                T4(zx2Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    ry2Var = iInterfaceQueryLocalInterface2 instanceof py2 ? (py2) iInterfaceQueryLocalInterface2 : new ry2(strongBinder2);
                }
                V1(ry2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                B2();
                parcel2.writeNoException();
                return true;
            case 11:
                M6();
                parcel2.writeNoException();
                return true;
            case 12:
                parcelableQ8 = q8();
                parcel2.writeNoException();
                kh2.g(parcel2, parcelableQ8);
                return true;
            case 13:
                I2((qw2) kh2.b(parcel, qw2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                G3(dh.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                A7(jh.y8(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 19:
                R2(a1.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    ux2Var = iInterfaceQueryLocalInterface3 instanceof sx2 ? (sx2) iInterfaceQueryLocalInterface3 : new ux2(strongBinder3);
                }
                b4(ux2Var);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    yy2Var = iInterfaceQueryLocalInterface4 instanceof vy2 ? (vy2) iInterfaceQueryLocalInterface4 : new yy2(strongBinder4);
                }
                a6(yy2Var);
                parcel2.writeNoException();
                return true;
            case 22:
                m3(kh2.e(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                zT0 = Y();
                parcel2.writeNoException();
                kh2.a(parcel2, zT0);
                return true;
            case 24:
                H0(ek.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                m0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceQ4 = getVideoController();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceQ4);
                return true;
            case 29:
                W5((m) kh2.b(parcel, m.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                E6((a03) kh2.b(parcel, a03.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                strE = K6();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 32:
                iInterfaceQ4 = A3();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceQ4);
                return true;
            case 33:
                iInterfaceQ4 = z5();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceQ4);
                return true;
            case 34:
                T(kh2.e(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                strE = R0();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    qy2Var = iInterfaceQueryLocalInterface5 instanceof oy2 ? (oy2) iInterfaceQueryLocalInterface5 : new qy2(strongBinder5);
                }
                S0(qy2Var);
                parcel2.writeNoException();
                return true;
            case 37:
                parcelableQ8 = A();
                parcel2.writeNoException();
                kh2.g(parcel2, parcelableQ8);
                return true;
            case 38:
                g3(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                l8((vw2) kh2.b(parcel, vw2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                v2(kt2.y8(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                iInterfaceQ4 = o();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceQ4);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    qz2Var = iInterfaceQueryLocalInterface6 instanceof oz2 ? (oz2) iInterfaceQueryLocalInterface6 : new qz2(strongBinder6);
                }
                q0(qz2Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
