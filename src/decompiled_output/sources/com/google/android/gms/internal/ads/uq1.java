package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class uq1<O> {

    /* renamed from: a, reason: collision with root package name */
    private final E f5583a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final String f5584b;

    /* renamed from: c, reason: collision with root package name */
    private final dy1<?> f5585c;
    private final List<dy1<?>> d;
    private final dy1<O> e;
    final /* synthetic */ nq1 f;

    private uq1(nq1 nq1Var, E e, String str, dy1<?> dy1Var, List<dy1<?>> list, dy1<O> dy1Var2) {
        this.f = nq1Var;
        this.f5583a = e;
        this.f5584b = str;
        this.f5585c = dy1Var;
        this.d = list;
        this.e = dy1Var2;
    }

    private final <O2> uq1<O2> c(ax1<O, O2> ax1Var, Executor executor) {
        return new uq1<>(this.f, this.f5583a, this.f5584b, this.f5585c, this.d, qx1.j(this.e, ax1Var, executor));
    }

    public final uq1<O> a(long j, TimeUnit timeUnit) {
        nq1 nq1Var = this.f;
        return new uq1<>(nq1Var, this.f5583a, this.f5584b, this.f5585c, this.d, qx1.d(this.e, j, timeUnit, nq1Var.f4590b));
    }

    public final <O2> uq1<O2> b(ax1<O, O2> ax1Var) {
        return c(ax1Var, this.f.f4589a);
    }

    public final <T extends Throwable> uq1<O> d(Class<T> cls, final iq1<T, O> iq1Var) {
        return e(cls, new ax1(iq1Var) { // from class: com.google.android.gms.internal.ads.vq1

            /* renamed from: a, reason: collision with root package name */
            private final iq1 f5721a;

            {
                this.f5721a = iq1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return qx1.g(this.f5721a.a((Throwable) obj));
            }
        });
    }

    public final <T extends Throwable> uq1<O> e(Class<T> cls, ax1<T, O> ax1Var) {
        nq1 nq1Var = this.f;
        return new uq1<>(nq1Var, this.f5583a, this.f5584b, this.f5585c, this.d, qx1.k(this.e, cls, ax1Var, nq1Var.f4589a));
    }

    public final kq1<E, O> f() {
        E e = this.f5583a;
        String strH = this.f5584b;
        if (strH == null) {
            strH = this.f.h(e);
        }
        final kq1<E, O> kq1Var = new kq1<>(e, strH, this.e);
        this.f.f4591c.t0(kq1Var);
        this.f5585c.e(new Runnable(this, kq1Var) { // from class: com.google.android.gms.internal.ads.yq1
            private final uq1 d;
            private final kq1 e;

            {
                this.d = this;
                this.e = kq1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                uq1 uq1Var = this.d;
                uq1Var.f.f4591c.g0(this.e);
            }
        }, cs.f);
        qx1.f(kq1Var, new xq1(this, kq1Var), cs.f);
        return kq1Var;
    }

    public final <O2> uq1<O2> g(final iq1<O, O2> iq1Var) {
        return b(new ax1(iq1Var) { // from class: com.google.android.gms.internal.ads.sq1

            /* renamed from: a, reason: collision with root package name */
            private final iq1 f5292a;

            {
                this.f5292a = iq1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return qx1.g(this.f5292a.a(obj));
            }
        });
    }

    public final <O2> uq1<O2> h(final dy1<O2> dy1Var) {
        return c(new ax1(dy1Var) { // from class: com.google.android.gms.internal.ads.wq1

            /* renamed from: a, reason: collision with root package name */
            private final dy1 f5877a;

            {
                this.f5877a = dy1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f5877a;
            }
        }, cs.f);
    }

    public final uq1<O> i(String str) {
        return new uq1<>(this.f, this.f5583a, str, this.f5585c, this.d, this.e);
    }

    public final uq1<O> j(E e) {
        return this.f.b(e, f());
    }
}
