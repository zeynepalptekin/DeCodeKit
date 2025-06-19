package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class af extends ih2 implements ye {
    af(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void E5(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, re reVar, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        kh2.d(parcelL0, jw2Var);
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, reVar);
        kh2.c(parcelL0, wcVar);
        e2(14, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final mf I0() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        mf mfVar = (mf) kh2.b(parcelB2, mf.CREATOR);
        parcelB2.recycle();
        return mfVar;
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void I4(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeStringArray(strArr);
        parcelL0.writeTypedArray(bundleArr, 0);
        e2(11, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void R3(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(19, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void R5(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(10, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void T3(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, xe xeVar, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        kh2.d(parcelL0, jw2Var);
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, xeVar);
        kh2.c(parcelL0, wcVar);
        e2(20, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final mf b1() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        mf mfVar = (mf) kh2.b(parcelB2, mf.CREATOR);
        parcelB2.recycle();
        return mfVar;
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void f7(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, se seVar, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        kh2.d(parcelL0, jw2Var);
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, seVar);
        kh2.c(parcelL0, wcVar);
        e2(18, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final uz2 getVideoController() throws RemoteException {
        Parcel parcelB2 = b2(5, L0());
        uz2 uz2VarY8 = xz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return uz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final boolean h7(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        Parcel parcelB2 = b2(17, parcelL0);
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void i3(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, le leVar, wc wcVar, qw2 qw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        kh2.d(parcelL0, jw2Var);
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, leVar);
        kh2.c(parcelL0, wcVar);
        kh2.d(parcelL0, qw2Var);
        e2(13, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void m2(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, xe xeVar, wc wcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        kh2.d(parcelL0, jw2Var);
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, xeVar);
        kh2.c(parcelL0, wcVar);
        e2(16, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void n2(c.a.b.b.e.c cVar, String str, Bundle bundle, Bundle bundle2, qw2 qw2Var, df dfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeString(str);
        kh2.d(parcelL0, bundle);
        kh2.d(parcelL0, bundle2);
        kh2.d(parcelL0, qw2Var);
        kh2.c(parcelL0, dfVar);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final boolean x6(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        Parcel parcelB2 = b2(15, parcelL0);
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }
}
