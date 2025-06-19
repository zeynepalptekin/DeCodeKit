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
public final class a4 extends ih2 implements y3 {
    a4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final k3 G() throws RemoteException {
        k3 m3Var;
        Parcel parcelB2 = b2(6, L0());
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

    @Override // com.google.android.gms.internal.ads.y3
    public final String H() throws RemoteException {
        Parcel parcelB2 = b2(10, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final c.a.b.b.e.c K() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String N() throws RemoteException {
        Parcel parcelB2 = b2(9, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final boolean Z(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        Parcel parcelB2 = b2(15, parcelL0);
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final void c0(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        e2(14, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final void destroy() throws RemoteException {
        e2(12, L0());
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String e() throws RemoteException {
        Parcel parcelB2 = b2(19, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final Bundle getExtras() throws RemoteException {
        Parcel parcelB2 = b2(11, L0());
        Bundle bundle = (Bundle) kh2.b(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final uz2 getVideoController() throws RemoteException {
        Parcel parcelB2 = b2(13, L0());
        uz2 uz2VarY8 = xz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return uz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final b3 i() throws RemoteException {
        b3 d3Var;
        Parcel parcelB2 = b2(17, L0());
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

    @Override // com.google.android.gms.internal.ads.y3
    public final String j() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String k() throws RemoteException {
        Parcel parcelB2 = b2(5, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final String l() throws RemoteException {
        Parcel parcelB2 = b2(7, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final c.a.b.b.e.c m() throws RemoteException {
        Parcel parcelB2 = b2(18, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final List n() throws RemoteException {
        Parcel parcelB2 = b2(4, L0());
        ArrayList arrayListF = kh2.f(parcelB2);
        parcelB2.recycle();
        return arrayListF;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final double v() throws RemoteException {
        Parcel parcelB2 = b2(8, L0());
        double d = parcelB2.readDouble();
        parcelB2.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final void v0(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        e2(16, parcelL0);
    }
}
