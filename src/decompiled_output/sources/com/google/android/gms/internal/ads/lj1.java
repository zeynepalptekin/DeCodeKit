package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cv2;
import com.google.android.gms.internal.ads.e70;
import com.google.android.gms.internal.ads.ga0;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class lj1<R extends ga0<AdT>, AdT extends e70> implements ik1<R, AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final ik1<R, AdT> f4260a;

    /* renamed from: b, reason: collision with root package name */
    private final ik1<R, vj1<AdT>> f4261b;

    /* renamed from: c, reason: collision with root package name */
    private final kp1<AdT> f4262c;

    @GuardedBy("this")
    private R d;
    private final Executor e;

    public lj1(ik1<R, AdT> ik1Var, ik1<R, vj1<AdT>> ik1Var2, kp1<AdT> kp1Var, Executor executor) {
        this.f4260a = ik1Var;
        this.f4261b = ik1Var2;
        this.f4262c = kp1Var;
        this.e = executor;
    }

    private final dy1<AdT> e(cp1<AdT> cp1Var, jk1 jk1Var, kk1<R> kk1Var) {
        final ja0<R> ja0VarA = kk1Var.a(jk1Var.f3984b);
        if (cp1Var.f3014c != null) {
            R rD = ja0VarA.d();
            if (rD.a() != null) {
                cp1Var.f3014c.e().a(rD.a());
            }
            return qx1.g(cp1Var.f3014c);
        }
        ja0VarA.j(cp1Var.f3013b);
        dy1<AdT> dy1VarB = this.f4260a.b(jk1Var, new kk1(ja0VarA) { // from class: com.google.android.gms.internal.ads.oj1

            /* renamed from: a, reason: collision with root package name */
            private final ja0 f4701a;

            {
                this.f4701a = ja0VarA;
            }

            @Override // com.google.android.gms.internal.ads.kk1
            public final ja0 a(hk1 hk1Var) {
                return this.f4701a;
            }
        });
        this.d = this.f4260a.a();
        return dy1VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.ik1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized R a() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.ik1
    public final synchronized dy1<AdT> b(final jk1 jk1Var, final kk1<R> kk1Var) {
        final pj1 pj1Var;
        an1 an1VarD = kk1Var.a(jk1Var.f3984b).d().d();
        pj1Var = new pj1(kk1Var, jk1Var, an1VarD.d, an1VarD.f, this.e, an1VarD.j, null);
        return lx1.H(this.f4261b.b(jk1Var, kk1Var)).G(new ax1(this, jk1Var, pj1Var, kk1Var) { // from class: com.google.android.gms.internal.ads.kj1

            /* renamed from: a, reason: collision with root package name */
            private final lj1 f4097a;

            /* renamed from: b, reason: collision with root package name */
            private final jk1 f4098b;

            /* renamed from: c, reason: collision with root package name */
            private final pj1 f4099c;
            private final kk1 d;

            {
                this.f4097a = this;
                this.f4098b = jk1Var;
                this.f4099c = pj1Var;
                this.d = kk1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f4097a.c(this.f4098b, this.f4099c, this.d, (vj1) obj);
            }
        }, this.e);
    }

    final /* synthetic */ dy1 c(jk1 jk1Var, pj1 pj1Var, final kk1 kk1Var, vj1 vj1Var) throws Exception {
        if (vj1Var != null) {
            pj1 pj1Var2 = new pj1(pj1Var.f4824a, pj1Var.f4825b, pj1Var.f4826c, pj1Var.d, pj1Var.e, pj1Var.f, vj1Var.f5687a);
            if (vj1Var.f5689c != null) {
                this.d = null;
                this.f4262c.g(pj1Var2);
                return e(vj1Var.f5689c, jk1Var, kk1Var);
            }
            dy1<op1<AdT>> dy1VarJ = this.f4262c.j(pj1Var2);
            if (dy1VarJ != null) {
                this.d = (R) kk1Var.a(jk1Var.f3984b).d();
                return qx1.j(dy1VarJ, new ax1(this, kk1Var) { // from class: com.google.android.gms.internal.ads.nj1

                    /* renamed from: a, reason: collision with root package name */
                    private final lj1 f4549a;

                    /* renamed from: b, reason: collision with root package name */
                    private final kk1 f4550b;

                    {
                        this.f4549a = this;
                        this.f4550b = kk1Var;
                    }

                    @Override // com.google.android.gms.internal.ads.ax1
                    public final dy1 a(Object obj) {
                        return this.f4549a.d(this.f4550b, (op1) obj);
                    }
                }, this.e);
            }
            this.f4262c.g(pj1Var2);
            jk1Var = new jk1(jk1Var.f3984b, vj1Var.f5688b);
        }
        dy1<AdT> dy1VarB = this.f4260a.b(jk1Var, kk1Var);
        this.d = this.f4260a.a();
        return dy1VarB;
    }

    final /* synthetic */ dy1 d(kk1 kk1Var, op1 op1Var) throws Exception {
        qp1 qp1Var;
        if (op1Var == null || op1Var.f4725a == null || (qp1Var = op1Var.f4726b) == null) {
            throw new uv0(xn1.INTERNAL_ERROR, "Empty prefetch");
        }
        op1Var.f4725a.f3012a.h().X((cv2.g) ((l92) cv2.g.J().v(cv2.g.a.N().x(cv2.g.c.IN_MEMORY).v(cv2.g.d.K())).P()));
        return e(op1Var.f4725a, ((pj1) qp1Var).f4825b, kk1Var);
    }
}
