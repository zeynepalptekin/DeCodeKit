package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class y03 implements Runnable {
    private final /* synthetic */ z03 d;

    y03(z03 z03Var) {
        this.d = z03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.e != null) {
            try {
                this.d.e.E(1);
            } catch (RemoteException e) {
                tr.d("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
