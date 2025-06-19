package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class ks<T> implements dy1<T> {
    private final ky1<T> d = ky1.C();

    private static boolean d(boolean z) {
        if (!z) {
            com.google.android.gms.ads.internal.p.g().h(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public final boolean a(@androidx.annotation.i0 T t) {
        return d(this.d.i(t));
    }

    public final boolean b(Throwable th) {
        return d(this.d.j(th));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.d.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public void e(Runnable runnable, Executor executor) {
        this.d.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        return this.d.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.d.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.d.isDone();
    }
}
