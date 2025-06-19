package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class nf2 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f4532a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f4533b = new AtomicInteger(1);

    nf2() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f4532a.newThread(runnable);
        int andIncrement = this.f4533b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        threadNewThread.setName(sb.toString());
        return threadNewThread;
    }
}
