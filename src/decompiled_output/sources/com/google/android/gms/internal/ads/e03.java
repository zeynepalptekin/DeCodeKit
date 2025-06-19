package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e03 {

    /* renamed from: a, reason: collision with root package name */
    private final rc f3198a;

    /* renamed from: b, reason: collision with root package name */
    private final ow2 f3199b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f3200c;
    private final com.google.android.gms.ads.z d;

    @com.google.android.gms.common.util.d0
    private final tx2 e;
    private zv2 f;
    private com.google.android.gms.ads.c g;
    private com.google.android.gms.ads.f[] h;
    private com.google.android.gms.ads.c0.a i;
    private hy2 j;
    private com.google.android.gms.ads.c0.c k;
    private com.google.android.gms.ads.a0 l;
    private String m;
    private ViewGroup n;
    private int o;
    private boolean p;

    @androidx.annotation.i0
    private com.google.android.gms.ads.u q;

    public e03(ViewGroup viewGroup) {
        this(viewGroup, null, false, ow2.f4752a, 0);
    }

    public e03(ViewGroup viewGroup, int r8) {
        this(viewGroup, null, false, ow2.f4752a, r8);
    }

    public e03(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, ow2.f4752a, 0);
    }

    public e03(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int r10) {
        this(viewGroup, attributeSet, false, ow2.f4752a, r10);
    }

    @com.google.android.gms.common.util.d0
    private e03(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, ow2 ow2Var, int r12) {
        this(viewGroup, attributeSet, z, ow2Var, null, r12);
    }

    @com.google.android.gms.common.util.d0
    private e03(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, ow2 ow2Var, hy2 hy2Var, int r6) {
        qw2 qw2VarY;
        this.f3198a = new rc();
        this.d = new com.google.android.gms.ads.z();
        this.e = new i03(this);
        this.n = viewGroup;
        this.f3199b = ow2Var;
        this.j = null;
        this.f3200c = new AtomicBoolean(false);
        this.o = r6;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                xw2 xw2Var = new xw2(context, attributeSet);
                this.h = xw2Var.c(z);
                this.m = xw2Var.a();
                if (viewGroup.isInEditMode()) {
                    jr jrVarA = qx2.a();
                    com.google.android.gms.ads.f fVar = this.h[0];
                    int r5 = this.o;
                    if (fVar.equals(com.google.android.gms.ads.f.q)) {
                        qw2VarY = qw2.y();
                    } else {
                        qw2 qw2Var = new qw2(context, fVar);
                        qw2Var.m = D(r5);
                        qw2VarY = qw2Var;
                    }
                    jrVarA.f(viewGroup, qw2VarY, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                qx2.a().h(viewGroup, new qw2(context, com.google.android.gms.ads.f.i), e.getMessage(), e.getMessage());
            }
        }
    }

    private static boolean D(int r1) {
        return r1 == 1;
    }

    private static qw2 y(Context context, com.google.android.gms.ads.f[] fVarArr, int r6) {
        for (com.google.android.gms.ads.f fVar : fVarArr) {
            if (fVar.equals(com.google.android.gms.ads.f.q)) {
                return qw2.y();
            }
        }
        qw2 qw2Var = new qw2(context, fVarArr);
        qw2Var.m = D(r6);
        return qw2Var;
    }

    public final void A(c03 c03Var) {
        try {
            if (this.j == null) {
                if ((this.h == null || this.m == null) && this.j == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.n.getContext();
                qw2 qw2VarY = y(context, this.h, this.o);
                hy2 hy2VarB = "search_v2".equals(qw2VarY.d) ? new ix2(qx2.b(), context, qw2VarY, this.m).b(context, false) : new zw2(qx2.b(), context, qw2VarY, this.m, this.f3198a).b(context, false);
                this.j = hy2VarB;
                hy2VarB.T4(new fw2(this.e));
                if (this.f != null) {
                    this.j.b4(new bw2(this.f));
                }
                if (this.i != null) {
                    this.j.V1(new ww2(this.i));
                }
                if (this.k != null) {
                    this.j.R2(new c1(this.k));
                }
                if (this.l != null) {
                    this.j.W5(new m(this.l));
                }
                this.j.q0(new d(this.q));
                this.j.m3(this.p);
                try {
                    c.a.b.b.e.c cVarQ4 = this.j.Q4();
                    if (cVarQ4 != null) {
                        this.n.addView((View) c.a.b.b.e.e.e2(cVarQ4));
                    }
                } catch (RemoteException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
            if (this.j.f5(ow2.b(this.n.getContext(), c03Var))) {
                this.f3198a.B8(c03Var.r());
            }
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
        }
    }

    public final void B(com.google.android.gms.ads.f... fVarArr) {
        this.h = fVarArr;
        try {
            if (this.j != null) {
                this.j.I2(y(this.n.getContext(), this.h, this.o));
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        this.n.requestLayout();
    }

    public final boolean C(hy2 hy2Var) {
        if (hy2Var == null) {
            return false;
        }
        try {
            c.a.b.b.e.c cVarQ4 = hy2Var.Q4();
            if (cVarQ4 == null || ((View) c.a.b.b.e.e.e2(cVarQ4)).getParent() != null) {
                return false;
            }
            this.n.addView((View) c.a.b.b.e.e.e2(cVarQ4));
            this.j = hy2Var;
            return true;
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final uz2 E() {
        hy2 hy2Var = this.j;
        if (hy2Var == null) {
            return null;
        }
        try {
            return hy2Var.getVideoController();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void a() {
        try {
            if (this.j != null) {
                this.j.destroy();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final com.google.android.gms.ads.c b() {
        return this.g;
    }

    public final com.google.android.gms.ads.f c() {
        qw2 qw2VarQ8;
        try {
            if (this.j != null && (qw2VarQ8 = this.j.q8()) != null) {
                return qw2VarQ8.B();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        com.google.android.gms.ads.f[] fVarArr = this.h;
        if (fVarArr != null) {
            return fVarArr[0];
        }
        return null;
    }

    public final com.google.android.gms.ads.f[] d() {
        return this.h;
    }

    public final String e() {
        hy2 hy2Var;
        if (this.m == null && (hy2Var = this.j) != null) {
            try {
                this.m = hy2Var.K6();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
        return this.m;
    }

    public final com.google.android.gms.ads.c0.a f() {
        return this.i;
    }

    public final String g() {
        try {
            if (this.j != null) {
                return this.j.R0();
            }
            return null;
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final com.google.android.gms.ads.c0.c h() {
        return this.k;
    }

    @androidx.annotation.i0
    public final com.google.android.gms.ads.y i() {
        tz2 tz2VarO = null;
        try {
            if (this.j != null) {
                tz2VarO = this.j.o();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.y.d(tz2VarO);
    }

    public final com.google.android.gms.ads.z j() {
        return this.d;
    }

    public final com.google.android.gms.ads.a0 k() {
        return this.l;
    }

    public final boolean l() {
        try {
            if (this.j != null) {
                return this.j.Y();
            }
            return false;
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void m() {
        try {
            if (this.j != null) {
                this.j.t();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void n() {
        if (this.f3200c.getAndSet(true)) {
            return;
        }
        try {
            if (this.j != null) {
                this.j.M6();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void o() {
        try {
            if (this.j != null) {
                this.j.D();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void p(com.google.android.gms.ads.c cVar) {
        this.g = cVar;
        this.e.m(cVar);
    }

    public final void q(com.google.android.gms.ads.f... fVarArr) {
        if (this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        B(fVarArr);
    }

    public final void r(String str) {
        if (this.m != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.m = str;
    }

    public final void s(com.google.android.gms.ads.c0.a aVar) {
        try {
            this.i = aVar;
            if (this.j != null) {
                this.j.V1(aVar != null ? new ww2(aVar) : null);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void t(boolean z) {
        this.p = z;
        try {
            if (this.j != null) {
                this.j.m3(z);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void u(com.google.android.gms.ads.c0.c cVar) {
        this.k = cVar;
        try {
            if (this.j != null) {
                this.j.R2(cVar != null ? new c1(cVar) : null);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void v(@androidx.annotation.i0 com.google.android.gms.ads.u uVar) {
        try {
            this.q = uVar;
            if (this.j != null) {
                this.j.q0(new d(uVar));
            }
        } catch (RemoteException e) {
            tr.e("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void w(com.google.android.gms.ads.a0 a0Var) {
        this.l = a0Var;
        try {
            if (this.j != null) {
                this.j.W5(a0Var == null ? null : new m(a0Var));
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void z(zv2 zv2Var) {
        try {
            this.f = zv2Var;
            if (this.j != null) {
                this.j.b4(zv2Var != null ? new bw2(zv2Var) : null);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
