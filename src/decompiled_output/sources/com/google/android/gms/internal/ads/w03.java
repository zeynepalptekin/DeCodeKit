package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class w03 implements Runnable {
    private final /* synthetic */ x03 d;

    w03(x03 x03Var) {
        this.d = x03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.e.e != null) {
            try {
                this.d.e.e.E(1);
            } catch (RemoteException e) {
                tr.d("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
