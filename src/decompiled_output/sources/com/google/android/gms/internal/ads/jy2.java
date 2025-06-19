package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public final class jy2 extends ih2 implements hy2 {
    jy2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final Bundle A() throws RemoteException {
        Parcel parcelB2 = b2(37, L0());
        Bundle bundle = (Bundle) kh2.b(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final py2 A3() throws RemoteException {
        py2 ry2Var;
        Parcel parcelB2 = b2(32, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            ry2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            ry2Var = iInterfaceQueryLocalInterface instanceof py2 ? (py2) iInterfaceQueryLocalInterface : new ry2(strongBinder);
        }
        parcelB2.recycle();
        return ry2Var;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void A7(gh ghVar, String str) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, ghVar);
        parcelL0.writeString(str);
        e2(15, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void B2() throws RemoteException {
        e2(10, L0());
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void D() throws RemoteException {
        e2(6, L0());
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void E6(a03 a03Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, a03Var);
        e2(30, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void G3(ah ahVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, ahVar);
        e2(14, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void H0(bk bkVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, bkVar);
        e2(24, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void I2(qw2 qw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, qw2Var);
        e2(13, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final String K6() throws RemoteException {
        Parcel parcelB2 = b2(31, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void M6() throws RemoteException {
        e2(11, L0());
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final c.a.b.b.e.c Q4() throws RemoteException {
        Parcel parcelB2 = b2(1, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final String R0() throws RemoteException {
        Parcel parcelB2 = b2(35, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void R2(b1 b1Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, b1Var);
        e2(19, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void S0(oy2 oy2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, oy2Var);
        e2(36, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T(boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.a(parcelL0, z);
        e2(34, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T4(xx2 xx2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, xx2Var);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void V1(py2 py2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, py2Var);
        e2(8, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void W5(m mVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, mVar);
        e2(29, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean Y() throws RemoteException {
        Parcel parcelB2 = b2(23, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void a6(vy2 vy2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, vy2Var);
        e2(21, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void b4(sx2 sx2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, sx2Var);
        e2(20, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void destroy() throws RemoteException {
        e2(2, L0());
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final String e() throws RemoteException {
        Parcel parcelB2 = b2(18, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean f5(jw2 jw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, jw2Var);
        Parcel parcelB2 = b2(4, parcelL0);
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void g3(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(38, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final uz2 getVideoController() throws RemoteException {
        uz2 wz2Var;
        Parcel parcelB2 = b2(26, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            wz2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            wz2Var = iInterfaceQueryLocalInterface instanceof uz2 ? (uz2) iInterfaceQueryLocalInterface : new wz2(strongBinder);
        }
        parcelB2.recycle();
        return wz2Var;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void l8(vw2 vw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, vw2Var);
        e2(39, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void m0(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(25, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void m3(boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.a(parcelL0, z);
        e2(22, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final tz2 o() throws RemoteException {
        tz2 vz2Var;
        Parcel parcelB2 = b2(41, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            vz2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            vz2Var = iInterfaceQueryLocalInterface instanceof tz2 ? (tz2) iInterfaceQueryLocalInterface : new vz2(strongBinder);
        }
        parcelB2.recycle();
        return vz2Var;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void q0(oz2 oz2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, oz2Var);
        e2(42, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final qw2 q8() throws RemoteException {
        Parcel parcelB2 = b2(12, L0());
        qw2 qw2Var = (qw2) kh2.b(parcelB2, qw2.CREATOR);
        parcelB2.recycle();
        return qw2Var;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void showInterstitial() throws RemoteException {
        e2(9, L0());
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void t() throws RemoteException {
        e2(5, L0());
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean t0() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void v2(ht2 ht2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, ht2Var);
        e2(40, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final xx2 z5() throws RemoteException {
        xx2 zx2Var;
        Parcel parcelB2 = b2(33, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            zx2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zx2Var = iInterfaceQueryLocalInterface instanceof xx2 ? (xx2) iInterfaceQueryLocalInterface : new zx2(strongBinder);
        }
        parcelB2.recycle();
        return zx2Var;
    }
}
