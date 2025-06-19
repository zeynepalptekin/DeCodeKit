package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ak extends ih2 implements yj {
    ak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final Bundle A() throws RemoteException {
        Parcel parcelB2 = b2(15, L0());
        Bundle bundle = (Bundle) kh2.b(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void D() throws RemoteException {
        e2(7, L0());
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void H0(bk bkVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, bkVar);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final boolean L1() throws RemoteException {
        Parcel parcelB2 = b2(20, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void N7(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(11, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void S0(oy2 oy2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, oy2Var);
        e2(14, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void T(boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.a(parcelL0, z);
        e2(34, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void V2(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(10, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final boolean W() throws RemoteException {
        Parcel parcelB2 = b2(5, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void X3(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(18, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void destroy() throws RemoteException {
        e2(8, L0());
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final String e() throws RemoteException {
        Parcel parcelB2 = b2(12, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void e5(wj wjVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, wjVar);
        e2(16, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void m0(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(13, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final tz2 o() throws RemoteException {
        Parcel parcelB2 = b2(21, L0());
        tz2 tz2VarY8 = sz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return tz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void t() throws RemoteException {
        e2(6, L0());
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void t1(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(19, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void w4(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(9, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void w5(hk hkVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, hkVar);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void x4(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(17, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void y() throws RemoteException {
        e2(2, L0());
    }
}
