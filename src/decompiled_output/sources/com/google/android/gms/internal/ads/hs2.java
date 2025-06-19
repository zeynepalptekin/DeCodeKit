package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class hs2 implements Runnable {
    private final /* synthetic */ es2 d;

    hs2(es2 es2Var) {
        this.d = es2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d.f) {
            if (this.d.g && this.d.h) {
                es2.g(this.d, false);
                tr.f("App went background");
                Iterator it = this.d.i.iterator();
                while (it.hasNext()) {
                    try {
                        ((gs2) it.next()).a(false);
                    } catch (Exception e) {
                        tr.c("", e);
                    }
                }
            } else {
                tr.f("App is still foreground");
            }
        }
    }
}
