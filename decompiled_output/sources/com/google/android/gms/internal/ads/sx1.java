package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class sx1<V> implements Runnable {
    private final Future<V> d;
    private final rx1<? super V> e;

    sx1(Future<V> future, rx1<? super V> rx1Var) {
        this.d = future;
        this.e = rx1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Future<V> future = this.d;
        if ((future instanceof uy1) && (thA = xy1.a((uy1) future)) != null) {
            this.e.a(thA);
            return;
        }
        try {
            this.e.b(qx1.e(this.d));
        } catch (Error e) {
            e = e;
            this.e.a(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.e.a(e);
        } catch (ExecutionException e3) {
            this.e.a(e3.getCause());
        }
    }

    public final String toString() {
        return qu1.a(this).a(this.e).toString();
    }
}
