package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class gi0 extends e70 {
    private final Context h;
    private final WeakReference<rw> i;
    private final og0 j;
    private final pj0 k;
    private final y70 l;
    private final is1 m;
    private final eb0 n;
    private boolean o;

    gi0(d70 d70Var, Context context, @Nullable rw rwVar, og0 og0Var, pj0 pj0Var, y70 y70Var, is1 is1Var, eb0 eb0Var) {
        super(d70Var);
        this.o = false;
        this.h = context;
        this.i = new WeakReference<>(rwVar);
        this.j = og0Var;
        this.k = pj0Var;
        this.l = y70Var;
        this.m = is1Var;
        this.n = eb0Var;
    }

    public final void finalize() throws Throwable {
        try {
            rw rwVar = this.i.get();
            if (((Boolean) qx2.e().c(e0.R4)).booleanValue()) {
                if (!this.o && rwVar != null) {
                    cy1 cy1Var = cs.e;
                    rwVar.getClass();
                    cy1Var.execute(fi0.a(rwVar));
                }
            } else if (rwVar != null) {
                rwVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return this.l.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.e0.h0
            com.google.android.gms.internal.ads.z r1 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r0 = r1.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L49
            com.google.android.gms.ads.internal.p.c()
            android.content.Context r0 = r4.h
            boolean r0 = com.google.android.gms.internal.ads.to.A(r0)
            if (r0 == 0) goto L49
            java.lang.String r0 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.tr.i(r0)
            com.google.android.gms.internal.ads.eb0 r0 = r4.n
            r0.k0()
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.e0.i0
            com.google.android.gms.internal.ads.z r3 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r0 = r3.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4f
            com.google.android.gms.internal.ads.is1 r0 = r4.m
            com.google.android.gms.internal.ads.wm1 r3 = r4.f3227a
            com.google.android.gms.internal.ads.um1 r3 = r3.f5858b
            com.google.android.gms.internal.ads.lm1 r3 = r3.f5551b
            java.lang.String r3 = r3.f4275b
            r0.a(r3)
            goto L4f
        L49:
            boolean r0 = r4.o
            if (r0 != 0) goto L4f
            r0 = 1
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 != 0) goto L53
            return r2
        L53:
            com.google.android.gms.internal.ads.og0 r0 = r4.j
            r0.I0()
            com.google.android.gms.internal.ads.pj0 r0 = r4.k     // Catch: com.google.android.gms.internal.ads.oj0 -> L67
            android.content.Context r3 = r4.h     // Catch: com.google.android.gms.internal.ads.oj0 -> L67
            r0.a(r5, r3)     // Catch: com.google.android.gms.internal.ads.oj0 -> L67
            com.google.android.gms.internal.ads.og0 r5 = r4.j     // Catch: com.google.android.gms.internal.ads.oj0 -> L67
            r5.H0()     // Catch: com.google.android.gms.internal.ads.oj0 -> L67
            r4.o = r1
            return r1
        L67:
            r5 = move-exception
            com.google.android.gms.internal.ads.eb0 r0 = r4.n
            r0.v0(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gi0.h(boolean):boolean");
    }
}
