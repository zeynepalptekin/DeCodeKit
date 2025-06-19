package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class kq1<E, V> implements dy1<V> {
    private final E d;
    private final String e;
    private final dy1<V> f;

    @androidx.annotation.x0(otherwise = 3)
    public kq1(E e, String str, dy1<V> dy1Var) {
        this.d = e;
        this.e = str;
        this.f = dy1Var;
    }

    public final E a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public final void e(Runnable runnable, Executor executor) {
        this.f.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        return this.f.get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f.isDone();
    }

    public final String toString() {
        String str = this.e;
        int r1 = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(r1);
        return sb.toString();
    }
}
