package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fd extends ih2 implements dd {
    fd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final k3 G() throws RemoteException {
        Parcel parcelB2 = b2(5, L0());
        k3 k3VarY8 = j3.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return k3VarY8;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String H() throws RemoteException {
        Parcel parcelB2 = b2(9, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String N() throws RemoteException {
        Parcel parcelB2 = b2(8, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final c.a.b.b.e.c V() throws RemoteException {
        Parcel parcelB2 = b2(20, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void b0(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(16, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void d1(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(12, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void g() throws RemoteException {
        e2(10, L0());
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final Bundle getExtras() throws RemoteException {
        Parcel parcelB2 = b2(15, L0());
        Bundle bundle = (Bundle) kh2.b(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final uz2 getVideoController() throws RemoteException {
        Parcel parcelB2 = b2(17, L0());
        uz2 uz2VarY8 = xz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return uz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final c.a.b.b.e.c h0() throws RemoteException {
        Parcel parcelB2 = b2(18, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final b3 i() throws RemoteException {
        Parcel parcelB2 = b2(19, L0());
        b3 b3VarY8 = a3.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return b3VarY8;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String j() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String k() throws RemoteException {
        Parcel parcelB2 = b2(4, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final String l() throws RemoteException {
        Parcel parcelB2 = b2(6, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final c.a.b.b.e.c m() throws RemoteException {
        Parcel parcelB2 = b2(21, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final List n() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        ArrayList arrayListF = kh2.f(parcelB2);
        parcelB2.recycle();
        return arrayListF;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void r0(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(11, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final double v() throws RemoteException {
        Parcel parcelB2 = b2(7, L0());
        double d = parcelB2.readDouble();
        parcelB2.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final boolean w0() throws RemoteException {
        Parcel parcelB2 = b2(13, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final void x0(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2, c.a.b.b.e.c cVar3) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, cVar2);
        kh2.c(parcelL0, cVar3);
        e2(22, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.dd
    public final boolean z0() throws RemoteException {
        Parcel parcelB2 = b2(14, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }
}
