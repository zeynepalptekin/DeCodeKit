package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class yx1<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable d = new zx1();
    private static final Runnable e = new zx1();
    private static final Runnable f = new zx1();

    yx1() {
    }

    final void a() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, e)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (getAndSet(d) == f) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    abstract boolean b();

    abstract T c() throws Exception;

    abstract String d();

    abstract void e(@NullableDecl T t, @NullableDecl Throwable th);

    @Override // java.lang.Runnable
    public final void run() {
        T tC;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !b();
            if (z) {
                try {
                    tC = c();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, d)) {
                        Runnable runnable = get();
                        boolean z2 = false;
                        int r9 = 0;
                        while (true) {
                            if (runnable != e && runnable != f) {
                                break;
                            }
                            r9++;
                            if (r9 > 1000) {
                                Runnable runnable2 = f;
                                if (runnable == runnable2 || compareAndSet(e, runnable2)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z2) {
                            threadCurrentThread.interrupt();
                        }
                    }
                    if (z) {
                        e(null, th);
                        return;
                    }
                    return;
                }
            } else {
                tC = null;
            }
            if (!compareAndSet(threadCurrentThread, d)) {
                Runnable runnable3 = get();
                boolean z3 = false;
                int r92 = 0;
                while (true) {
                    if (runnable3 != e && runnable3 != f) {
                        break;
                    }
                    r92++;
                    if (r92 > 1000) {
                        Runnable runnable4 = f;
                        if (runnable3 == runnable4 || compareAndSet(e, runnable4)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable3 = get();
                }
                if (z3) {
                    threadCurrentThread.interrupt();
                }
            }
            if (z) {
                e(tC, null);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == d) {
            string = "running=[DONE]";
        } else if (runnable == e) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strD = d();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(strD).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strD);
        return sb2.toString();
    }
}
