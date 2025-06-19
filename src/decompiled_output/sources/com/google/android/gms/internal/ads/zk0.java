package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zk0 extends i3 {
    private final nl0 e;
    private c.a.b.b.e.c f;

    public zk0(nl0 nl0Var) {
        this.e = nl0Var;
    }

    private static float A8(c.a.b.b.e.c cVar) {
        Drawable drawable;
        if (cVar == null || (drawable = (Drawable) c.a.b.b.e.e.e2(cVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    private final float z8() {
        try {
            return this.e.n().d0();
        } catch (RemoteException e) {
            tr.c("Remote exception getting video controller aspect ratio.", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final float M() throws RemoteException {
        if (((Boolean) qx2.e().c(e0.w4)).booleanValue() && this.e.n() != null) {
            return this.e.n().M();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final c.a.b.b.e.c U7() throws RemoteException {
        c.a.b.b.e.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        k3 k3VarC = this.e.C();
        if (k3VarC == null) {
            return null;
        }
        return k3VarC.J6();
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final float X() throws RemoteException {
        if (((Boolean) qx2.e().c(e0.w4)).booleanValue() && this.e.n() != null) {
            return this.e.n().X();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final float d0() throws RemoteException {
        if (!((Boolean) qx2.e().c(e0.v4)).booleanValue()) {
            return 0.0f;
        }
        if (this.e.i() != 0.0f) {
            return this.e.i();
        }
        if (this.e.n() != null) {
            return z8();
        }
        c.a.b.b.e.c cVar = this.f;
        if (cVar != null) {
            return A8(cVar);
        }
        k3 k3VarC = this.e.C();
        if (k3VarC == null) {
            return 0.0f;
        }
        float width = (k3VarC == null || k3VarC.getWidth() == -1 || k3VarC.getHeight() == -1) ? 0.0f : k3VarC.getWidth() / k3VarC.getHeight();
        return width != 0.0f ? width : A8(k3VarC.J6());
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final boolean f1() throws RemoteException {
        return ((Boolean) qx2.e().c(e0.w4)).booleanValue() && this.e.n() != null;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final uz2 getVideoController() throws RemoteException {
        if (((Boolean) qx2.e().c(e0.w4)).booleanValue()) {
            return this.e.n();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final void v7(x4 x4Var) {
        if (((Boolean) qx2.e().c(e0.w4)).booleanValue() && (this.e.n() instanceof mx)) {
            ((mx) this.e.n()).v7(x4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.e3
    public final void w3(c.a.b.b.e.c cVar) {
        if (((Boolean) qx2.e().c(e0.k2)).booleanValue()) {
            this.f = cVar;
        }
    }
}
