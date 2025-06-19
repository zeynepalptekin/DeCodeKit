package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class qw1 extends AbstractExecutorService implements cy1 {
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final <T> dy1<T> submit(Callable<T> callable) {
        return (dy1) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final dy1<?> submit(Runnable runnable) {
        return (dy1) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return ry1.I(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return ry1.J(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable, @NullableDecl Object obj) {
        return (dy1) super.submit(runnable, obj);
    }
}
