package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class uc extends hh2 implements vc {
    public uc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r10, Parcel parcel, Parcel parcel2, int r13) throws RemoteException {
        IInterface iInterfaceF3;
        boolean zIsInitialized;
        Parcelable parcelableZztv;
        wc ycVar = null;
        switch (r10) {
            case 1:
                c.a.b.b.e.c cVarB2 = c.a.b2(parcel.readStrongBinder());
                qw2 qw2Var = (qw2) kh2.b(parcel, qw2.CREATOR);
                jw2 jw2Var = (jw2) kh2.b(parcel, jw2.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ycVar = iInterfaceQueryLocalInterface instanceof wc ? (wc) iInterfaceQueryLocalInterface : new yc(strongBinder);
                }
                h3(cVarB2, qw2Var, jw2Var, string, ycVar);
                parcel2.writeNoException();
                return true;
            case 2:
                iInterfaceF3 = F3();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceF3);
                return true;
            case 3:
                c.a.b.b.e.c cVarB22 = c.a.b2(parcel.readStrongBinder());
                jw2 jw2Var2 = (jw2) kh2.b(parcel, jw2.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ycVar = iInterfaceQueryLocalInterface2 instanceof wc ? (wc) iInterfaceQueryLocalInterface2 : new yc(strongBinder2);
                }
                O7(cVarB22, jw2Var2, string2, ycVar);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case 6:
                c.a.b.b.e.c cVarB23 = c.a.b2(parcel.readStrongBinder());
                qw2 qw2Var2 = (qw2) kh2.b(parcel, qw2.CREATOR);
                jw2 jw2Var3 = (jw2) kh2.b(parcel, jw2.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ycVar = iInterfaceQueryLocalInterface3 instanceof wc ? (wc) iInterfaceQueryLocalInterface3 : new yc(strongBinder3);
                }
                n4(cVarB23, qw2Var2, jw2Var3, string3, string4, ycVar);
                parcel2.writeNoException();
                return true;
            case 7:
                c.a.b.b.e.c cVarB24 = c.a.b2(parcel.readStrongBinder());
                jw2 jw2Var4 = (jw2) kh2.b(parcel, jw2.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ycVar = iInterfaceQueryLocalInterface4 instanceof wc ? (wc) iInterfaceQueryLocalInterface4 : new yc(strongBinder4);
                }
                P5(cVarB24, jw2Var4, string5, string6, ycVar);
                parcel2.writeNoException();
                return true;
            case 8:
                t();
                parcel2.writeNoException();
                return true;
            case 9:
                D();
                parcel2.writeNoException();
                return true;
            case 10:
                t6(c.a.b2(parcel.readStrongBinder()), (jw2) kh2.b(parcel, jw2.CREATOR), parcel.readString(), lk.y8(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                v8((jw2) kh2.b(parcel, jw2.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                zIsInitialized = isInitialized();
                parcel2.writeNoException();
                kh2.a(parcel2, zIsInitialized);
                return true;
            case 14:
                c.a.b.b.e.c cVarB25 = c.a.b2(parcel.readStrongBinder());
                jw2 jw2Var5 = (jw2) kh2.b(parcel, jw2.CREATOR);
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ycVar = iInterfaceQueryLocalInterface5 instanceof wc ? (wc) iInterfaceQueryLocalInterface5 : new yc(strongBinder5);
                }
                L7(cVarB25, jw2Var5, string7, string8, ycVar, (z2) kh2.b(parcel, z2.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                iInterfaceF3 = O1();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceF3);
                return true;
            case 16:
                iInterfaceF3 = Z6();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceF3);
                return true;
            case 17:
                parcelableZztv = zztv();
                parcel2.writeNoException();
                kh2.g(parcel2, parcelableZztv);
                return true;
            case 18:
                parcelableZztv = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                kh2.g(parcel2, parcelableZztv);
                return true;
            case 19:
                parcelableZztv = P6();
                parcel2.writeNoException();
                kh2.g(parcel2, parcelableZztv);
                return true;
            case 20:
                H4((jw2) kh2.b(parcel, jw2.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                d2(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                zIsInitialized = U4();
                parcel2.writeNoException();
                kh2.a(parcel2, zIsInitialized);
                return true;
            case 23:
                G6(c.a.b2(parcel.readStrongBinder()), lk.y8(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                iInterfaceF3 = e3();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceF3);
                return true;
            case 25:
                T(kh2.e(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceF3 = getVideoController();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceF3);
                return true;
            case 27:
                iInterfaceF3 = c8();
                parcel2.writeNoException();
                kh2.c(parcel2, iInterfaceF3);
                return true;
            case 28:
                c.a.b.b.e.c cVarB26 = c.a.b2(parcel.readStrongBinder());
                jw2 jw2Var6 = (jw2) kh2.b(parcel, jw2.CREATOR);
                String string9 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ycVar = iInterfaceQueryLocalInterface6 instanceof wc ? (wc) iInterfaceQueryLocalInterface6 : new yc(strongBinder6);
                }
                J2(cVarB26, jw2Var6, string9, ycVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                b7(c.a.b2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                H6(c.a.b2(parcel.readStrongBinder()), b8.y8(parcel.readStrongBinder()), parcel.createTypedArrayList(l8.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                c.a.b.b.e.c cVarB27 = c.a.b2(parcel.readStrongBinder());
                jw2 jw2Var7 = (jw2) kh2.b(parcel, jw2.CREATOR);
                String string10 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ycVar = iInterfaceQueryLocalInterface7 instanceof wc ? (wc) iInterfaceQueryLocalInterface7 : new yc(strongBinder7);
                }
                y4(cVarB27, jw2Var7, string10, ycVar);
                parcel2.writeNoException();
                return true;
            case 33:
                parcelableZztv = b1();
                parcel2.writeNoException();
                kh2.g(parcel2, parcelableZztv);
                return true;
            case 34:
                parcelableZztv = I0();
                parcel2.writeNoException();
                kh2.g(parcel2, parcelableZztv);
                return true;
        }
    }
}
