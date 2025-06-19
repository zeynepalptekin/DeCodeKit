package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class tm2 extends Thread {
    private static final boolean j = qf.f4995b;
    private final BlockingQueue<b<?>> d;
    private final BlockingQueue<b<?>> e;
    private final rk2 f;
    private final l9 g;
    private volatile boolean h = false;
    private final vo2 i = new vo2(this);

    public tm2(BlockingQueue<b<?>> blockingQueue, BlockingQueue<b<?>> blockingQueue2, rk2 rk2Var, l9 l9Var) {
        this.d = blockingQueue;
        this.e = blockingQueue2;
        this.f = rk2Var;
        this.g = l9Var;
    }

    private final void a() throws InterruptedException {
        l9 l9Var;
        b<?> bVarTake = this.d.take();
        bVarTake.s("cache-queue-take");
        bVarTake.x(1);
        try {
            bVarTake.j();
            un2 un2VarF0 = this.f.F0(bVarTake.A());
            if (un2VarF0 == null) {
                bVarTake.s("cache-miss");
                if (!this.i.d(bVarTake)) {
                    this.e.put(bVarTake);
                }
                return;
            }
            if (un2VarF0.a()) {
                bVarTake.s("cache-hit-expired");
                bVarTake.m(un2VarF0);
                if (!this.i.d(bVarTake)) {
                    this.e.put(bVarTake);
                }
                return;
            }
            bVarTake.s("cache-hit");
            k8<?> k8VarN = bVarTake.n(new fz2(un2VarF0.f5560a, un2VarF0.g));
            bVarTake.s("cache-hit-parsed");
            if (!k8VarN.a()) {
                bVarTake.s("cache-parsing-failed");
                this.f.H0(bVarTake.A(), true);
                bVarTake.m(null);
                if (!this.i.d(bVarTake)) {
                    this.e.put(bVarTake);
                }
                return;
            }
            if (un2VarF0.f < System.currentTimeMillis()) {
                bVarTake.s("cache-hit-refresh-needed");
                bVarTake.m(un2VarF0);
                k8VarN.d = true;
                if (!this.i.d(bVarTake)) {
                    this.g.c(bVarTake, k8VarN, new wp2(this, bVarTake));
                }
                l9Var = this.g;
            } else {
                l9Var = this.g;
            }
            l9Var.b(bVarTake, k8VarN);
        } finally {
            bVarTake.x(2);
        }
    }

    public final void b() {
        this.h = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (j) {
            qf.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f.E0();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.h) {
                    Thread.currentThread().interrupt();
                    return;
                }
                qf.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
