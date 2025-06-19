package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class cz1 implements Runnable {
    private final /* synthetic */ Context d;

    cz1(zw1 zw1Var, Context context) {
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zw1.D.c(this.d);
        } catch (Exception e) {
            zw1.F.b(2019, -1L, e);
        }
    }
}
