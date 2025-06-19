package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.List;

/* loaded from: classes.dex */
public final class xc extends ih2 implements vc {
    xc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void D() throws RemoteException {
        e2(9, L0());
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final c.a.b.b.e.c F3() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void G6(c.a.b.b.e.c cVar, mk mkVar, List<String> list) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, mkVar);
        parcelL0.writeStringList(list);
        e2(23, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void H4(jw2 jw2Var, String str, String str2) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        e2(20, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void H6(c.a.b.b.e.c cVar, c8 c8Var, List<l8> list) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, c8Var);
        parcelL0.writeTypedList(list);
        e2(31, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final mf I0() throws RemoteException {
        Parcel parcelB2 = b2(34, L0());
        mf mfVar = (mf) kh2.b(parcelB2, mf.CREATOR);
        parcelB2.recycle();
        return mfVar;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void J2(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        kh2.c(parcelL0, wcVar);
        e2(28, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void L7(c.a.b.b.e.c cVar, jw2 jw2Var, String str, String str2, wc wcVar, z2 z2Var, List<String> list) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        kh2.c(parcelL0, wcVar);
        kh2.d(parcelL0, z2Var);
        parcelL0.writeStringList(list);
        e2(14, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final dd O1() throws RemoteException {
        dd fdVar;
        Parcel parcelB2 = b2(15, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            fdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            fdVar = iInterfaceQueryLocalInterface instanceof dd ? (dd) iInterfaceQueryLocalInterface : new fd(strongBinder);
        }
        parcelB2.recycle();
        return fdVar;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void O7(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        kh2.c(parcelL0, wcVar);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void P5(c.a.b.b.e.c cVar, jw2 jw2Var, String str, String str2, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        kh2.c(parcelL0, wcVar);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final Bundle P6() throws RemoteException {
        Parcel parcelB2 = b2(19, L0());
        Bundle bundle = (Bundle) kh2.b(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void T(boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.a(parcelL0, z);
        e2(25, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final boolean U4() throws RemoteException {
        Parcel parcelB2 = b2(22, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final ed Z6() throws RemoteException {
        ed gdVar;
        Parcel parcelB2 = b2(16, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            gdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            gdVar = iInterfaceQueryLocalInterface instanceof ed ? (ed) iInterfaceQueryLocalInterface : new gd(strongBinder);
        }
        parcelB2.recycle();
        return gdVar;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final mf b1() throws RemoteException {
        Parcel parcelB2 = b2(33, L0());
        mf mfVar = (mf) kh2.b(parcelB2, mf.CREATOR);
        parcelB2.recycle();
        return mfVar;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void b7(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(30, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final jd c8() throws RemoteException {
        jd ldVar;
        Parcel parcelB2 = b2(27, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            ldVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            ldVar = iInterfaceQueryLocalInterface instanceof jd ? (jd) iInterfaceQueryLocalInterface : new ld(strongBinder);
        }
        parcelB2.recycle();
        return ldVar;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void d2(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(21, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void destroy() throws RemoteException {
        e2(5, L0());
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final h4 e3() throws RemoteException {
        Parcel parcelB2 = b2(24, L0());
        h4 h4VarY8 = f4.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return h4VarY8;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final Bundle getInterstitialAdapterInfo() throws RemoteException {
        Parcel parcelB2 = b2(18, L0());
        Bundle bundle = (Bundle) kh2.b(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final uz2 getVideoController() throws RemoteException {
        Parcel parcelB2 = b2(26, L0());
        uz2 uz2VarY8 = xz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return uz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void h3(c.a.b.b.e.c cVar, qw2 qw2Var, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, qw2Var);
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        kh2.c(parcelL0, wcVar);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final boolean isInitialized() throws RemoteException {
        Parcel parcelB2 = b2(13, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void n4(c.a.b.b.e.c cVar, qw2 qw2Var, jw2 jw2Var, String str, String str2, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, qw2Var);
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        kh2.c(parcelL0, wcVar);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void showInterstitial() throws RemoteException {
        e2(4, L0());
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void showVideo() throws RemoteException {
        e2(12, L0());
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void t() throws RemoteException {
        e2(8, L0());
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void t6(c.a.b.b.e.c cVar, jw2 jw2Var, String str, mk mkVar, String str2) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        kh2.c(parcelL0, mkVar);
        parcelL0.writeString(str2);
        e2(10, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void v8(jw2 jw2Var, String str) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        e2(11, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void y4(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, jw2Var);
        parcelL0.writeString(str);
        kh2.c(parcelL0, wcVar);
        e2(32, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final Bundle zztv() throws RemoteException {
        Parcel parcelB2 = b2(17, L0());
        Bundle bundle = (Bundle) kh2.b(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle;
    }
}
