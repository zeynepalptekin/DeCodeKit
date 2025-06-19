package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c.a.a.a;

/* loaded from: classes.dex */
final class be implements Runnable {
    private final /* synthetic */ a.EnumC0118a d;
    private final /* synthetic */ yd e;

    be(yd ydVar, a.EnumC0118a enumC0118a) {
        this.e = ydVar;
        this.d = enumC0118a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.e.f6121a.E(ke.a(this.d));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
