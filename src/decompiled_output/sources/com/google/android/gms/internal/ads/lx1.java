package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class lx1<V> extends ux1<V> {
    lx1() {
    }

    public static <V> lx1<V> H(dy1<V> dy1Var) {
        return dy1Var instanceof lx1 ? (lx1) dy1Var : new nx1(dy1Var);
    }

    public final lx1<V> C(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (lx1) qx1.d(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> lx1<T> D(ru1<? super V, T> ru1Var, Executor executor) {
        bv1.b(ru1Var);
        uw1 uw1Var = new uw1(this, ru1Var);
        e(uw1Var, fy1.b(executor, uw1Var));
        return uw1Var;
    }

    public final <X extends Throwable> lx1<V> E(Class<X> cls, ru1<? super X, ? extends V> ru1Var, Executor executor) {
        nw1 nw1Var = new nw1(this, cls, ru1Var);
        e(nw1Var, fy1.b(executor, nw1Var));
        return nw1Var;
    }

    public final <X extends Throwable> lx1<V> F(Class<X> cls, ax1<? super X, ? extends V> ax1Var, Executor executor) {
        ow1 ow1Var = new ow1(this, cls, ax1Var);
        e(ow1Var, fy1.b(executor, ow1Var));
        return ow1Var;
    }

    public final <T> lx1<T> G(ax1<? super V, T> ax1Var, Executor executor) {
        bv1.b(executor);
        rw1 rw1Var = new rw1(this, ax1Var);
        e(rw1Var, fy1.b(executor, rw1Var));
        return rw1Var;
    }
}
