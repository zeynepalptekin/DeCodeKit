package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.wx1;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class qx1 extends xx1 {
    public static <V> dy1<V> a(Throwable th) {
        bv1.b(th);
        return new wx1.a(th);
    }

    @SafeVarargs
    public static <V> vx1<V> b(dy1<? extends V>... dy1VarArr) {
        return new vx1<>(false, nv1.u(dy1VarArr), null);
    }

    public static <O> dy1<O> c(bx1<O> bx1Var, Executor executor) {
        ry1 ry1Var = new ry1(bx1Var);
        executor.execute(ry1Var);
        return ry1Var;
    }

    public static <V> dy1<V> d(dy1<V> dy1Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return dy1Var.isDone() ? dy1Var : ny1.K(dy1Var, j, timeUnit, scheduledExecutorService);
    }

    public static <V> V e(Future<V> future) throws ExecutionException {
        if (future.isDone()) {
            return (V) vy1.a(future);
        }
        throw new IllegalStateException(dv1.c("Future was expected to be done: %s", future));
    }

    public static <V> void f(dy1<V> dy1Var, rx1<? super V> rx1Var, Executor executor) {
        bv1.b(rx1Var);
        dy1Var.e(new sx1(dy1Var, rx1Var), executor);
    }

    public static <V> dy1<V> g(@NullableDecl V v) {
        return v == null ? (dy1<V>) wx1.e : new wx1(v);
    }

    @SafeVarargs
    public static <V> vx1<V> h(dy1<? extends V>... dy1VarArr) {
        return new vx1<>(true, nv1.u(dy1VarArr), null);
    }

    public static <I, O> dy1<O> i(dy1<I> dy1Var, ru1<? super I, ? extends O> ru1Var, Executor executor) {
        return sw1.J(dy1Var, ru1Var, executor);
    }

    public static <I, O> dy1<O> j(dy1<I> dy1Var, ax1<? super I, ? extends O> ax1Var, Executor executor) {
        return sw1.K(dy1Var, ax1Var, executor);
    }

    public static <V, X extends Throwable> dy1<V> k(dy1<? extends V> dy1Var, Class<X> cls, ax1<? super X, ? extends V> ax1Var, Executor executor) {
        return lw1.J(dy1Var, cls, ax1Var, executor);
    }

    public static <V> V l(Future<V> future) {
        bv1.b(future);
        try {
            return (V) vy1.a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new ix1((Error) cause);
            }
            throw new sy1(cause);
        }
    }

    public static <V> dy1<List<V>> m(Iterable<? extends dy1<? extends V>> iterable) {
        return new cx1(nv1.y(iterable), true);
    }

    public static <V> vx1<V> n(Iterable<? extends dy1<? extends V>> iterable) {
        return new vx1<>(false, nv1.y(iterable), null);
    }

    public static <V> vx1<V> o(Iterable<? extends dy1<? extends V>> iterable) {
        return new vx1<>(true, nv1.y(iterable), null);
    }
}
