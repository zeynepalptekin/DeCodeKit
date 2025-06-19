package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class w7 extends p7 {
    private final /* synthetic */ ks e;

    w7(t7 t7Var, ks ksVar) {
        this.e = ksVar;
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final void g4(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.e.a(parcelFileDescriptor);
    }
}
