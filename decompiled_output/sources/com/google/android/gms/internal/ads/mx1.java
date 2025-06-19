package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class mx1<V> extends gv1 implements Future<V> {
    protected mx1() {
    }

    public boolean cancel(boolean z) {
        return g().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return g().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return g().get(j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gv1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract Future<? extends V> g();

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return g().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return g().isDone();
    }
}
