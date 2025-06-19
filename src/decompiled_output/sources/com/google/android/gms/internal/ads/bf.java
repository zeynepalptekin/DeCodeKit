package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class bf extends hh2 implements ye {
    public bf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static ye y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof ye ? (ye) iInterfaceQueryLocalInterface : new af(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.hh2
    protected final boolean x8(int r14, Parcel parcel, Parcel parcel2, int r17) throws RemoteException {
        df ffVar;
        mf mfVarB1;
        boolean zX6;
        le neVar = null;
        xe zeVar = null;
        se ueVar = null;
        xe zeVar2 = null;
        re teVar = null;
        if (r14 != 1) {
            if (r14 == 2) {
                mfVarB1 = b1();
            } else {
                if (r14 != 3) {
                    if (r14 == 5) {
                        uz2 videoController = getVideoController();
                        parcel2.writeNoException();
                        kh2.c(parcel2, videoController);
                    } else if (r14 == 10) {
                        R5(c.a.b2(parcel.readStrongBinder()));
                    } else if (r14 != 11) {
                        switch (r14) {
                            case 13:
                                String string = parcel.readString();
                                String string2 = parcel.readString();
                                jw2 jw2Var = (jw2) kh2.b(parcel, jw2.CREATOR);
                                c.a.b.b.e.c cVarB2 = c.a.b2(parcel.readStrongBinder());
                                IBinder strongBinder = parcel.readStrongBinder();
                                if (strongBinder != null) {
                                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    neVar = iInterfaceQueryLocalInterface instanceof le ? (le) iInterfaceQueryLocalInterface : new ne(strongBinder);
                                }
                                i3(string, string2, jw2Var, cVarB2, neVar, zc.y8(parcel.readStrongBinder()), (qw2) kh2.b(parcel, qw2.CREATOR));
                                break;
                            case 14:
                                String string3 = parcel.readString();
                                String string4 = parcel.readString();
                                jw2 jw2Var2 = (jw2) kh2.b(parcel, jw2.CREATOR);
                                c.a.b.b.e.c cVarB22 = c.a.b2(parcel.readStrongBinder());
                                IBinder strongBinder2 = parcel.readStrongBinder();
                                if (strongBinder2 != null) {
                                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                    teVar = iInterfaceQueryLocalInterface2 instanceof re ? (re) iInterfaceQueryLocalInterface2 : new te(strongBinder2);
                                }
                                E5(string3, string4, jw2Var2, cVarB22, teVar, zc.y8(parcel.readStrongBinder()));
                                break;
                            case 15:
                                zX6 = x6(c.a.b2(parcel.readStrongBinder()));
                                parcel2.writeNoException();
                                kh2.a(parcel2, zX6);
                                break;
                            case 16:
                                String string5 = parcel.readString();
                                String string6 = parcel.readString();
                                jw2 jw2Var3 = (jw2) kh2.b(parcel, jw2.CREATOR);
                                c.a.b.b.e.c cVarB23 = c.a.b2(parcel.readStrongBinder());
                                IBinder strongBinder3 = parcel.readStrongBinder();
                                if (strongBinder3 != null) {
                                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    zeVar2 = iInterfaceQueryLocalInterface3 instanceof xe ? (xe) iInterfaceQueryLocalInterface3 : new ze(strongBinder3);
                                }
                                m2(string5, string6, jw2Var3, cVarB23, zeVar2, zc.y8(parcel.readStrongBinder()));
                                break;
                            case 17:
                                zX6 = h7(c.a.b2(parcel.readStrongBinder()));
                                parcel2.writeNoException();
                                kh2.a(parcel2, zX6);
                                break;
                            case 18:
                                String string7 = parcel.readString();
                                String string8 = parcel.readString();
                                jw2 jw2Var4 = (jw2) kh2.b(parcel, jw2.CREATOR);
                                c.a.b.b.e.c cVarB24 = c.a.b2(parcel.readStrongBinder());
                                IBinder strongBinder4 = parcel.readStrongBinder();
                                if (strongBinder4 != null) {
                                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    ueVar = iInterfaceQueryLocalInterface4 instanceof se ? (se) iInterfaceQueryLocalInterface4 : new ue(strongBinder4);
                                }
                                f7(string7, string8, jw2Var4, cVarB24, ueVar, zc.y8(parcel.readStrongBinder()));
                                break;
                            case 19:
                                R3(parcel.readString());
                                break;
                            case 20:
                                String string9 = parcel.readString();
                                String string10 = parcel.readString();
                                jw2 jw2Var5 = (jw2) kh2.b(parcel, jw2.CREATOR);
                                c.a.b.b.e.c cVarB25 = c.a.b2(parcel.readStrongBinder());
                                IBinder strongBinder5 = parcel.readStrongBinder();
                                if (strongBinder5 != null) {
                                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    zeVar = iInterfaceQueryLocalInterface5 instanceof xe ? (xe) iInterfaceQueryLocalInterface5 : new ze(strongBinder5);
                                }
                                T3(string9, string10, jw2Var5, cVarB25, zeVar, zc.y8(parcel.readStrongBinder()));
                                break;
                            default:
                                return false;
                        }
                    } else {
                        I4(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
                    }
                    return true;
                }
                mfVarB1 = I0();
            }
            parcel2.writeNoException();
            kh2.g(parcel2, mfVarB1);
            return true;
        }
        c.a.b.b.e.c cVarB26 = c.a.b2(parcel.readStrongBinder());
        String string11 = parcel.readString();
        Bundle bundle = (Bundle) kh2.b(parcel, Bundle.CREATOR);
        Bundle bundle2 = (Bundle) kh2.b(parcel, Bundle.CREATOR);
        qw2 qw2Var = (qw2) kh2.b(parcel, qw2.CREATOR);
        IBinder strongBinder6 = parcel.readStrongBinder();
        if (strongBinder6 == null) {
            ffVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            ffVar = iInterfaceQueryLocalInterface6 instanceof df ? (df) iInterfaceQueryLocalInterface6 : new ff(strongBinder6);
        }
        n2(cVarB26, string11, bundle, bundle2, qw2Var, ffVar);
        parcel2.writeNoException();
        return true;
    }
}
