package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class he implements Runnable {
    private final /* synthetic */ yd d;

    he(yd ydVar) {
        this.d = ydVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.f6121a.h();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
