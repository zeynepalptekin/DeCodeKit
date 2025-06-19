package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f3364a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b<?>> f3365b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<b<?>> f3366c;
    private final PriorityBlockingQueue<b<?>> d;
    private final rk2 e;
    private final ey2 f;
    private final l9 g;
    private final dx2[] h;
    private tm2 i;
    private final List<h5> j;
    private final List<i6> k;

    public f3(rk2 rk2Var, ey2 ey2Var) {
        this(rk2Var, ey2Var, 4);
    }

    private f3(rk2 rk2Var, ey2 ey2Var, int r5) {
        this(rk2Var, ey2Var, 4, new au2(new Handler(Looper.getMainLooper())));
    }

    private f3(rk2 rk2Var, ey2 ey2Var, int r3, l9 l9Var) {
        this.f3364a = new AtomicInteger();
        this.f3365b = new HashSet();
        this.f3366c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = rk2Var;
        this.f = ey2Var;
        this.h = new dx2[4];
        this.g = l9Var;
    }

    public final void a() {
        tm2 tm2Var = this.i;
        if (tm2Var != null) {
            tm2Var.b();
        }
        for (dx2 dx2Var : this.h) {
            if (dx2Var != null) {
                dx2Var.b();
            }
        }
        tm2 tm2Var2 = new tm2(this.f3366c, this.d, this.e, this.g);
        this.i = tm2Var2;
        tm2Var2.start();
        for (int r2 = 0; r2 < this.h.length; r2++) {
            dx2 dx2Var2 = new dx2(this.d, this.f, this.e, this.g);
            this.h[r2] = dx2Var2;
            dx2Var2.start();
        }
    }

    final void b(b<?> bVar, int r5) {
        synchronized (this.k) {
            Iterator<i6> it = this.k.iterator();
            while (it.hasNext()) {
                it.next().a(bVar, r5);
            }
        }
    }

    public final <T> b<T> c(b<T> bVar) {
        bVar.k(this);
        synchronized (this.f3365b) {
            this.f3365b.add(bVar);
        }
        bVar.z(this.f3364a.incrementAndGet());
        bVar.s("add-to-queue");
        b(bVar, 0);
        (!bVar.G() ? this.d : this.f3366c).add(bVar);
        return bVar;
    }

    final <T> void d(b<T> bVar) {
        synchronized (this.f3365b) {
            this.f3365b.remove(bVar);
        }
        synchronized (this.j) {
            Iterator<h5> it = this.j.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        }
        b(bVar, 5);
    }
}
