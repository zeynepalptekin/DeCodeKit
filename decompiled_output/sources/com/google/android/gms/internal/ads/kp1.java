package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e70;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class kp1<AdT extends e70> {

    /* renamed from: a, reason: collision with root package name */
    private final no1 f4132a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private qp1 f4133b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private ky1<cp1<AdT>> f4134c;

    @GuardedBy("this")
    private dy1<cp1<AdT>> d;
    private final qo1 f;
    private final np1<AdT> g;

    @GuardedBy("this")
    private int e = ap1.g;
    private final rx1<cp1<AdT>> i = new lp1(this);
    private final LinkedList<qp1> h = new LinkedList<>();

    public kp1(qo1 qo1Var, no1 no1Var, np1<AdT> np1Var) {
        this.f = qo1Var;
        this.f4132a = no1Var;
        this.g = np1Var;
        this.f4132a.b(new mo1(this) { // from class: com.google.android.gms.internal.ads.mp1

            /* renamed from: a, reason: collision with root package name */
            private final kp1 f4436a;

            {
                this.f4436a = this;
            }

            @Override // com.google.android.gms.internal.ads.mo1
            public final void a() {
                this.f4436a.e();
            }
        });
    }

    private final boolean d() {
        dy1<cp1<AdT>> dy1Var = this.d;
        return dy1Var == null || dy1Var.isDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(qp1 qp1Var) {
        while (d()) {
            if (qp1Var == null && this.h.isEmpty()) {
                return;
            }
            if (qp1Var == null) {
                qp1Var = this.h.remove();
            }
            if (qp1Var.a() != null && this.f.d(qp1Var.a())) {
                this.f4133b = qp1Var.c();
                this.f4134c = ky1.C();
                dy1<cp1<AdT>> dy1VarB = this.g.b(this.f4133b);
                this.d = dy1VarB;
                qx1.f(dy1VarB, this.i, qp1Var.b());
                return;
            }
            qp1Var = null;
        }
        if (qp1Var != null) {
            this.h.add(qp1Var);
        }
    }

    final /* synthetic */ void e() {
        synchronized (this) {
            l(this.f4133b);
        }
    }

    public final void g(qp1 qp1Var) {
        this.h.add(qp1Var);
    }

    final /* synthetic */ dy1 i(cp1 cp1Var) throws Exception {
        dy1 dy1VarG;
        synchronized (this) {
            dy1VarG = qx1.g(new op1(cp1Var, this.f4133b));
        }
        return dy1VarG;
    }

    public final synchronized dy1<op1<AdT>> j(qp1 qp1Var) {
        if (d()) {
            return null;
        }
        this.e = ap1.i;
        if (this.f4133b.a() != null && qp1Var.a() != null && this.f4133b.a().equals(qp1Var.a())) {
            this.e = ap1.h;
            return qx1.j(this.f4134c, new ax1(this) { // from class: com.google.android.gms.internal.ads.jp1

                /* renamed from: a, reason: collision with root package name */
                private final kp1 f4006a;

                {
                    this.f4006a = this;
                }

                @Override // com.google.android.gms.internal.ads.ax1
                public final dy1 a(Object obj) {
                    return this.f4006a.i((cp1) obj);
                }
            }, qp1Var.b());
        }
        return null;
    }
}
