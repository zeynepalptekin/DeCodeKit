package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class g13 implements Runnable {
    private final /* synthetic */ c d;

    g13(c cVar) {
        this.d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.e != null) {
            try {
                this.d.e.a1(1);
            } catch (RemoteException e) {
                tr.d("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
