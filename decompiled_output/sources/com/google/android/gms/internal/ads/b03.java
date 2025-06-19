package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class b03 extends ih2 implements zz2 {
    b03(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zz2
    public final void D1() throws RemoteException {
        e2(4, L0());
    }

    @Override // com.google.android.gms.internal.ads.zz2
    public final void O0() throws RemoteException {
        e2(1, L0());
    }

    @Override // com.google.android.gms.internal.ads.zz2
    public final void c2(boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.a(parcelL0, z);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.zz2
    public final void g0() throws RemoteException {
        e2(3, L0());
    }

    @Override // com.google.android.gms.internal.ads.zz2
    public final void j0() throws RemoteException {
        e2(2, L0());
    }
}
