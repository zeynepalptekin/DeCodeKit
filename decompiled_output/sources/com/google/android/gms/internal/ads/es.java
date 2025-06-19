package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class es implements Executor {
    private final Handler d = new no(Looper.getMainLooper());

    es() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.d.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.p.c();
            to.n(com.google.android.gms.ads.internal.p.g().a(), th);
            throw th;
        }
    }
}
