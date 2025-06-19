package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class sg extends ih2 implements pg {
    sg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void A6() throws RemoteException {
        e2(10, L0());
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void C0() throws RemoteException {
        e2(3, L0());
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void C1(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void N4() throws RemoteException {
        e2(2, L0());
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void U0() throws RemoteException {
        e2(7, L0());
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void Z1() throws RemoteException {
        e2(9, L0());
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void c5(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(13, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void f2(int r2, int r3, Intent intent) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        parcelL0.writeInt(r3);
        kh2.d(parcelL0, intent);
        e2(12, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final boolean k7() throws RemoteException {
        Parcel parcelB2 = b2(11, L0());
        boolean zE = kh2.e(parcelB2);
        parcelB2.recycle();
        return zE;
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void onDestroy() throws RemoteException {
        e2(8, L0());
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void onPause() throws RemoteException {
        e2(5, L0());
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void onResume() throws RemoteException {
        e2(4, L0());
    }

    @Override // com.google.android.gms.internal.ads.pg
    public final void x1(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, bundle);
        Parcel parcelB2 = b2(6, parcelL0);
        if (parcelB2.readInt() != 0) {
            bundle.readFromParcel(parcelB2);
        }
        parcelB2.recycle();
    }
}
