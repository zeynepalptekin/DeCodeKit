package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e70;
import com.google.android.gms.internal.ads.ga0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rj1<R extends ga0<AdT>, AdT extends e70> implements ik1<R, vj1<AdT>> {

    /* renamed from: a, reason: collision with root package name */
    private final qo1 f5146a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5147b;

    /* renamed from: c, reason: collision with root package name */
    private rx1<Void> f5148c = new wj1(this);

    public rj1(qo1 qo1Var, Executor executor) {
        this.f5146a = qo1Var;
        this.f5147b = executor;
    }

    @Override // com.google.android.gms.internal.ads.ik1
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ik1
    public final dy1<vj1<AdT>> b(final jk1 jk1Var, final kk1<R> kk1Var) {
        return lx1.H(new ck1(this.f5146a, jk1Var.f3984b, kk1Var, this.f5147b).c()).G(new ax1(this, jk1Var, kk1Var) { // from class: com.google.android.gms.internal.ads.uj1

            /* renamed from: a, reason: collision with root package name */
            private final rj1 f5532a;

            /* renamed from: b, reason: collision with root package name */
            private final jk1 f5533b;

            /* renamed from: c, reason: collision with root package name */
            private final kk1 f5534c;

            {
                this.f5532a = this;
                this.f5533b = jk1Var;
                this.f5534c = kk1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f5532a.c(this.f5533b, this.f5534c, (gk1) obj);
            }
        }, this.f5147b).E(Exception.class, new tj1(this), this.f5147b);
    }

    final /* synthetic */ dy1 c(jk1 jk1Var, kk1 kk1Var, gk1 gk1Var) throws Exception {
        bp1 bp1Var = gk1Var.f3553b;
        wi wiVar = gk1Var.f3552a;
        cp1<?> cp1VarB = bp1Var != null ? this.f5146a.b(bp1Var) : null;
        if (bp1Var == null) {
            return qx1.g(null);
        }
        if (cp1VarB != null && wiVar != null) {
            qx1.f(((ga0) kk1Var.a(jk1Var.f3984b).d()).b().k(wiVar), this.f5148c, this.f5147b);
        }
        return qx1.g(new vj1(bp1Var, wiVar, cp1VarB));
    }
}
