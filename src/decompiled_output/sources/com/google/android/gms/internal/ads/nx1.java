package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class nx1<V> extends lx1<V> {
    private final dy1<V> k;

    nx1(dy1<V> dy1Var) {
        this.k = (dy1) bv1.b(dy1Var);
    }

    @Override // com.google.android.gms.internal.ads.pw1, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.k.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.pw1, com.google.android.gms.internal.ads.dy1
    public final void e(Runnable runnable, Executor executor) {
        this.k.e(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.pw1, java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        return this.k.get();
    }

    @Override // com.google.android.gms.internal.ads.pw1, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.k.get(j, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.pw1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.k.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.pw1, java.util.concurrent.Future
    public final boolean isDone() {
        return this.k.isDone();
    }

    @Override // com.google.android.gms.internal.ads.pw1
    public final String toString() {
        return this.k.toString();
    }
}
