package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ql extends rk {
    private final String e;
    private final int f;

    public ql(@androidx.annotation.i0 com.google.android.gms.ads.l0.b bVar) {
        this(bVar != null ? bVar.q() : "", bVar != null ? bVar.R() : 1);
    }

    public ql(@androidx.annotation.i0 qk qkVar) {
        this(qkVar != null ? qkVar.d : "", qkVar != null ? qkVar.e : 1);
    }

    public ql(String str, int r2) {
        this.e = str;
        this.f = r2;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final int R() throws RemoteException {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final String q() throws RemoteException {
        return this.e;
    }
}
