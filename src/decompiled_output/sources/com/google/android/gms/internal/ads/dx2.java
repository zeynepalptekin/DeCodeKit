package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class dx2 extends Thread {
    private final BlockingQueue<b<?>> d;
    private final ey2 e;
    private final rk2 f;
    private final l9 g;
    private volatile boolean h = false;

    public dx2(BlockingQueue<b<?>> blockingQueue, ey2 ey2Var, rk2 rk2Var, l9 l9Var) {
        this.d = blockingQueue;
        this.e = ey2Var;
        this.f = rk2Var;
        this.g = l9Var;
    }

    private final void a() throws InterruptedException {
        b<?> bVarTake = this.d.take();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        bVarTake.x(3);
        try {
            bVarTake.s("network-queue-take");
            bVarTake.j();
            TrafficStats.setThreadStatsTag(bVarTake.v());
            fz2 fz2VarA = this.e.a(bVarTake);
            bVarTake.s("network-http-complete");
            if (fz2VarA.e && bVarTake.M()) {
                bVarTake.y("not-modified");
                bVarTake.N();
                return;
            }
            k8<?> k8VarN = bVarTake.n(fz2VarA);
            bVarTake.s("network-parse-complete");
            if (bVarTake.G() && k8VarN.f4063b != null) {
                this.f.G0(bVarTake.A(), k8VarN.f4063b);
                bVarTake.s("network-cache-written");
            }
            bVarTake.J();
            this.g.b(bVarTake, k8VarN);
            bVarTake.p(k8VarN);
        } catch (Exception e) {
            qf.e(e, "Unhandled exception %s", e.toString());
            pd pdVar = new pd(e);
            pdVar.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.g.a(bVarTake, pdVar);
            bVarTake.N();
        } catch (pd e2) {
            e2.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.g.a(bVarTake, e2);
            bVarTake.N();
        } finally {
            bVarTake.x(4);
        }
    }

    public final void b() {
        this.h = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.h) {
                    Thread.currentThread().interrupt();
                    return;
                }
                qf.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
