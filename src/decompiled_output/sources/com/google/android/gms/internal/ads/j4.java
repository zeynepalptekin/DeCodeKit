package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j4 extends ih2 implements h4 {
    j4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final List<String> D0() throws RemoteException {
        Parcel parcelB2 = b2(3, L0());
        ArrayList<String> arrayListCreateStringArrayList = parcelB2.createStringArrayList();
        parcelB2.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final k3 D6(String str) throws RemoteException {
        k3 m3Var;
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        Parcel parcelB2 = b2(2, parcelL0);
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

    @Override // com.google.android.gms.internal.ads.h4
    public final c.a.b.b.e.c K() throws RemoteException {
        Parcel parcelB2 = b2(11, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void L6(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(14, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void Q0(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final c.a.b.b.e.c S3() throws RemoteException {
        Parcel parcelB2 = b2(9, L0());
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final boolean X1() throws RemoteException {
        Parcel parcelB2 = b2(12, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final String Z0() throws RemoteException {
        Parcel parcelB2 = b2(4, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void destroy() throws RemoteException {
        e2(8, L0());
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final boolean e7() throws RemoteException {
        Parcel parcelB2 = b2(13, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void g() throws RemoteException {
        e2(6, L0());
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final boolean g8(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        Parcel parcelB2 = b2(10, parcelL0);
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final uz2 getVideoController() throws RemoteException {
        Parcel parcelB2 = b2(7, L0());
        uz2 uz2VarY8 = xz2.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return uz2VarY8;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void p5() throws RemoteException {
        e2(15, L0());
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final String z4(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        Parcel parcelB2 = b2(1, parcelL0);
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }
}
