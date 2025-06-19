package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class r03 extends iz2 {
    private final String e;
    private final String f;

    public r03(String str, String str2) {
        this.e = str;
        this.f = str2;
    }

    @Override // com.google.android.gms.internal.ads.jz2
    public final String C() throws RemoteException {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.jz2
    public final String p2() throws RemoteException {
        return this.f;
    }
}
