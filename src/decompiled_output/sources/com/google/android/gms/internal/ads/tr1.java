package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public final class tr1 extends ih2 implements sr1 {
    tr1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.sr1
    public final void R4(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, cVar2);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.sr1
    public final c.a.b.b.e.c V6(String str, c.a.b.b.e.c cVar, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        kh2.c(parcelL0, cVar);
        parcelL0.writeString(str2);
        parcelL0.writeString(str3);
        parcelL0.writeString(str4);
        parcelL0.writeString(str5);
        Parcel parcelB2 = b2(9, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.sr1
    public final boolean Y4(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        Parcel parcelB2 = b2(2, parcelL0);
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.sr1
    public final void a3(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, cVar2);
        e2(8, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.sr1
    public final void d3(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.sr1
    public final void j8(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.sr1
    public final String q7() throws RemoteException {
        Parcel parcelB2 = b2(6, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }
}
