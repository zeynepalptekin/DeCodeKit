package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u4 extends y5 {
    private static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private y4 f6532c;
    private y4 d;
    private final PriorityBlockingQueue<z4<?>> e;
    private final BlockingQueue<z4<?>> f;
    private final Thread.UncaughtExceptionHandler g;
    private final Thread.UncaughtExceptionHandler h;
    private final Object i;
    private final Semaphore j;
    private volatile boolean k;

    u4(b5 b5Var) {
        super(b5Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue<>();
        this.f = new LinkedBlockingQueue();
        this.g = new w4(this, "Thread death: Uncaught exception on worker thread");
        this.h = new w4(this, "Thread death: Uncaught exception on network thread");
    }

    static /* synthetic */ y4 q(u4 u4Var, y4 y4Var) {
        u4Var.f6532c = null;
        return null;
    }

    private final void u(z4<?> z4Var) {
        synchronized (this.i) {
            this.e.add(z4Var);
            if (this.f6532c == null) {
                y4 y4Var = new y4(this, "Measurement Worker", this.e);
                this.f6532c = y4Var;
                y4Var.setUncaughtExceptionHandler(this.g);
                this.f6532c.start();
            } else {
                this.f6532c.a();
            }
        }
    }

    static /* synthetic */ y4 w(u4 u4Var, y4 y4Var) {
        u4Var.d = null;
        return null;
    }

    public final void A(Runnable runnable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.r.k(runnable);
        u(new z4<>(this, runnable, true, "Task exception on worker thread"));
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    public final void E(Runnable runnable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.r.k(runnable);
        z4<?> z4Var = new z4<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            this.f.add(z4Var);
            if (this.d == null) {
                y4 y4Var = new y4(this, "Measurement Network", this.f);
                this.d = y4Var;
                y4Var.setUncaughtExceptionHandler(this.h);
                this.d.start();
            } else {
                this.d.a();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    public final boolean I() {
        return Thread.currentThread() == this.f6532c;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final void b() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final void c() {
        if (Thread.currentThread() != this.f6532c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ u3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ ha h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ j4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ xa j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.y5
    protected final boolean o() {
        return false;
    }

    final <T> T r(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            x().v(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                y3 y3VarI = B().I();
                String strValueOf = String.valueOf(str);
                y3VarI.a(strValueOf.length() != 0 ? "Interrupted waiting for ".concat(strValueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            y3 y3VarI2 = B().I();
            String strValueOf2 = String.valueOf(str);
            y3VarI2.a(strValueOf2.length() != 0 ? "Timed out waiting for ".concat(strValueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final <V> Future<V> s(Callable<V> callable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.r.k(callable);
        z4<?> z4Var = new z4<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f6532c) {
            if (!this.e.isEmpty()) {
                B().I().a("Callable skipped the worker queue.");
            }
            z4Var.run();
        } else {
            u(z4Var);
        }
        return z4Var;
    }

    public final void v(Runnable runnable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.r.k(runnable);
        u(new z4<>(this, runnable, false, "Task exception on worker thread"));
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    public final <V> Future<V> y(Callable<V> callable) throws IllegalStateException {
        l();
        com.google.android.gms.common.internal.r.k(callable);
        z4<?> z4Var = new z4<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f6532c) {
            z4Var.run();
        } else {
            u(z4Var);
        }
        return z4Var;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
