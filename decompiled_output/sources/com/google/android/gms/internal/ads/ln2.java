package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class ln2 implements Runnable {
    private final /* synthetic */ IOException d;
    private final /* synthetic */ hn2 e;

    ln2(hn2 hn2Var, IOException iOException) {
        this.e = hn2Var;
        this.d = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.h.a(this.d);
    }
}
