package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class qf0 {

    /* renamed from: a, reason: collision with root package name */
    private final Set<ch0<zv2>> f5000a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<ch0<bb0>> f5001b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<ch0<tb0>> f5002c;
    private final Set<ch0<xc0>> d;
    private final Set<ch0<nc0>> e;
    private final Set<ch0<cb0>> f;
    private final Set<ch0<pb0>> g;
    private final Set<ch0<com.google.android.gms.ads.k0.a>> h;
    private final Set<ch0<com.google.android.gms.ads.c0.a>> i;
    private final Set<ch0<hd0>> j;
    private final Set<ch0<com.google.android.gms.ads.internal.overlay.p>> k;

    @androidx.annotation.i0
    private final fk1 l;
    private ab0 m;
    private g41 n;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Set<ch0<zv2>> f5003a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private Set<ch0<bb0>> f5004b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private Set<ch0<tb0>> f5005c = new HashSet();
        private Set<ch0<xc0>> d = new HashSet();
        private Set<ch0<nc0>> e = new HashSet();
        private Set<ch0<cb0>> f = new HashSet();
        private Set<ch0<com.google.android.gms.ads.k0.a>> g = new HashSet();
        private Set<ch0<com.google.android.gms.ads.c0.a>> h = new HashSet();
        private Set<ch0<pb0>> i = new HashSet();
        private Set<ch0<hd0>> j = new HashSet();
        private Set<ch0<com.google.android.gms.ads.internal.overlay.p>> k = new HashSet();
        private fk1 l;

        public final a a(com.google.android.gms.ads.c0.a aVar, Executor executor) {
            this.h.add(new ch0<>(aVar, executor));
            return this;
        }

        public final a b(com.google.android.gms.ads.internal.overlay.p pVar, Executor executor) {
            this.k.add(new ch0<>(pVar, executor));
            return this;
        }

        public final a c(com.google.android.gms.ads.k0.a aVar, Executor executor) {
            this.g.add(new ch0<>(aVar, executor));
            return this;
        }

        public final a d(bb0 bb0Var, Executor executor) {
            this.f5004b.add(new ch0<>(bb0Var, executor));
            return this;
        }

        public final a e(cb0 cb0Var, Executor executor) {
            this.f.add(new ch0<>(cb0Var, executor));
            return this;
        }

        public final a f(pb0 pb0Var, Executor executor) {
            this.i.add(new ch0<>(pb0Var, executor));
            return this;
        }

        public final a g(tb0 tb0Var, Executor executor) {
            this.f5005c.add(new ch0<>(tb0Var, executor));
            return this;
        }

        public final a h(nc0 nc0Var, Executor executor) {
            this.e.add(new ch0<>(nc0Var, executor));
            return this;
        }

        public final a i(xc0 xc0Var, Executor executor) {
            this.d.add(new ch0<>(xc0Var, executor));
            return this;
        }

        public final a j(hd0 hd0Var, Executor executor) {
            this.j.add(new ch0<>(hd0Var, executor));
            return this;
        }

        public final a k(fk1 fk1Var) {
            this.l = fk1Var;
            return this;
        }

        public final a l(zv2 zv2Var, Executor executor) {
            this.f5003a.add(new ch0<>(zv2Var, executor));
            return this;
        }

        public final a m(@androidx.annotation.i0 py2 py2Var, Executor executor) {
            if (this.h != null) {
                r71 r71Var = new r71();
                r71Var.b(py2Var);
                this.h.add(new ch0<>(r71Var, executor));
            }
            return this;
        }

        public final qf0 o() {
            return new qf0(this);
        }
    }

    private qf0(a aVar) {
        this.f5000a = aVar.f5003a;
        this.f5002c = aVar.f5005c;
        this.d = aVar.d;
        this.f5001b = aVar.f5004b;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.i;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.j;
        this.l = aVar.l;
        this.k = aVar.k;
    }

    public final g41 a(com.google.android.gms.common.util.g gVar, i41 i41Var, x01 x01Var) {
        if (this.n == null) {
            this.n = new g41(gVar, i41Var, x01Var);
        }
        return this.n;
    }

    public final Set<ch0<bb0>> b() {
        return this.f5001b;
    }

    public final Set<ch0<nc0>> c() {
        return this.e;
    }

    public final Set<ch0<cb0>> d() {
        return this.f;
    }

    public final Set<ch0<pb0>> e() {
        return this.g;
    }

    public final Set<ch0<com.google.android.gms.ads.k0.a>> f() {
        return this.h;
    }

    public final Set<ch0<com.google.android.gms.ads.c0.a>> g() {
        return this.i;
    }

    public final Set<ch0<zv2>> h() {
        return this.f5000a;
    }

    public final Set<ch0<tb0>> i() {
        return this.f5002c;
    }

    public final Set<ch0<xc0>> j() {
        return this.d;
    }

    public final Set<ch0<hd0>> k() {
        return this.j;
    }

    public final Set<ch0<com.google.android.gms.ads.internal.overlay.p>> l() {
        return this.k;
    }

    @androidx.annotation.i0
    public final fk1 m() {
        return this.l;
    }

    public final ab0 n(Set<ch0<cb0>> set) {
        if (this.m == null) {
            this.m = new ab0(set);
        }
        return this.m;
    }
}
