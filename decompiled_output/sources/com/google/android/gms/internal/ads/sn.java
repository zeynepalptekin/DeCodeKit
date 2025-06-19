package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
final class sn implements Runnable {
    private final /* synthetic */ Context d;
    private final /* synthetic */ ks e;

    sn(tn tnVar, Context context, ks ksVar) {
        this.d = context;
        this.e = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.e.a(com.google.android.gms.ads.e0.a.b(this.d));
        } catch (c.a.b.b.d.g | c.a.b.b.d.h | IOException | IllegalStateException e) {
            this.e.b(e);
            tr.c("Exception while getting advertising Id info", e);
        }
    }
}
