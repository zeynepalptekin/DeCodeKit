package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class kz2 implements com.google.android.gms.ads.s {

    /* renamed from: a, reason: collision with root package name */
    private final String f4165a;

    /* renamed from: b, reason: collision with root package name */
    private jz2 f4166b;

    public kz2(jz2 jz2Var) {
        String strC;
        this.f4166b = jz2Var;
        try {
            strC = jz2Var.C();
        } catch (RemoteException e) {
            tr.c("", e);
            strC = null;
        }
        this.f4165a = strC;
    }

    @Override // com.google.android.gms.ads.s
    public final String C() {
        return this.f4165a;
    }

    public final jz2 a() {
        return this.f4166b;
    }

    public final String toString() {
        return this.f4165a;
    }
}
