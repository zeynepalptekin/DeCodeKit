package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class wz2 extends ih2 implements uz2 {
    wz2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final boolean A2() throws RemoteException {
        Parcel parcelB2 = b2(12, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void B5(boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.a(parcelL0, z);
        e2(3, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final zz2 I5() throws RemoteException {
        zz2 b03Var;
        Parcel parcelB2 = b2(11, L0());
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            b03Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            b03Var = iInterfaceQueryLocalInterface instanceof zz2 ? (zz2) iInterfaceQueryLocalInterface : new b03(strongBinder);
        }
        parcelB2.recycle();
        return b03Var;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void J4() throws RemoteException {
        e2(1, L0());
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float M() throws RemoteException {
        Parcel parcelB2 = b2(6, L0());
        float f = parcelB2.readFloat();
        parcelB2.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final int M0() throws RemoteException {
        Parcel parcelB2 = b2(5, L0());
        int r1 = parcelB2.readInt();
        parcelB2.recycle();
        return r1;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final boolean M3() throws RemoteException {
        Parcel parcelB2 = b2(4, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final boolean M4() throws RemoteException {
        Parcel parcelB2 = b2(10, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void P7(zz2 zz2Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, zz2Var);
        e2(8, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float X() throws RemoteException {
        Parcel parcelB2 = b2(7, L0());
        float f = parcelB2.readFloat();
        parcelB2.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float d0() throws RemoteException {
        Parcel parcelB2 = b2(9, L0());
        float f = parcelB2.readFloat();
        parcelB2.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void stop() throws RemoteException {
        e2(13, L0());
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void t() throws RemoteException {
        e2(2, L0());
    }
}
