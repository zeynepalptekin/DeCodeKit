package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class qq0 extends e70 {
    private final Context h;
    private final WeakReference<rw> i;
    private final pj0 j;
    private final og0 k;
    private final eb0 l;
    private final qc0 m;
    private final y70 n;
    private final sk o;
    private final is1 p;
    private boolean q;

    qq0(d70 d70Var, Context context, @androidx.annotation.i0 rw rwVar, pj0 pj0Var, og0 og0Var, eb0 eb0Var, qc0 qc0Var, y70 y70Var, km1 km1Var, is1 is1Var) {
        super(d70Var);
        this.q = false;
        this.h = context;
        this.j = pj0Var;
        this.i = new WeakReference<>(rwVar);
        this.k = og0Var;
        this.l = eb0Var;
        this.m = qc0Var;
        this.n = y70Var;
        this.p = is1Var;
        this.o = new ql(km1Var.l);
    }

    public final void finalize() throws Throwable {
        try {
            rw rwVar = this.i.get();
            if (((Boolean) qx2.e().c(e0.R4)).booleanValue()) {
                if (!this.q && rwVar != null) {
                    cy1 cy1Var = cs.e;
                    rwVar.getClass();
                    cy1Var.execute(pq0.a(rwVar));
                }
            } else if (rwVar != null) {
                rwVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle g() {
        return this.m.H0();
    }

    public final boolean h() {
        return this.n.a();
    }

    public final boolean i() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context] */
    public final boolean j(boolean z, @androidx.annotation.i0 Activity activity) {
        if (((Boolean) qx2.e().c(e0.h0)).booleanValue()) {
            com.google.android.gms.ads.internal.p.c();
            if (to.A(this.h)) {
                tr.i("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.l.k0();
                if (((Boolean) qx2.e().c(e0.i0)).booleanValue()) {
                    this.p.a(this.f3227a.f5858b.f5551b.f4275b);
                }
                return false;
            }
        }
        if (this.q) {
            tr.i("The rewarded ad have been showed.");
            this.l.S(vn1.b(xn1.AD_REUSED, null, null));
            return false;
        }
        this.q = true;
        this.k.I0();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.h;
        }
        try {
            this.j.a(z, activity2);
            this.k.H0();
            return true;
        } catch (oj0 e) {
            this.l.v0(e);
            return false;
        }
    }

    public final sk k() {
        return this.o;
    }

    public final boolean l() {
        rw rwVar = this.i.get();
        return (rwVar == null || rwVar.L()) ? false : true;
    }
}
