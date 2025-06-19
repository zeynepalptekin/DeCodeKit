package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c80<T> {

    /* renamed from: a, reason: collision with root package name */
    private final vw0 f2940a;

    /* renamed from: b, reason: collision with root package name */
    private final fx0 f2941b;

    /* renamed from: c, reason: collision with root package name */
    private final an1 f2942c;
    private final cr1 d;
    private final i20 e;
    private final n41<T> f;
    private final ef0 g;

    @androidx.annotation.i0
    private final wm1 h;
    private final cy0 i;
    private final fa0 j;
    private final Executor k;
    private final zx0 l;
    private final x01 m;

    c80(vw0 vw0Var, fx0 fx0Var, an1 an1Var, cr1 cr1Var, i20 i20Var, n41<T> n41Var, ef0 ef0Var, @androidx.annotation.i0 wm1 wm1Var, cy0 cy0Var, fa0 fa0Var, Executor executor, zx0 zx0Var, x01 x01Var) {
        this.f2940a = vw0Var;
        this.f2941b = fx0Var;
        this.f2942c = an1Var;
        this.d = cr1Var;
        this.e = i20Var;
        this.f = n41Var;
        this.g = ef0Var;
        this.h = wm1Var;
        this.i = cy0Var;
        this.j = fa0Var;
        this.k = executor;
        this.l = zx0Var;
        this.m = x01Var;
    }

    private final dy1<wm1> e(dy1<wi> dy1Var) {
        uq1 uq1VarB;
        Object objC;
        uq1 uq1VarB2;
        rq1 rq1VarG;
        dy1<wm1> dy1VarA;
        if (this.h != null) {
            rq1VarG = this.d.g(zq1.SERVER_TRANSACTION);
            dy1VarA = qx1.g(this.h);
        } else {
            com.google.android.gms.ads.internal.p.i().l();
            if (this.f2942c.d.v == null) {
                if (((Boolean) qx2.e().c(e0.r5)).booleanValue()) {
                    uq1VarB = this.d.b(zq1.SERVER_TRANSACTION, dy1Var);
                    zx0 zx0Var = this.l;
                    zx0Var.getClass();
                    objC = f80.c(zx0Var);
                } else {
                    uq1VarB = this.d.b(zq1.SERVER_TRANSACTION, dy1Var);
                    objC = this.f2940a;
                }
                uq1VarB2 = uq1VarB.b(objC);
                return uq1VarB2.f();
            }
            rq1VarG = this.d.g(zq1.SERVER_TRANSACTION);
            dy1VarA = this.f2941b.a();
        }
        uq1VarB2 = rq1VarG.d(dy1VarA);
        return uq1VarB2.f();
    }

    public final dy1<wm1> b(@androidx.annotation.h0 wi wiVar) {
        return e(qx1.g(wiVar));
    }

    public final dy1<wi> c(final yo1 yo1Var) {
        kq1 kq1VarF = this.d.b(zq1.GET_CACHE_KEY, this.j.b()).b(new ax1(this, yo1Var) { // from class: com.google.android.gms.internal.ads.e80

            /* renamed from: a, reason: collision with root package name */
            private final c80 f3231a;

            /* renamed from: b, reason: collision with root package name */
            private final yo1 f3232b;

            {
                this.f3231a = this;
                this.f3232b = yo1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f3231a.d(this.f3232b, (wi) obj);
            }
        }).f();
        qx1.f(kq1VarF, new h80(this), this.k);
        return kq1VarF;
    }

    final /* synthetic */ dy1 d(yo1 yo1Var, wi wiVar) throws Exception {
        wiVar.m = yo1Var;
        return this.i.c(wiVar);
    }

    public final dy1<wm1> f() {
        return e(this.j.b());
    }

    public final dy1<T> g() {
        return j(f());
    }

    public final ef0 h() {
        return this.g;
    }

    public final dy1<T> i(@androidx.annotation.h0 wi wiVar) {
        return j(b(wiVar));
    }

    public final dy1<T> j(dy1<wm1> dy1Var) {
        uq1 uq1VarA;
        if (((Boolean) qx2.e().c(e0.I3)).booleanValue()) {
            uq1VarA = this.d.b(zq1.RENDERER, dy1Var).b(this.e).b(this.f);
        } else {
            uq1VarA = this.d.b(zq1.RENDERER, dy1Var).b(this.e).b(this.f).a(((Integer) qx2.e().c(e0.J3)).intValue(), TimeUnit.SECONDS);
        }
        return uq1VarA.f();
    }

    public final dy1<Void> k(wi wiVar) {
        kq1 kq1VarF = this.d.b(zq1.NOTIFY_CACHE_HIT, this.i.d(wiVar)).f();
        qx1.f(kq1VarF, new g80(this), this.k);
        return kq1VarF;
    }

    public final dw2 l(Throwable th) {
        return vn1.c(th, this.m);
    }
}
