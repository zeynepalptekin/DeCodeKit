package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.d0.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z3 extends com.google.android.gms.ads.d0.g {
    private final y3 l;
    private final l3 n;
    private final c.a p;
    private final List<c.b> m = new ArrayList();
    private final com.google.android.gms.ads.z o = new com.google.android.gms.ads.z();

    public z3(y3 y3Var) {
        k3 k3VarG;
        k3 m3Var;
        IBinder iBinder;
        this.l = y3Var;
        c3 c3Var = null;
        try {
            List listN = y3Var.n();
            if (listN != null) {
                for (Object obj : listN) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        m3Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        m3Var = iInterfaceQueryLocalInterface instanceof k3 ? (k3) iInterfaceQueryLocalInterface : new m3(iBinder);
                    }
                    if (m3Var != null) {
                        this.m.add(new l3(m3Var));
                    }
                }
            }
        } catch (RemoteException e) {
            tr.c("", e);
        }
        try {
            k3VarG = this.l.G();
        } catch (RemoteException e2) {
            tr.c("", e2);
        }
        l3 l3Var = k3VarG != null ? new l3(k3VarG) : null;
        this.n = l3Var;
        try {
            if (this.l.i() != null) {
                c3Var = new c3(this.l.i());
            }
        } catch (RemoteException e3) {
            tr.c("", e3);
        }
        this.p = c3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.d0.c
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final c.a.b.b.e.c d() {
        try {
            return this.l.K();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.c
    public final void a(Bundle bundle) {
        try {
            this.l.c0(bundle);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.c
    public final boolean b(Bundle bundle) {
        try {
            return this.l.Z(bundle);
        } catch (RemoteException e) {
            tr.c("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.d0.c
    public final void c(Bundle bundle) {
        try {
            this.l.v0(bundle);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final void e() {
        try {
            this.l.destroy();
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final c.a f() {
        return this.p;
    }

    @Override // com.google.android.gms.ads.d0.g
    public final CharSequence g() {
        try {
            return this.l.k();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final CharSequence h() {
        try {
            return this.l.l();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final Bundle i() {
        try {
            return this.l.getExtras();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final CharSequence j() {
        try {
            return this.l.j();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final c.b k() {
        return this.n;
    }

    @Override // com.google.android.gms.ads.d0.g
    public final List<c.b> l() {
        return this.m;
    }

    @Override // com.google.android.gms.ads.d0.g
    public final CharSequence m() {
        try {
            return this.l.e();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final CharSequence n() {
        try {
            return this.l.H();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final Double o() {
        try {
            double dV = this.l.v();
            if (dV == -1.0d) {
                return null;
            }
            return Double.valueOf(dV);
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final CharSequence p() {
        try {
            return this.l.N();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.g
    public final com.google.android.gms.ads.z q() {
        try {
            if (this.l.getVideoController() != null) {
                this.o.o(this.l.getVideoController());
            }
        } catch (RemoteException e) {
            tr.c("Exception occurred while getting video controller", e);
        }
        return this.o;
    }
}
