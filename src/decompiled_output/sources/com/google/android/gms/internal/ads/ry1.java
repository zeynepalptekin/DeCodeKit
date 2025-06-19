package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class ry1<V> extends kx1<V> implements RunnableFuture<V> {
    private volatile yx1<?> k;

    ry1(bx1<V> bx1Var) {
        this.k = new qy1(this, bx1Var);
    }

    private ry1(Callable<V> callable) {
        this.k = new ty1(this, callable);
    }

    static <V> ry1<V> I(Runnable runnable, @NullableDecl V v) {
        return new ry1<>(Executors.callable(runnable, v));
    }

    static <V> ry1<V> J(Callable<V> callable) {
        return new ry1<>(callable);
    }

    @Override // com.google.android.gms.internal.ads.pw1
    protected final void b() {
        yx1<?> yx1Var;
        super.b();
        if (l() && (yx1Var = this.k) != null) {
            yx1Var.a();
        }
        this.k = null;
    }

    @Override // com.google.android.gms.internal.ads.pw1
    protected final String h() {
        yx1<?> yx1Var = this.k;
        if (yx1Var == null) {
            return super.h();
        }
        String strValueOf = String.valueOf(yx1Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        yx1<?> yx1Var = this.k;
        if (yx1Var != null) {
            yx1Var.run();
        }
        this.k = null;
    }
}
