package com.google.android.gms.common.util.f0;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f2575a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2576b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f2577c;
    private final ThreadFactory d;

    @com.google.android.gms.common.annotation.a
    public c(@RecentlyNonNull String str) {
        this(str, 0);
    }

    private c(String str, int r2) {
        this.f2577c = new AtomicInteger();
        this.d = Executors.defaultThreadFactory();
        this.f2575a = (String) r.l(str, "Name must not be null");
        this.f2576b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    @RecentlyNonNull
    public Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread threadNewThread = this.d.newThread(new d(runnable, 0));
        String str = this.f2575a;
        int andIncrement = this.f2577c.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        threadNewThread.setName(sb.toString());
        return threadNewThread;
    }
}
