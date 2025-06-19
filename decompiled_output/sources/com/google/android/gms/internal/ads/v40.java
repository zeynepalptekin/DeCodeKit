package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class v40 extends e70 {

    @androidx.annotation.i0
    private final rw h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final a40 l;
    private final pj0 m;
    private boolean n;

    v40(d70 d70Var, @androidx.annotation.i0 rw rwVar, int r3, boolean z, boolean z2, a40 a40Var, pj0 pj0Var) {
        super(d70Var);
        this.n = false;
        this.h = rwVar;
        this.i = r3;
        this.j = z;
        this.k = z2;
        this.l = a40Var;
        this.m = pj0Var;
    }

    @Override // com.google.android.gms.internal.ads.e70
    public final void a() {
        super.a();
        rw rwVar = this.h;
        if (rwVar != null) {
            rwVar.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.app.Activity r6, com.google.android.gms.internal.ads.qt2 r7) throws android.os.RemoteException {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.e0.h0
            com.google.android.gms.internal.ads.z r1 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r0 = r1.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5b
            com.google.android.gms.ads.internal.p.c()
            boolean r0 = com.google.android.gms.internal.ads.to.A(r6)
            if (r0 == 0) goto L5b
            java.lang.String r0 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.tr.i(r0)
            com.google.android.gms.internal.ads.xn1 r0 = com.google.android.gms.internal.ads.xn1.APP_NOT_FOREGROUND
            r3 = 0
            com.google.android.gms.internal.ads.dw2 r0 = com.google.android.gms.internal.ads.vn1.b(r0, r3, r3)
            r7.h8(r0)
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.e0.i0
            com.google.android.gms.internal.ads.z r3 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r0 = r3.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6a
            com.google.android.gms.internal.ads.is1 r0 = new com.google.android.gms.internal.ads.is1
            android.content.Context r3 = r6.getApplicationContext()
            com.google.android.gms.internal.ads.uq r4 = com.google.android.gms.ads.internal.p.q()
            android.os.Looper r4 = r4.b()
            r0.<init>(r3, r4)
            com.google.android.gms.internal.ads.wm1 r3 = r5.f3227a
            com.google.android.gms.internal.ads.um1 r3 = r3.f5858b
            com.google.android.gms.internal.ads.lm1 r3 = r3.f5551b
            java.lang.String r3 = r3.f4275b
            r0.a(r3)
            goto L6a
        L5b:
            boolean r0 = r5.n
            if (r0 == 0) goto L64
            java.lang.String r0 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.tr.i(r0)
        L64:
            boolean r0 = r5.n
            if (r0 != 0) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            if (r0 != 0) goto L6e
            return
        L6e:
            com.google.android.gms.internal.ads.pj0 r0 = r5.m     // Catch: com.google.android.gms.internal.ads.oj0 -> L76
            r0.a(r2, r6)     // Catch: com.google.android.gms.internal.ads.oj0 -> L76
            r5.n = r1
            return
        L76:
            r6 = move-exception
            com.google.android.gms.internal.ads.dw2 r6 = com.google.android.gms.internal.ads.vn1.d(r6)
            r7.h8(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v40.g(android.app.Activity, com.google.android.gms.internal.ads.qt2):void");
    }

    public final void h(ct2 ct2Var) {
        rw rwVar = this.h;
        if (rwVar != null) {
            rwVar.I(ct2Var);
        }
    }

    public final int i() {
        return this.i;
    }

    public final void j(long j) {
        this.l.a(j);
    }
}
