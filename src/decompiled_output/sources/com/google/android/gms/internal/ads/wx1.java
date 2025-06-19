package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.pw1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
class wx1<V> implements dy1<V> {
    static final dy1<?> e = new wx1(null);
    private static final Logger f = Logger.getLogger(wx1.class.getName());

    @NullableDecl
    private final V d;

    static final class a<V> extends pw1.i<V> {
        a(Throwable th) {
            j(th);
        }
    }

    wx1(@NullableDecl V v) {
        this.d = v;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public void e(Runnable runnable, Executor executor) {
        bv1.c(runnable, "Runnable was null.");
        bv1.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.d;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        bv1.b(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(strValueOf).length());
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(strValueOf);
        sb.append("]]");
        return sb.toString();
    }
}
