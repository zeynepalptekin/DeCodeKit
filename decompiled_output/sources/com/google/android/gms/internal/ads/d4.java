package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.d0.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d4 extends com.google.android.gms.ads.d0.i {
    private final c4 j;
    private final l3 l;
    private final c.a n;
    private final List<c.b> k = new ArrayList();
    private final com.google.android.gms.ads.z m = new com.google.android.gms.ads.z();

    public d4(c4 c4Var) {
        k3 k3VarM1;
        k3 m3Var;
        IBinder iBinder;
        this.j = c4Var;
        c3 c3Var = null;
        try {
            List listN = c4Var.n();
            if (listN != null) {
                for (Object obj : listN) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        m3Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        m3Var = iInterfaceQueryLocalInterface instanceof k3 ? (k3) iInterfaceQueryLocalInterface : new m3(iBinder);
                    }
                    if (m3Var != null) {
                        this.k.add(new l3(m3Var));
                    }
                }
            }
        } catch (RemoteException e) {
            tr.c("", e);
        }
        try {
            k3VarM1 = this.j.m1();
        } catch (RemoteException e2) {
            tr.c("", e2);
        }
        l3 l3Var = k3VarM1 != null ? new l3(k3VarM1) : null;
        this.l = l3Var;
        try {
            if (this.j.i() != null) {
                c3Var = new c3(this.j.i());
            }
        } catch (RemoteException e3) {
            tr.c("", e3);
        }
        this.n = c3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.d0.c
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final c.a.b.b.e.c d() {
        try {
            return this.j.K();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.c
    public final void a(Bundle bundle) {
        try {
            this.j.c0(bundle);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.c
    public final boolean b(Bundle bundle) {
        try {
            return this.j.Z(bundle);
        } catch (RemoteException e) {
            tr.c("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.d0.c
    public final void c(Bundle bundle) {
        try {
            this.j.v0(bundle);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.i
    public final void e() {
        try {
            this.j.destroy();
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.i
    public final c.a f() {
        return this.n;
    }

    @Override // com.google.android.gms.ads.d0.i
    public final CharSequence g() {
        try {
            return this.j.L();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.i
    public final CharSequence h() {
        try {
            return this.j.k();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.i
    public final CharSequence i() {
        try {
            return this.j.l();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.i
    public final Bundle j() {
        try {
            return this.j.getExtras();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.i
    public final CharSequence k() {
        try {
            return this.j.j();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.i
    public final List<c.b> l() {
        return this.k;
    }

    @Override // com.google.android.gms.ads.d0.i
    public final c.b m() {
        return this.l;
    }

    @Override // com.google.android.gms.ads.d0.i
    public final CharSequence n() {
        try {
            return this.j.e();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.i
    public final com.google.android.gms.ads.z o() {
        try {
            if (this.j.getVideoController() != null) {
                this.m.o(this.j.getVideoController());
            }
        } catch (RemoteException e) {
            tr.c("Exception occurred while getting video controller", e);
        }
        return this.m;
    }
}
