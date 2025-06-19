package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.pw1;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class xw1<OutputT> extends pw1.i<OutputT> {
    private static final a m;
    private static final Logger n = Logger.getLogger(xw1.class.getName());
    private volatile Set<Throwable> k = null;
    private volatile int l;

    static abstract class a {
        private a() {
        }

        abstract void a(xw1 xw1Var, Set<Throwable> set, Set<Throwable> set2);

        abstract int b(xw1 xw1Var);
    }

    static final class b extends a {
        private b() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.xw1.a
        final void a(xw1 xw1Var, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (xw1Var) {
                if (xw1Var.k == null) {
                    xw1Var.k = set2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.xw1.a
        final int b(xw1 xw1Var) {
            int r0;
            synchronized (xw1Var) {
                r0 = xw1.H(xw1Var);
            }
            return r0;
        }
    }

    static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReferenceFieldUpdater<xw1, Set<Throwable>> f6051a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<xw1> f6052b;

        c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f6051a = atomicReferenceFieldUpdater;
            this.f6052b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.android.gms.internal.ads.xw1.a
        final void a(xw1 xw1Var, Set<Throwable> set, Set<Throwable> set2) {
            this.f6051a.compareAndSet(xw1Var, null, set2);
        }

        @Override // com.google.android.gms.internal.ads.xw1.a
        final int b(xw1 xw1Var) {
            return this.f6052b.decrementAndGet(xw1Var);
        }
    }

    static {
        Throwable th;
        a bVar;
        try {
            bVar = new c(AtomicReferenceFieldUpdater.newUpdater(xw1.class, Set.class, "k"), AtomicIntegerFieldUpdater.newUpdater(xw1.class, "l"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new b();
        }
        m = bVar;
        if (th != null) {
            n.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    xw1(int r2) {
        this.l = r2;
    }

    static /* synthetic */ int H(xw1 xw1Var) {
        int r0 = xw1Var.l - 1;
        xw1Var.l = r0;
        return r0;
    }

    final Set<Throwable> E() {
        Set<Throwable> set = this.k;
        if (set != null) {
            return set;
        }
        Set<Throwable> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        I(setNewSetFromMap);
        m.a(this, null, setNewSetFromMap);
        return this.k;
    }

    final int F() {
        return m.b(this);
    }

    final void G() {
        this.k = null;
    }

    abstract void I(Set<Throwable> set);
}
