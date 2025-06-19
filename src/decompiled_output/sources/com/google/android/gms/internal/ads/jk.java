package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class jk implements com.google.android.gms.ads.k0.c {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.h0
    private final yj f3977a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3978b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3979c = new Object();
    private final ik d = new ik(null);
    private String e;
    private String f;

    public jk(Context context, @androidx.annotation.i0 yj yjVar) {
        this.f3977a = yjVar == null ? new c() : yjVar;
        this.f3978b = context.getApplicationContext();
    }

    private final void a(String str, c03 c03Var) {
        synchronized (this.f3979c) {
            if (this.f3977a == null) {
                return;
            }
            try {
                this.f3977a.w5(ow2.a(this.f3978b, c03Var, str));
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final Bundle A() {
        synchronized (this.f3979c) {
            if (this.f3977a != null) {
                try {
                    return this.f3977a.A();
                } catch (RemoteException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void A1(com.google.android.gms.ads.k0.a aVar) {
        synchronized (this.f3979c) {
            if (this.f3977a != null) {
                try {
                    this.f3977a.S0(new kw2(aVar));
                } catch (RemoteException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void B1(com.google.android.gms.ads.k0.d dVar) {
        synchronized (this.f3979c) {
            this.d.A8(dVar);
            if (this.f3977a != null) {
                try {
                    this.f3977a.H0(this.d);
                } catch (RemoteException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final String C1() {
        String str;
        synchronized (this.f3979c) {
            str = this.e;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void D() {
        w1(null);
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void D1(Context context) {
        synchronized (this.f3979c) {
            if (this.f3977a == null) {
                return;
            }
            try {
                this.f3977a.w4(c.a.b.b.e.e.i2(context));
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final com.google.android.gms.ads.y E1() {
        tz2 tz2VarO = null;
        try {
            if (this.f3977a != null) {
                tz2VarO = this.f3977a.o();
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.y.d(tz2VarO);
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void T(boolean z) {
        synchronized (this.f3979c) {
            if (this.f3977a != null) {
                try {
                    this.f3977a.T(z);
                } catch (RemoteException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final boolean W() {
        synchronized (this.f3979c) {
            if (this.f3977a == null) {
                return false;
            }
            try {
                return this.f3977a.W();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void destroy() {
        y1(null);
    }

    @Override // com.google.android.gms.ads.k0.c
    public final String e() {
        try {
            if (this.f3977a != null) {
                return this.f3977a.e();
            }
            return null;
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void m0(String str) {
        synchronized (this.f3979c) {
            this.e = str;
            if (this.f3977a != null) {
                try {
                    this.f3977a.m0(str);
                } catch (RemoteException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void t() {
        D1(null);
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void t1(String str) {
        synchronized (this.f3979c) {
            if (this.f3977a != null) {
                try {
                    this.f3977a.t1(str);
                    this.f = str;
                } catch (RemoteException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void u1(String str, com.google.android.gms.ads.e eVar) {
        a(str, eVar.k());
    }

    @Override // com.google.android.gms.ads.k0.c
    public final com.google.android.gms.ads.k0.d v1() {
        com.google.android.gms.ads.k0.d dVarZ8;
        synchronized (this.f3979c) {
            dVarZ8 = this.d.z8();
        }
        return dVarZ8;
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void w1(Context context) {
        synchronized (this.f3979c) {
            if (this.f3977a == null) {
                return;
            }
            try {
                this.f3977a.V2(c.a.b.b.e.e.i2(context));
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final String x1() {
        String str;
        synchronized (this.f3979c) {
            str = this.f;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void y() {
        synchronized (this.f3979c) {
            if (this.f3977a == null) {
                return;
            }
            try {
                this.f3977a.y();
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void y1(Context context) {
        synchronized (this.f3979c) {
            this.d.A8(null);
            if (this.f3977a == null) {
                return;
            }
            try {
                this.f3977a.N7(c.a.b.b.e.e.i2(context));
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.k0.c
    public final void z1(String str, com.google.android.gms.ads.c0.d dVar) {
        a(str, dVar.n());
    }
}
