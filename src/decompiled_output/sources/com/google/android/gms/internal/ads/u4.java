package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class u4 extends ih2 implements s4 {
    u4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.s4
    public final void M5(h4 h4Var) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, h4Var);
        e2(1, parcelL0);
    }
}
