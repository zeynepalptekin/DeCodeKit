package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.d0.c;
import com.google.android.gms.ads.d0.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n5 extends com.google.android.gms.ads.d0.o {

    /* renamed from: a, reason: collision with root package name */
    private final m5 f4489a;

    /* renamed from: c, reason: collision with root package name */
    private final l3 f4491c;
    private final c.a e;

    /* renamed from: b, reason: collision with root package name */
    private final List<c.b> f4490b = new ArrayList();
    private final com.google.android.gms.ads.z d = new com.google.android.gms.ads.z();
    private final List<com.google.android.gms.ads.s> f = new ArrayList();

    public n5(m5 m5Var) {
        k3 k3VarG;
        k3 m3Var;
        IBinder iBinder;
        this.f4489a = m5Var;
        c3 c3Var = null;
        try {
            List listN = m5Var.n();
            if (listN != null) {
                for (Object obj : listN) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        m3Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        m3Var = iInterfaceQueryLocalInterface instanceof k3 ? (k3) iInterfaceQueryLocalInterface : new m3(iBinder);
                    }
                    if (m3Var != null) {
                        this.f4490b.add(new l3(m3Var));
                    }
                }
            }
        } catch (RemoteException e) {
            tr.c("", e);
        }
        try {
            List listF3 = this.f4489a.f3();
            if (listF3 != null) {
                for (Object obj2 : listF3) {
                    jz2 jz2VarY8 = obj2 instanceof IBinder ? iz2.y8((IBinder) obj2) : null;
                    if (jz2VarY8 != null) {
                        this.f.add(new kz2(jz2VarY8));
                    }
                }
            }
        } catch (RemoteException e2) {
            tr.c("", e2);
        }
        try {
            k3VarG = this.f4489a.G();
        } catch (RemoteException e3) {
            tr.c("", e3);
        }
        l3 l3Var = k3VarG != null ? new l3(k3VarG) : null;
        this.f4491c = l3Var;
        try {
            if (this.f4489a.i() != null) {
                c3Var = new c3(this.f4489a.i());
            }
        } catch (RemoteException e4) {
            tr.c("", e4);
        }
        this.e = c3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.d0.o
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final c.a.b.b.e.c D() {
        try {
            return this.f4489a.K();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void A(com.google.android.gms.ads.r rVar) {
        try {
            this.f4489a.j1(new gz2(rVar));
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void B(com.google.android.gms.ads.u uVar) {
        try {
            this.f4489a.q0(new d(uVar));
        } catch (RemoteException e) {
            tr.c("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void C(o.b bVar) {
        try {
            this.f4489a.F1(new z5(bVar));
        } catch (RemoteException e) {
            tr.c("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final Object E() {
        try {
            c.a.b.b.e.c cVarM = this.f4489a.m();
            if (cVarM != null) {
                return c.a.b.b.e.e.e2(cVarM);
            }
            return null;
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void a() {
        try {
            this.f4489a.V0();
        } catch (RemoteException e) {
            tr.c("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void b() {
        try {
            this.f4489a.destroy();
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void c() {
        try {
            this.f4489a.N0();
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final c.a d() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.d0.o
    public final String e() {
        try {
            return this.f4489a.L();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final String f() {
        try {
            return this.f4489a.k();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final String g() {
        try {
            return this.f4489a.l();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final Bundle h() {
        try {
            Bundle extras = this.f4489a.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e) {
            tr.c("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.d0.o
    public final String i() {
        try {
            return this.f4489a.j();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final c.b j() {
        return this.f4491c;
    }

    @Override // com.google.android.gms.ads.d0.o
    public final List<c.b> k() {
        return this.f4490b;
    }

    @Override // com.google.android.gms.ads.d0.o
    public final com.google.android.gms.ads.o l() {
        try {
            if (this.f4489a.B1() != null) {
                return new t03(this.f4489a.B1());
            }
            return null;
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final String m() {
        try {
            return this.f4489a.e();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final List<com.google.android.gms.ads.s> n() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.d0.o
    public final String o() {
        try {
            return this.f4489a.H();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final com.google.android.gms.ads.y p() {
        tz2 tz2VarO;
        try {
            tz2VarO = this.f4489a.o();
        } catch (RemoteException e) {
            tr.c("", e);
            tz2VarO = null;
        }
        return com.google.android.gms.ads.y.d(tz2VarO);
    }

    @Override // com.google.android.gms.ads.d0.o
    public final Double q() {
        try {
            double dV = this.f4489a.v();
            if (dV == -1.0d) {
                return null;
            }
            return Double.valueOf(dV);
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final String r() {
        try {
            return this.f4489a.N();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final com.google.android.gms.ads.z s() {
        try {
            if (this.f4489a.getVideoController() != null) {
                this.d.o(this.f4489a.getVideoController());
            }
        } catch (RemoteException e) {
            tr.c("Exception occurred while getting video controller", e);
        }
        return this.d;
    }

    @Override // com.google.android.gms.ads.d0.o
    public final boolean t() {
        try {
            return this.f4489a.A1();
        } catch (RemoteException e) {
            tr.c("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final boolean u() {
        try {
            return this.f4489a.Q5();
        } catch (RemoteException e) {
            tr.c("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void v(com.google.android.gms.ads.s sVar) {
        try {
            if (!u()) {
                tr.g("Ad is not custom mute enabled");
                return;
            }
            if (sVar == null) {
                this.f4489a.n1(null);
            } else if (sVar instanceof kz2) {
                this.f4489a.n1(((kz2) sVar).a());
            } else {
                tr.g("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void w(Bundle bundle) {
        try {
            this.f4489a.c0(bundle);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void x() {
        try {
            this.f4489a.u7();
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final boolean y(Bundle bundle) {
        try {
            return this.f4489a.Z(bundle);
        } catch (RemoteException e) {
            tr.c("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.d0.o
    public final void z(Bundle bundle) {
        try {
            this.f4489a.v0(bundle);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
