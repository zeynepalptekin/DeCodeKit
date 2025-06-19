package com.google.android.gms.common.util.f0;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f2572a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2573b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreadFactory f2574c;

    @com.google.android.gms.common.annotation.a
    public b(@RecentlyNonNull String str) {
        this(str, 0);
    }

    private b(String str, int r2) {
        this.f2574c = Executors.defaultThreadFactory();
        this.f2572a = (String) r.l(str, "Name must not be null");
        this.f2573b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    @RecentlyNonNull
    public Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread threadNewThread = this.f2574c.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f2572a);
        return threadNewThread;
    }
}
