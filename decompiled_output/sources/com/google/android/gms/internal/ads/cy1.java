package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface cy1 extends ExecutorService {
    <T> dy1<T> e(Callable<T> callable);

    dy1<?> g(Runnable runnable);
}
