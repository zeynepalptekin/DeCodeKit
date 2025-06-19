package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class y4 extends Thread {
    private final Object d;
    private final BlockingQueue<z4<?>> e;

    @androidx.annotation.u("threadLifeCycleLock")
    private boolean f = false;
    private final /* synthetic */ u4 g;

    public y4(u4 u4Var, String str, BlockingQueue<z4<?>> blockingQueue) {
        this.g = u4Var;
        com.google.android.gms.common.internal.r.k(str);
        com.google.android.gms.common.internal.r.k(blockingQueue);
        this.d = new Object();
        this.e = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.g.B().I().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void c() {
        synchronized (this.g.i) {
            if (!this.f) {
                this.g.j.release();
                this.g.i.notifyAll();
                if (this == this.g.f6532c) {
                    u4.q(this.g, null);
                } else if (this == this.g.d) {
                    u4.w(this.g, null);
                } else {
                    this.g.B().E().a("Current scheduler thread is neither worker nor network");
                }
                this.f = true;
            }
        }
    }

    public final void a() {
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.g.j.acquire();
                z = true;
            } catch (InterruptedException e) {
                b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                z4<?> z4VarPoll = this.e.poll();
                if (z4VarPoll == null) {
                    synchronized (this.d) {
                        if (this.e.peek() == null && !this.g.k) {
                            try {
                                this.d.wait(30000L);
                            } catch (InterruptedException e2) {
                                b(e2);
                            }
                        }
                    }
                    synchronized (this.g.i) {
                        if (this.e.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(z4VarPoll.e ? threadPriority : 10);
                    z4VarPoll.run();
                }
            }
            if (this.g.j().p(u.s0)) {
                c();
            }
        } finally {
            c();
        }
    }
}
