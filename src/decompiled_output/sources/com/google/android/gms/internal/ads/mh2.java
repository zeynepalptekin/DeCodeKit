package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class mh2 extends ih2 implements lh2 {
    mh2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.lh2
    public final void F5(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.lh2
    public final void K3(c.a.b.b.e.c cVar, String str) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeString(str);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.lh2
    public final void Q6(int[] r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeIntArray(null);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.lh2
    public final void V7() throws RemoteException {
        e2(3, L0());
    }

    @Override // com.google.android.gms.internal.ads.lh2
    public final void h2(byte[] bArr) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeByteArray(bArr);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.lh2
    public final void i7(int r2) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.lh2
    public final void p8(c.a.b.b.e.c cVar, String str, String str2) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeString(str);
        parcelL0.writeString(null);
        e2(8, parcelL0);
    }
}
