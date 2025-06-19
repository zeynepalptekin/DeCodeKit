package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class h11 implements pj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3612a;

    /* renamed from: b, reason: collision with root package name */
    private final as f3613b;

    /* renamed from: c, reason: collision with root package name */
    private final dy1<k40> f3614c;
    private final km1 d;
    private final rw e;
    private final an1 f;

    h11(Context context, as asVar, dy1<k40> dy1Var, km1 km1Var, rw rwVar, an1 an1Var) {
        this.f3612a = context;
        this.f3613b = asVar;
        this.f3614c = dy1Var;
        this.d = km1Var;
        this.e = rwVar;
        this.f = an1Var;
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void a(boolean z, Context context) throws NumberFormatException {
        int r9;
        k40 k40Var = (k40) qx1.l(this.f3614c);
        this.e.y0(true);
        com.google.android.gms.ads.internal.i iVar = new com.google.android.gms.ads.internal.i(true, true, false, 0.0f, -1, z, this.d.J, false);
        com.google.android.gms.ads.internal.p.b();
        fj0 fj0VarJ = k40Var.j();
        rw rwVar = this.e;
        int r1 = this.d.L;
        if (r1 == -1) {
            vw2 vw2Var = this.f.j;
            if (vw2Var != null) {
                int r12 = vw2Var.d;
                if (r12 == 1) {
                    com.google.android.gms.ads.internal.p.e();
                    r9 = 7;
                } else if (r12 == 2) {
                    com.google.android.gms.ads.internal.p.e();
                    r9 = 6;
                }
            }
            tr.f("Error setting app open orientation; no targeting orientation available.");
            r1 = this.d.L;
            r9 = r1;
        } else {
            r9 = r1;
        }
        as asVar = this.f3613b;
        km1 km1Var = this.d;
        String str = km1Var.A;
        nm1 nm1Var = km1Var.r;
        com.google.android.gms.ads.internal.overlay.l.a(context, new AdOverlayInfoParcel((zv2) null, fj0VarJ, (com.google.android.gms.ads.internal.overlay.v) null, rwVar, r9, asVar, str, iVar, nm1Var.f4570b, nm1Var.f4569a), true);
    }
}
