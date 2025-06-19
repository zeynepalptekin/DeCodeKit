package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    public static final cy1 f3023a;

    /* renamed from: b, reason: collision with root package name */
    public static final cy1 f3024b;

    /* renamed from: c, reason: collision with root package name */
    public static final cy1 f3025c;
    public static final ScheduledExecutorService d;
    public static final cy1 e;
    public static final cy1 f;

    static {
        Executor executorD;
        Executor executorC;
        f3023a = a(com.google.android.gms.common.util.e.b() ? du1.a().a(b("Default"), iu1.f3869b) : new ThreadPoolExecutor(2, ActivityChooserView.f.j, 10L, TimeUnit.SECONDS, new SynchronousQueue(), b("Default")));
        if (com.google.android.gms.common.util.e.b()) {
            executorD = du1.a().d(5, b("Loader"), iu1.f3868a);
        } else {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), b("Loader"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorD = threadPoolExecutor;
        }
        f3024b = a(executorD);
        if (com.google.android.gms.common.util.e.b()) {
            executorC = du1.a().c(b("Activeview"), iu1.f3868a);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), b("Activeview"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorC = threadPoolExecutor2;
        }
        f3025c = a(executorC);
        d = new bs(3, b("Schedule"));
        e = a(new es());
        f = a(fy1.c());
    }

    private static cy1 a(Executor executor) {
        return new hs(executor, null);
    }

    private static ThreadFactory b(String str) {
        return new fs(str);
    }
}
