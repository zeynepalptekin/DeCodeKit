package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zy2 extends ih2 implements xy2 {
    zy2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void E0() throws RemoteException {
        e2(1, L0());
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void F6(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void G4(d8 d8Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, d8Var);
        e2(12, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void L4(boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.a(parcelL0, z);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final float M2() throws RemoteException {
        Parcel parcelB2 = b2(7, L0());
        float f = parcelB2.readFloat();
        parcelB2.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final boolean R7() throws RemoteException {
        Parcel parcelB2 = b2(8, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void S1(qc qcVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, qcVar);
        e2(11, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void T1(c.a.b.b.e.c cVar, String str) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeString(str);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void b5(float f) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeFloat(f);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void c4() throws RemoteException {
        e2(15, L0());
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final List<a8> g6() throws RemoteException {
        Parcel parcelB2 = b2(13, L0());
        ArrayList arrayListCreateTypedArrayList = parcelB2.createTypedArrayList(a8.CREATOR);
        parcelB2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final String i8() throws RemoteException {
        Parcel parcelB2 = b2(9, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void t7(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(10, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void u8(String str, c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        kh2.c(parcelL0, cVar);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void w2(g gVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, gVar);
        e2(14, parcelL0);
    }
}
