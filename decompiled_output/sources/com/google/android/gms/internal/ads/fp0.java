package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;

/* loaded from: classes.dex */
public final class fp0 extends o8 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, s2 {
    private View e;
    private uz2 f;
    private bl0 g;
    private boolean h = false;
    private boolean i = false;

    public fp0(bl0 bl0Var, nl0 nl0Var) {
        this.e = nl0Var.E();
        this.f = nl0Var.n();
        this.g = bl0Var;
        if (nl0Var.F() != null) {
            nl0Var.F().r(this);
        }
    }

    private final void A8() {
        View view;
        bl0 bl0Var = this.g;
        if (bl0Var == null || (view = this.e) == null) {
            return;
        }
        bl0Var.A(view, Collections.emptyMap(), Collections.emptyMap(), bl0.J(this.e));
    }

    private static void y8(q8 q8Var, int r1) {
        try {
            q8Var.x5(r1);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    private final void z8() {
        View view = this.e;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final e3 B1() {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        if (this.h) {
            tr.g("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        bl0 bl0Var = this.g;
        if (bl0Var == null || bl0Var.x() == null) {
            return null;
        }
        return this.g.x().b();
    }

    final /* synthetic */ void B8() {
        try {
            destroy();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void H3(c.a.b.b.e.c cVar) throws RemoteException {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        S7(cVar, new hp0(this));
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void S7(c.a.b.b.e.c cVar, q8 q8Var) throws RemoteException {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        if (this.h) {
            tr.g("Instream ad can not be shown after destroy().");
            y8(q8Var, 2);
            return;
        }
        if (this.e == null || this.f == null) {
            String str = this.e == null ? "can not get video view." : "can not get video controller.";
            tr.g(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            y8(q8Var, 0);
            return;
        }
        if (this.i) {
            tr.g("Instream ad should not be used again.");
            y8(q8Var, 1);
            return;
        }
        this.i = true;
        z8();
        ((ViewGroup) c.a.b.b.e.e.e2(cVar)).addView(this.e, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.p.z();
        ss.a(this.e, this);
        com.google.android.gms.ads.internal.p.z();
        ss.b(this.e, this);
        A8();
        try {
            q8Var.U1();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void destroy() throws RemoteException {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        z8();
        bl0 bl0Var = this.g;
        if (bl0Var != null) {
            bl0Var.a();
        }
        this.g = null;
        this.e = null;
        this.f = null;
        this.h = true;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final uz2 getVideoController() throws RemoteException {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.");
        if (!this.h) {
            return this.f;
        }
        tr.g("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final void k8() {
        to.h.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jp0
            private final fp0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.B8();
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        A8();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        A8();
    }
}
