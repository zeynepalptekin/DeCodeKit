package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o5 extends ih2 implements m5 {
    o5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final boolean A1() throws RemoteException {
        Parcel parcelB2 = b2(30, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final e3 B1() throws RemoteException {
        e3 h3Var;
        Parcel parcelB2 = b2(29, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            h3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            h3Var = iInterfaceQueryLocalInterface instanceof e3 ? (e3) iInterfaceQueryLocalInterface : new h3(strongBinder);
        }
        parcelB2.recycle();
        return h3Var;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void F1(g5 g5Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, g5Var);
        e2(21, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final k3 G() throws RemoteException {
        k3 m3Var;
        Parcel parcelB2 = b2(5, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            m3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            m3Var = iInterfaceQueryLocalInterface instanceof k3 ? (k3) iInterfaceQueryLocalInterface : new m3(strongBinder);
        }
        parcelB2.recycle();
        return m3Var;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String H() throws RemoteException {
        Parcel parcelB2 = b2(10, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final c.a.b.b.e.c K() throws RemoteException {
        Parcel parcelB2 = b2(18, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String L() throws RemoteException {
        Parcel parcelB2 = b2(7, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String N() throws RemoteException {
        Parcel parcelB2 = b2(9, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void N0() throws RemoteException {
        e2(27, L0());
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final boolean Q5() throws RemoteException {
        Parcel parcelB2 = b2(24, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void V0() throws RemoteException {
        e2(22, L0());
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final boolean Z(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        Parcel parcelB2 = b2(16, parcelL0);
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void c0(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        e2(15, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void destroy() throws RemoteException {
        e2(13, L0());
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String e() throws RemoteException {
        Parcel parcelB2 = b2(12, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final List f3() throws RemoteException {
        Parcel parcelB2 = b2(23, L0());
        ArrayList arrayListF = kh2.f(parcelB2);
        parcelB2.recycle();
        return arrayListF;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final Bundle getExtras() throws RemoteException {
        Parcel parcelB2 = b2(20, L0());
        Bundle bundle = (Bundle) kh2.b(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final uz2 getVideoController() throws RemoteException {
        Parcel parcelB2 = b2(11, L0());
        uz2 uz2VarY8 = xz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return uz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final b3 i() throws RemoteException {
        b3 d3Var;
        Parcel parcelB2 = b2(14, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            d3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            d3Var = iInterfaceQueryLocalInterface instanceof b3 ? (b3) iInterfaceQueryLocalInterface : new d3(strongBinder);
        }
        parcelB2.recycle();
        return d3Var;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String j() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void j1(ez2 ez2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, ez2Var);
        e2(26, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String k() throws RemoteException {
        Parcel parcelB2 = b2(4, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final String l() throws RemoteException {
        Parcel parcelB2 = b2(6, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final c.a.b.b.e.c m() throws RemoteException {
        Parcel parcelB2 = b2(19, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final List n() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        ArrayList arrayListF = kh2.f(parcelB2);
        parcelB2.recycle();
        return arrayListF;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void n1(jz2 jz2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, jz2Var);
        e2(25, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final tz2 o() throws RemoteException {
        Parcel parcelB2 = b2(31, L0());
        tz2 tz2VarY8 = sz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return tz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void q0(oz2 oz2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, oz2Var);
        e2(32, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void u7() throws RemoteException {
        e2(28, L0());
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final double v() throws RemoteException {
        Parcel parcelB2 = b2(8, L0());
        double d = parcelB2.readDouble();
        parcelB2.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void v0(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        e2(17, parcelL0);
    }
}
