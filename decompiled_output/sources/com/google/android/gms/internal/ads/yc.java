package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class yc extends ih2 implements wc {
    yc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void D1() throws RemoteException {
        e2(11, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void E(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void J0(sk skVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, skVar);
        e2(16, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void O5(bd bdVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, bdVar);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void Q(String str, String str2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        e2(9, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void U() throws RemoteException {
        e2(8, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void U3(qk qkVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, qkVar);
        e2(14, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void W0(h4 h4Var, String str) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, h4Var);
        parcelL0.writeString(str);
        e2(10, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void g0() throws RemoteException {
        e2(15, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void h() throws RemoteException {
        e2(4, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void i0(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        e2(19, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void j0() throws RemoteException {
        e2(20, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void j4(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(12, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void l6(int r2, String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        parcelL0.writeString(str);
        e2(22, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void l7(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(17, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void n7() throws RemoteException {
        e2(13, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void o5(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(21, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void p() throws RemoteException {
        e2(1, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void q1(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(23, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void q3(dw2 dw2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, dw2Var);
        e2(24, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void r() throws RemoteException {
        e2(2, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void s() throws RemoteException {
        e2(5, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void u() throws RemoteException {
        e2(6, L0());
    }

    @Override // com.google.android.gms.internal.ads.wc
    public final void y5() throws RemoteException {
        e2(18, L0());
    }
}
