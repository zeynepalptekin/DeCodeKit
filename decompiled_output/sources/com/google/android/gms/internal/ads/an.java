package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class an implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f2715a = new AtomicInteger(1);

    an(lm lmVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@androidx.annotation.h0 Runnable runnable) {
        int andIncrement = this.f2715a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
