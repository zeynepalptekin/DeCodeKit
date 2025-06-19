package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.pw1;

/* loaded from: classes.dex */
final class ly1 extends pw1.i<Void> implements Runnable {
    private final Runnable k;

    public ly1(Runnable runnable) {
        this.k = (Runnable) bv1.b(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.k.run();
        } catch (Throwable th) {
            j(th);
            throw fv1.f(th);
        }
    }
}
