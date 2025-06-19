package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public final class m3 extends ih2 implements k3 {
    m3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final c.a.b.b.e.c J6() throws RemoteException {
        Parcel parcelB2 = b2(1, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final double Q1() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        double d = parcelB2.readDouble();
        parcelB2.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final int getHeight() throws RemoteException {
        Parcel parcelB2 = b2(5, L0());
        int r1 = parcelB2.readInt();
        parcelB2.recycle();
        return r1;
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final int getWidth() throws RemoteException {
        Parcel parcelB2 = b2(4, L0());
        int r1 = parcelB2.readInt();
        parcelB2.recycle();
        return r1;
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final Uri s1() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        Uri uri = (Uri) kh2.b(parcelB2, Uri.CREATOR);
        parcelB2.recycle();
        return uri;
    }
}
