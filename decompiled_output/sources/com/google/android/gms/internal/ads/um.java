package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final /* synthetic */ class um implements dn {

    /* renamed from: a, reason: collision with root package name */
    static final dn f5548a = new um();

    private um() {
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final Object a(az azVar) throws RemoteException {
        String strU6 = azVar.u6();
        if (strU6 != null) {
            return strU6;
        }
        String strE3 = azVar.E3();
        return strE3 != null ? strE3 : "";
    }
}
