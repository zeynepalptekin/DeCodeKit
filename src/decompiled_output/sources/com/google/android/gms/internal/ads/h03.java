package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class h03 {

    /* renamed from: a, reason: collision with root package name */
    private final rc f3605a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3606b;

    /* renamed from: c, reason: collision with root package name */
    private final ow2 f3607c;
    private com.google.android.gms.ads.c d;
    private zv2 e;
    private hy2 f;
    private String g;
    private com.google.android.gms.ads.k0.a h;
    private com.google.android.gms.ads.c0.a i;
    private com.google.android.gms.ads.c0.c j;
    private com.google.android.gms.ads.k0.d k;
    private boolean l;
    private boolean m;

    @androidx.annotation.i0
    private com.google.android.gms.ads.u n;

    public h03(Context context) {
        this(context, ow2.f4752a, null);
    }

    public h03(Context context, com.google.android.gms.ads.c0.f fVar) {
        this(context, ow2.f4752a, fVar);
    }

    @com.google.android.gms.common.util.d0
    private h03(Context context, ow2 ow2Var, com.google.android.gms.ads.c0.f fVar) {
        this.f3605a = new rc();
        this.f3606b = context;
        this.f3607c = ow2Var;
    }

    private final void u(String str) {
        if (this.f != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }

    public final com.google.android.gms.ads.c a() {
        return this.d;
    }

    public final Bundle b() {
        try {
            if (this.f != null) {
                return this.f.A();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    public final String c() {
        return this.g;
    }

    public final com.google.android.gms.ads.c0.a d() {
        return this.i;
    }

    public final String e() {
        try {
            if (this.f != null) {
                return this.f.R0();
            }
            return null;
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final com.google.android.gms.ads.c0.c f() {
        return this.j;
    }

    public final com.google.android.gms.ads.y g() {
        tz2 tz2VarO = null;
        try {
            if (this.f != null) {
                tz2VarO = this.f.o();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.y.d(tz2VarO);
    }

    public final boolean h() {
        try {
            if (this.f == null) {
                return false;
            }
            return this.f.t0();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean i() {
        try {
            if (this.f == null) {
                return false;
            }
            return this.f.Y();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void j(com.google.android.gms.ads.c cVar) {
        try {
            this.d = cVar;
            if (this.f != null) {
                this.f.T4(cVar != null ? new fw2(cVar) : null);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void k(com.google.android.gms.ads.k0.a aVar) {
        try {
            this.h = aVar;
            if (this.f != null) {
                this.f.S0(aVar != null ? new kw2(aVar) : null);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void l(String str) {
        if (this.g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.g = str;
    }

    public final void m(com.google.android.gms.ads.c0.a aVar) {
        try {
            this.i = aVar;
            if (this.f != null) {
                this.f.V1(aVar != null ? new ww2(aVar) : null);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void n(boolean z) {
        try {
            this.m = z;
            if (this.f != null) {
                this.f.T(z);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void o(com.google.android.gms.ads.c0.c cVar) {
        try {
            this.j = cVar;
            if (this.f != null) {
                this.f.R2(cVar != null ? new c1(cVar) : null);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void p(@androidx.annotation.i0 com.google.android.gms.ads.u uVar) {
        try {
            this.n = uVar;
            if (this.f != null) {
                this.f.q0(new d(uVar));
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void q(com.google.android.gms.ads.k0.d dVar) {
        try {
            this.k = dVar;
            if (this.f != null) {
                this.f.H0(dVar != null ? new ik(dVar) : null);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void r() {
        try {
            u("show");
            this.f.showInterstitial();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void s(zv2 zv2Var) {
        try {
            this.e = zv2Var;
            if (this.f != null) {
                this.f.b4(zv2Var != null ? new bw2(zv2Var) : null);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void t(c03 c03Var) {
        try {
            if (this.f == null) {
                if (this.g == null) {
                    u("loadAd");
                }
                qw2 qw2VarT = this.l ? qw2.t() : new qw2();
                ax2 ax2VarB = qx2.b();
                Context context = this.f3606b;
                hy2 hy2VarB = new lx2(ax2VarB, context, qw2VarT, this.g, this.f3605a).b(context, false);
                this.f = hy2VarB;
                if (this.d != null) {
                    hy2VarB.T4(new fw2(this.d));
                }
                if (this.e != null) {
                    this.f.b4(new bw2(this.e));
                }
                if (this.h != null) {
                    this.f.S0(new kw2(this.h));
                }
                if (this.i != null) {
                    this.f.V1(new ww2(this.i));
                }
                if (this.j != null) {
                    this.f.R2(new c1(this.j));
                }
                if (this.k != null) {
                    this.f.H0(new ik(this.k));
                }
                this.f.q0(new d(this.n));
                this.f.T(this.m);
            }
            if (this.f.f5(ow2.b(this.f3606b, c03Var))) {
                this.f3605a.B8(c03Var.r());
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void v(boolean z) {
        this.l = true;
    }
}
