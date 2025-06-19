package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ga0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class ck1<R extends ga0<? extends e70>> {

    /* renamed from: a, reason: collision with root package name */
    private final qo1 f2982a;

    /* renamed from: b, reason: collision with root package name */
    private final hk1 f2983b;

    /* renamed from: c, reason: collision with root package name */
    private final kk1<R> f2984c;
    private final Executor d;
    private gk1 e;

    public ck1(qo1 qo1Var, hk1 hk1Var, kk1<R> kk1Var, Executor executor) {
        this.f2982a = qo1Var;
        this.f2983b = hk1Var;
        this.f2984c = kk1Var;
        this.d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final bp1 d() {
        an1 an1VarD = this.f2984c.a(this.f2983b).d().d();
        return this.f2982a.c(an1VarD.d, an1VarD.f, an1VarD.j);
    }

    public final dy1<gk1> c() {
        dy1 dy1VarE;
        gk1 gk1Var = this.e;
        if (gk1Var != null) {
            return qx1.g(gk1Var);
        }
        if (f2.f3360a.a().booleanValue()) {
            dy1VarE = lx1.H(this.f2984c.a(this.f2983b).g(new sj1(this.f2982a.a().m)).d().b().c(this.f2982a.a())).D(new dk1(this), this.d).E(dy0.class, new ek1(this), this.d);
        } else {
            gk1 gk1Var2 = new gk1(null, d(), null);
            this.e = gk1Var2;
            dy1VarE = qx1.g(gk1Var2);
        }
        return qx1.i(dy1VarE, bk1.f2842a, this.d);
    }
}
