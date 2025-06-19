package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class yo implements Runnable {
    private final /* synthetic */ Context d;
    private final /* synthetic */ to e;

    yo(to toVar, Context context) {
        this.e = toVar;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.d) {
            this.e.e = to.w(this.d);
            this.e.d.notifyAll();
        }
    }
}
